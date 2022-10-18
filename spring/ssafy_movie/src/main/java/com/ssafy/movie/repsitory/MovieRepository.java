package com.ssafy.movie.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssafy.movie.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
