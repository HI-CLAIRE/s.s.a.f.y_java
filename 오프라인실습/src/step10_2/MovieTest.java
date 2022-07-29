package step10_2;

public class MovieTest {

	public static void main(String[] args) {
//		Movie movie1 = new Movie();
//		Movie movie2 = new Movie(1, "탑건", "Joseph Kosinski", "액션", 200);
//		Movie movie3 = new Movie(2, "헤어질 결심", "박찬욱", "드라마", 180);
//		
		IMovieManager manager = MovieManagerImpl.getInstance();
		
//		manager.add(movie1);
//		manager.add(movie2);
//		manager.add(movie3);
//		
//		manager.saveData();
		
		
		
		for(int i = 0; i < manager.getList().length; i++) {
			System.out.println(manager.getList()[i]);
		}
		
	}

}
