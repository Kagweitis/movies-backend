package com.example.movie;

import org.springframework.http.ResponseEntity;

public interface ReviewServiceInterface {

    Reviews createReview(String reviewBody, String imdbId);

}
