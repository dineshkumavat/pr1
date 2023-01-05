package com.movie.management.repository;


import com.movie.management.Entity.Movie;
import org.springframework.stereotype.Repository;

@Repository
public class MovieRepositoryDummy {
    public Movie getMovieById(int id) {

        return null;
    }
}
