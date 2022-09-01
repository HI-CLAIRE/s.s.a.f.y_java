package step5_2;

public class Movietest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie1 = new Movie();
		Movie movie2 = new Movie(1, "탑건", "Joseph Kosinski", "액션", 200);
		Movie movie3 = new Movie(2, "헤어질 결심", "박찬욱", "드라마", 180);
		
		MovieManager manager = MovieManager.getInstance();
		
		manager.add(movie1);
		manager.add(movie2);
		manager.add(movie3);
		
		Movie[] movieList = manager.getList();
		for(int i=0; i<movieList.length; i++) {
			System.out.println(movieList[i]);
		}
		
		Movie m = manager.searchByTitle("헤어질 결심");
		System.out.println(m);
	}

}
