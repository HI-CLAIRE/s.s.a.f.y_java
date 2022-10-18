package com.ssafy.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssafy.movie.entity.Movie;
import com.ssafy.movie.service.MovieService;

@Controller
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/movies")
	public String movieList(Model model) {
		model.addAttribute("movies", movieService.getAllMovies());
		return "movies";
	}
	
	@GetMapping("/movies/new")
	public String createMovieForm(Model model) {
		model.addAttribute("movie", new Movie());
		return "create_movie";
	}
	
	@PostMapping("/movies")
	public String createMovie(@ModelAttribute Movie movie) {
		movieService.createMovie(movie);
		return "redirect:/movies";
	}
	
	@GetMapping("/movies/{id}/edit")
	public String editMovieForm(Model model, @PathVariable int id) {
		model.addAttribute("movie", movieService.getMovieById(id));
		return "edit_movie";
	}
	
	@PostMapping("/movies/{id}")
	public String createMovie(@ModelAttribute Movie movie, @PathVariable int id) {
		movieService.updateMovie(movie);
		return "redirect:/movies";
	}
	
	@GetMapping("/movies/{id}/delete")
	public String deleteMovie(@PathVariable int id) {
		movieService.deleteMovieById(id);
		return "redirect:/movies";
	}

}
