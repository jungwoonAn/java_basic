package class1.ex;
/*
 * 기존 문제에 배열을 도입하고, 영화 리뷰를 배열에 관리하자.
리뷰를 출력할 때 배열과 for 문을 사용해서 
System.out.println 을 한번만 사용하자.
 */
public class MovieReviewMain2 {

	public static void main(String[] args) {
		// 영화 리뷰 정보 선언
		MovieReview movie1 = new MovieReview();
		movie1.title = "인셉션";
		movie1.review = "인생은 무한 루프";
		
		MovieReview movie2 = new MovieReview();
		movie2.title = "어바웃 타임";
		movie2.review = "인생 시간 영화!";
		
		// 배열로 리팩터
		MovieReview[] movies = {movie1, movie2};
		
		// 영화 리뷰 정보 출력
		for(MovieReview movie : movies) {			
			System.out.println("영화 제목 : " + movie.title + ", 리뷰 : " + movie.review);
		}
	}

}
