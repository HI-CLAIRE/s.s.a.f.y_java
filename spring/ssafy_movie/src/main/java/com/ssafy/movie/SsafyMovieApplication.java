package com.ssafy.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ssafy.movie.entity.Movie;
import com.ssafy.movie.repsitory.MovieRepository;

// @Configuration
// @EnableAutoConfiguration
// @ComponenetScan
@SpringBootApplication
public class SsafyMovieApplication implements CommandLineRunner {

	@Autowired
	private MovieRepository movieRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SsafyMovieApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Movie m1 = new Movie("헤어질 결심", "박찬욱", 120);
//		Movie m2 = new Movie("공조2", "...", 120);
//		
//		movieRepository.save(m1);
//		movieRepository.save(m2);
//		
	}
	
	

}
