package com.movie.management.service;


import com.movie.management.Entity.Movie;
import com.movie.management.repository.MovieRepository;
import com.movie.management.repository.MovieRepositoryDummy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepositoryDummy movieRepositoryDummy;

    @Autowired
    MovieRepository movieRepository;
    public Movie getMovieById(Long id) {
        return movieRepository.getMovieById(id);
    }

    public Movie saveMovie(Movie movie) {
        return  movieRepository.save(movie);
    }
}
