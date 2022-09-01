package step10_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieManagerImpl implements IMovieManager{

	/*싱글턴 패턴*/
	private static IMovieManager instance = new MovieManagerImpl();
	
	private List<Movie> movieList = new ArrayList<>();
	public static IMovieManager getInstance() {
		return instance;
	}
	private MovieManagerImpl() {
		loadData();
	};
	
	
	
	
	@Override
	public void add(Movie movie) {
		movieList.add(movie);
		
	}

	@Override
	public Movie[] getList() {
		Movie[] temp = new Movie[movieList.size()];
		movieList.toArray(temp);
		return temp;
	}

	@Override
	public Movie[] SearchByMovies(String keyword) throws TitleNotFoundException {
		List<Movie> temp = new ArrayList<Movie>();
		for(Movie movie: movieList) {
			if(movie.getTitle().contains(keyword));
				temp.add(movie);
		}
		if(temp.size() == 0) {
			//예외
			throw new TitleNotFoundException(keyword);
		}
		Movie[] tempArr = new Movie[temp.size()]; 
		return temp.toArray(tempArr);
	}

	@Override
	public Movie[] getMovies() {
		List<Movie> tempList = new ArrayList<>();
		for(Movie movie: movieList) {
			if(!(movie instanceof SeriesMovie)) {
				tempList.add(movie);
			}
		}
		Movie[] tempArr = new Movie[tempList.size()];
		return tempList.toArray(tempArr);
	}

	@Override
	public SeriesMovie[] getSeriesMovies() {
		List<Movie> tempList = new ArrayList<>();
		for(Movie movie: movieList) {
			if(movie instanceof SeriesMovie) {
				tempList.add((SeriesMovie)movie);
			}
		}
		SeriesMovie[] tempArr = new SeriesMovie[tempList.size()];
		return tempList.toArray(tempArr);
	}


	@Override
	public double getRunningTimeAvg() {
		int sum = 0;
		for(Movie movie: movieList) {
			sum += movie.getRunningTime();
		}
		return (double) sum / movieList.size();
	}
	
	private void loadData() {
		File f = new File("movie.dat");
		if(f.exists()) {
			// ObjectInputStream <- FileInputStream
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
				movieList = (ArrayList<Movie>) ois.readObject();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void saveData() {
//		Stream
//		Node->Node
//		System.in : 키보드 -> 프로그램 Standard InputStream
//		System.out : 프로그램 -> 콘솔 Standard OutputStream
//		프로그램 -> 파일 : FileOutputStream
//		영화객체 -> 파일 : 영화객체 -> 바이트 -> 파일
//		ObjectOutputStram -> FileOutputStream
//		try with resources try (resorces) { }
//		Scanner sc
//		sc.close();
		
		
//		InputStream = byte
//		Reader, Writer = char

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("movie.dat"))){ 
			oos.writeObject(movieList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
