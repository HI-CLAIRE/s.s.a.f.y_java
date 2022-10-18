package com.ssafy.movie.service;

import java.util.List;

import com.ssafy.movie.entity.Movie;

public interface MovieService {
	List<Movie> getAllMovies();
	Movie createMovie(Movie movie);
	Movie getMovieById(int id);
	Movie updateMovie(Movie movie);
	void deleteMovieById(int id);
}
