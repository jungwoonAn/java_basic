package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

public class Reservation {
	private long reserveCode;  // 예매 번호
	private long movieCode;  // 영화 코드
	private String title;  // 영화 제목
	private String seatName;  // 좌석
	
	public Reservation(Long reserveCode, long movieCode, String title, String seatName) {
		this.reserveCode = reserveCode;
		this.movieCode = movieCode;
		this.title = title;
		this.seatName = seatName;
	}	

	public Reservation(long movieCode, String title, String seatName) {
		this(Instant.now().toEpochMilli(), movieCode, title, seatName);
	}

	public String getSeatName() {
		return seatName;
	}
		
	public long getReserveCode() {
		return reserveCode;
	}

	private static final File file = new File("src/movie/reservation.txt");

	// 2-1)예매 확인
	public static Reservation findById(String reserveCode) {
		Reservation reservation = null;
		BufferedReader br = null;
		String line = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			while((line=br.readLine()) != null) {
				String[] temp = line.split(",");
				if(reserveCode.equals(temp[0])) {
					reservation = new Reservation(  // Reservation 객체 생성
							Long.parseLong(temp[0]),  // reserveCode
							Long.parseLong(temp[1]),  // moiveCode
							temp[2],                  // title
							temp[3]                   // seatName
							);
					break;                            // 파일에서 reserveCode 해당 예매변호 찾으면 종료
				}
			}
			br.close();
			return reservation;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String toString() {
//		return "영화: " + title + ", 좌석: " + seatName;
		return String.format("영화: %s, 좌석: %s", title, seatName);
	}

	// 2-2)예매 취소
	public static void delete(String reserveCode) {
		BufferedReader br = null;
		StringBuilder text = new StringBuilder();
		String line = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			while((line=br.readLine()) != null) {
				String[] temp = line.split(",");
				if(reserveCode.equals(temp[0])) {
					continue;
				}
				text.append(line + "\n");
			}
			br.close();
			
			FileWriter fw = new FileWriter(file);
			fw.write(text.toString());  // StringBuilder -> String
			
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	// 2-3)영화 예매하기
	// movieCode에 해당하는 예약 현황을 확인
	public static ArrayList<Reservation> findMovieCode(String movieCode) {
		ArrayList<Reservation> reservations = new ArrayList<Reservation>();
		
		BufferedReader br = null;
		String line = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			while((line=br.readLine()) != null) {
				String[] temp = line.split(",");
				if(movieCode.equals(temp[1])) {
					long rCode = Long.parseLong(temp[0]);
					long mCode = Long.parseLong(temp[1]);
					String title = temp[2];
					String seatName = temp[3];
					
					Reservation r = new Reservation(rCode, mCode, title, seatName);
					reservations.add(r);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return reservations;
	}

	// 예약 정보 파일에 저장
	public void save() throws IOException {
		FileWriter fw = new FileWriter(file, true);  // true -> append로 추가
		fw.write(this.toFileString() + "\n");
		fw.close();
	}

	// 파일에 추가할 포맷
	private String toFileString() {
		return String.format("%d,%d,%s,%s", reserveCode, movieCode, title, seatName);
	}
	
}
