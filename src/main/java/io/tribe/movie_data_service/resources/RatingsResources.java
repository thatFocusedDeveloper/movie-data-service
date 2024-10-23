package io.tribe.movie_data_service.resources;

import io.tribe.movie_data_service.models.Rating;
import io.tribe.movie_data_service.models.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResources {
    
    @GetMapping("/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") String movieid ) {
        return new Rating("John Wick", 8);
    }
    
    @GetMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        UserRating userRating = new UserRating();
        userRating.initData(userId);
        return userRating;
    }
}
