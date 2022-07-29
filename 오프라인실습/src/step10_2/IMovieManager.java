package step10_2;

public interface IMovieManager {
	void add(Movie movie);
	Movie[] getList();
	Movie[] SearchByMovies(String title) throws TitleNotFoundException;
	Movie[] getMovies();
	SeriesMovie[] getSeriesMovies();
	double getRunningTimeAvg();
	void saveData();
}
