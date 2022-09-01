package step5_2;

public class MovieManager {
	//싱글턴 패턴
	private static MovieManager manager = new MovieManager();
	private Movie[] movies = new Movie[100];
	private int idx;
//	movies[0] = new Movie();
//	private int[] arr = new int[100];
//	arr[0] = 12;
	private MovieManager() {
		this.idx = 0;
	}
	public static MovieManager getInstance() {
		return manager;
	}
	
	public void add(Movie movie) {
		if (this.idx < 100) {
			this.movies[this.idx++] = movie;
		}
	}
	public Movie[] getList() {
		Movie[] temp = new Movie[this.idx];
		for(int i=0; i<this.idx; i++) {
			temp[i] = this.movies[i];
		}
		
//		return this.movies;
		return temp;
	}
	
	public Movie searchByTitle(String title) {
		for(int i=0; i<this.idx; i++) {
			Movie m = this.movies[i];
			if(title.equals(m.getTitle())) {
				return m;
			}
//			if(m.getTitle().equals(title)) {
//				return m;
//			}
//			에러나는 코드 -> 왜냐하면 메서드의 경우에는 항상 string값이 아니라 null값도 들어갈 수 도 있기 때문이라나 뭐라나..
		}
		return null;
	}
}
