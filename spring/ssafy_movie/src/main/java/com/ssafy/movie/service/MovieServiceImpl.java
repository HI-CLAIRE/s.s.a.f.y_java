package com.ssafy.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.movie.entity.Movie;
import com.ssafy.movie.repsitory.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	
	@Override
	public List<Movie> getAllMovies() {
	
		return movieRepository.findAll();
	}


	@Override
	public Movie createMovie(Movie movie) {
		
		return movieRepository.save(movie);
	}


	@Override
	public Movie getMovieById(int id) {
		
		return movieRepository.findById(id).get();
	}

	@Override
	public Movie updateMovie(Movie movie) {
		
		return movieRepository.save(movie);
	}


	@Override
	public void deleteMovieById(int id) {
		movieRepository.deleteById(id);
		
	}

}
