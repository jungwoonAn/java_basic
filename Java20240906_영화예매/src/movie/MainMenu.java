package movie;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AbstractMenu {
	
	// 싱글톤 패턴 - 객체 하나만 생성
	private static final MainMenu instance = new MainMenu(null);

	private static final String MAIN_MENU_TEXT = // 메뉴 기본 문구
			"1: 영화 예매하기 \n" +
			"2: 예매 확인하기 \n" +
			"3: 예매 취소하기 \n" +
			"4: 관리자 메뉴로 이동 \n" +
			"q: 종료 \n" +
			"메뉴를 선택하세요 : ";			
	
	private MainMenu(Menu prevMenu) {
		super(MAIN_MENU_TEXT, prevMenu);  // 부모 생성자 호출
	}
	
	public static MainMenu getInstance() {
		return instance;  // MainMenu 객체 생성 주소반환(싱글톤 패턴)
	}
	
	@Override
	public Menu next() {
		switch(sc.nextLine()) {
			case "1":
				movieReserve();  // 영화 예매
				return this;
			case "2":
				checkReservation();  // 예매확인
				return this;
			case "3":
				cancelReservation();  // 예매취소
				return this;
			case "4":
				if(!checkAdminPassword()) {
					System.out.println(">> 잘못된 비밀번호 입니다.");
					System.out.println(">> 다시 확인하고 입력하세요.");					
					return this;
				}else {
					AdminMenu adminmenu = AdminMenu.getInstance();
					adminmenu.setPrevMenu(this);
					return adminmenu;
				}				
			case "q":
				return prevMenu;	
			default:
				return this;
		}
	}
	
	// 관리자 비밀번호 확인
	private boolean checkAdminPassword() {
		System.out.print("관리자 비밀번호를 입력하세요 : ");
		return "1234".equals(sc.nextLine());
	}
	
	// 영화 예매
	private void movieReserve() {
		try {
			List<Movie> movies = Movie.findAll();
			for(Movie movie : movies)
				System.out.printf("%s", movie.toString());
			
			System.out.print("예매할 영화를 선택하세요 : ");
			String movieCode = sc.nextLine();
			
			// 해당 영화 정보 찾기
			Movie movie = Movie.findAll(movieCode);
			
			// 찾은 영화의 예매 현황 확인
			ArrayList<Reservation> reservations = Reservation.findMovieCode(movieCode);
		
			// 예매된 좌석 현황 확인
			Seats seats = new Seats(reservations);
			// 예매 좌석 출력
			seats.showSeats();  
			
			// 좌석 예매
			System.out.print("좌석을 선택하세요(예:E-5) : ");
			String seatName = sc.nextLine();
			seats.mark(seatName);
			
			// 예매객체 생성 및 저장
			Reservation reservation = new Reservation(movie.getMovieCode(), movie.getTitle(), seatName);
			reservation.save();
			System.out.println("예매가 완료되었습니다.");
			System.out.println(">> 예매번호 : " + reservation.getReserveCode());
			
		} catch (Exception e) {
			System.out.printf(">> 예매에 실패하였습니다 : %s\n", e.getMessage());
		}
	}

	// 예매 확인
	private void checkReservation() {
		System.out.print("예매번호를 입혁하세요 : ");
		
		try {
			Reservation reservation = Reservation.findById(sc.nextLine());
			
			if(reservation == null) {
				System.out.println(">> 예매 내역이 없습니다.");
			}else {
				System.out.println(">> [확인 완료] " + reservation);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 예매 취소
	private void cancelReservation() {
		System.out.print("취소할 예매번호를 입력하세요 : ");
		try {
			String reserveCode = sc.nextLine();
			Reservation reservation = Reservation.findById(reserveCode);
			
			if(reservation == null) {
				System.out.println(">> 취소할 예매 내역이 없습니다.");
			}else {
				Reservation.delete(reserveCode);			
				System.out.println(">> [취소 완료] " + reservation +"의 예매가 취소되었습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
