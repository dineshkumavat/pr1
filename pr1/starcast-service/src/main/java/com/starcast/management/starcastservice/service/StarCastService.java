package com.starcast.management.starcastservice.service;

import com.starcast.management.starcastservice.entity.Movie;
import com.starcast.management.starcastservice.entity.ResponseTemplateVO;
import com.starcast.management.starcastservice.entity.StarCast;
import com.starcast.management.starcastservice.repository.StarCastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StarCastService {

    @Autowired
    StarCastRepository starCastRepository;

    @Autowired
    RestTemplate restTemplate;
    public StarCast saveStarCast(StarCast starCast) {
        return starCastRepository.save(starCast);
    }

    public ResponseTemplateVO getStarCastDetails(Long id) {
        StarCast starCast = starCastRepository.getStarCastDetailsById(id);
        Movie movie = restTemplate.getForObject("http://MOVIE-SERVICE/movies/"+starCast.getMovieId(),Movie.class);
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO(starCast,movie);
        return responseTemplateVO;
    }
}
