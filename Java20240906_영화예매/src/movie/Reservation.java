package movie;

public class Reservation {
	private int id;
	private int movieCode;
	private int reserveCode;
	private String title;
	private String seat;
	
	public Reservation(int id, int movieCode, int reserveCode, String title, String seat) {
		this.id = id;
		this.movieCode = movieCode;
		this.reserveCode = reserveCode;
		this.title = title;
		this.seat = seat;
	}

}
