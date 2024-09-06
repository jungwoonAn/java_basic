package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.sql.Timestamp;
//import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;

public class Movie {
//	private String movieCode;  // Timestamp로 영화 고유 번호
	private long movieCode;  // 영화 고유 번호
	private String title;  // 영화 제목
	private String genre;  // 영화 장르
	
	private static final File file = new File("src/movie/movie.txt");
	
	public Movie(long movieCode, String title, String genre) {		
		this.movieCode = movieCode;
		this.title = title;
		this.genre = genre;
	}
	
//	Timestamp now = new Timestamp(System.currentTimeMillis());
//	String nowString = new SimpleDateFormat("HHmmssSSSS").format(now);
	
	public Movie(String title, String genre) {		
//		this.movieCode = nowString;
		this.movieCode = Instant.now().getEpochSecond();		
		this.title = title;
		this.genre = genre;
	}
	
	public long getMovieCode() {
		return movieCode;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}
	
	// 영화목록 파일 불러오기
	public static ArrayList<Movie> findAll() throws IOException{
		ArrayList<Movie> movies = new ArrayList<Movie>();
		BufferedReader br = null;
		String line = null;
		
		try {
			// 파일 읽어와서 버퍼에 저장
			br = new BufferedReader(new FileReader(file));
			
			while((line=br.readLine()) != null) {
				String[] tmp = line.split(",");
				Movie movie = new Movie(Long.parseLong(tmp[0]), tmp[1], tmp[2]);
				movies.add(movie);				
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			br.close();
		}
		
		return movies;
	}
	
	// 영화 등록 리스트 파일에 추가
	public void save() throws IOException {
//		FileWriter fw = new FileWriter(file);  // 파일에 덮어쓰기
		FileWriter fw = new FileWriter(file, true);  // true -> append로 추가
		
		fw.write(this.toFileString() + "\n");
		fw.close();
	}	

	// 파일에 추가할 포맷
	private String toFileString() {
		return String.format("%d,%s,%s", movieCode, title, genre);
	}

	@Override
	public String toString() {
		return String.format("[%s]:%s(%s)\n", movieCode, title, genre);
	}
	
}
