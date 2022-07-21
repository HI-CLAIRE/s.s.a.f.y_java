package 클래스와객체;

public class MovieTest {
	public static void main(String[] args) {
		Movie movie1 = new Movie();
		Movie movie2 = new Movie(1, "탑건", "Joseph Kosinski", "액션", 200);
		Movie movie3 = new Movie(2, "헤어질 결심", "박찬욱", "드라마", 180);
		
		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println(movie3);
		
	}
}
