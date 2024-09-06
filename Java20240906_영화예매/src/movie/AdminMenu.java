package movie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdminMenu extends AbstractMenu {
	
	// 싱글톤 패턴 - 객체 하나만 생성
	private static final AdminMenu instance = new AdminMenu(null);

	private static final String ADMIN_MENU_TEXT = // 메뉴 기본 문구
			"1: 영화 등록하기 \n" +
			"2: 영화 목록보기 \n" +
			"3: 영화 삭제하기 \n" +
			"b: 메인 메뉴로 이동 \n" +			
			"메뉴를 선택하세요 : ";

	private AdminMenu(Menu prevMenu) {
		super(ADMIN_MENU_TEXT, prevMenu);
	}
	
	public static AdminMenu getInstance() {
		return instance;  // AdminMenu 객체 생성 주소반환(싱글톤 패턴)
	}
	
	@Override
	public Menu next() {
		switch(sc.nextLine()) {
			case "1":
				movieRegister();
				return this;
			case "2":
				movieList();
				return this;
			case "3":
				movieDelete();
				return this;
			case "b":
				return prevMenu;
			default:
				return this;
		}
	}
		
	// 영화목록 저장할 ArrayList
	List<Movie> movies = new ArrayList<>();
	
	// 영화 등록하기
	public void movieRegister() {		
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("장르 : ");
		String genre = sc.nextLine();
						
		Movie movie = new Movie(title, genre);
		
		try {
			movie.save();
			System.out.println(">> 등록되었습니다.");
		}catch(IOException e) {
			System.out.println(">> 등록에 실패했습니다.");			
		}
	}
		
	// 영화 목록보기
	public void movieList() {
		try {
			movies = Movie.findAll();
			if(movies.size() == 0) {
				System.out.println("등록된 영화가 없습니다.");
			}else {						
				System.out.println("<<등록된 영화 목록>>");
				for(Movie movie : movies) {
					System.out.printf("%s", movie.toString());
//					System.out.printf("[%s]:%s(%s)\n", movie.getMovieCode(), movie.getTitle(), movie.getGenre());
				}
			}
		}catch (Exception e) {
				System.out.println("데이터 접근에 실패햐였습니다.");
		}
	}	
	
	// 영화 삭제하기
	public void movieDelete() {
		if(movies.size() == 0) {
			System.out.println("삭제할 영화가 없습니다.");
		}else {
			movieList();
			System.out.printf("삭제할 영화를 선택하세요 : ");
			String rm = sc.nextLine();
			
			// 삭제할 영화 목록
			List<Movie> removed = new ArrayList<Movie>();
//			for(Movie movie : movies) {		
//				if(movie.getMovieCode().equals(rm)) {
//					removed.add(movie);
//					System.out.println(">> 삭제되었습니다.");
//				}			
//			}
			movies.removeAll(removed);
		}
	}

}
