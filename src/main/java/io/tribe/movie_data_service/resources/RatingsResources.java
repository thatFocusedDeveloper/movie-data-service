package io.tribe.movie_data_service.resources;

import io.tribe.movie_data_service.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResources {
    public Rating getRating(@PathVariable("movieId") String movieid ) {
        return new Rating("John Wick", 8);
    }
}
