package org.example.uberreviewservice.controllers;

import org.example.uberreviewservice.adapters.CreateReviewDtoToReviewAdapter;
import org.example.uberreviewservice.dtos.CreateReviewDto;
import org.example.uberreviewservice.models.Booking;
import org.example.uberreviewservice.models.Review;
import org.example.uberreviewservice.services.ReviewService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewControllerTest {

    @InjectMocks                     // this creates the instance of this controller and inject where required
    private ReviewController reviewController;

    @Mock                                      // this annotation is used because we dont want to create actual object of the class but inject object to be injected
    private ReviewService reviewService;

    @Mock
    private CreateReviewDtoToReviewAdapter createReviewDtoToReviewAdapter;

    @BeforeEach                   // this enable the method to execute before every test
    public void SetUp() {
        MockitoAnnotations.initMocks(this);                 // this makes sure the initialization and integration of mockito with Junit
    }


    @Test
    public void testFindReviewById_Success() {

        long reviewId = 1L;
        Review mockReview = Review.builder().build();
        mockReview.setId(reviewId);

        // mocking
        Mockito.when(reviewService.findReviewById(reviewId)).thenReturn(Optional.of(mockReview));         // static method

        // perform the test
        ResponseEntity<?> response =  reviewController.findReviewById(reviewId);

        // assertion i,e checking the expected and actual
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());         // static method

        Optional<Review> returnedReview = (Optional<Review>) response.getBody();
        assertEquals(reviewId, returnedReview.get().getId());
    }


    @Test
    public void testPublishReview_Success() {

        CreateReviewDto requestDto = new CreateReviewDto();
        Booking booking = new Booking();
        booking.setId(1L);
        requestDto.setBookingId(booking.getId());

        Review incomingReview = Review.builder()
                .content("This is the content for test")
                .rating(4.6)
                .booking(booking)
                .build();

        // mocking
        Mockito.when(createReviewDtoToReviewAdapter.convertDto(requestDto)).thenReturn(incomingReview);

        Review savedReview = Review.builder()
                .content(incomingReview.getContent())
                .rating(incomingReview.getRating())
                .booking(incomingReview.getBooking())
                .build();

        // mocking
        Mockito.when(reviewService.publishReview(incomingReview)).thenReturn(savedReview);

        // performing test
        ResponseEntity<?> response =  reviewController.publishReview(requestDto);

        Assertions.assertEquals(HttpStatus.CREATED, response.getStatusCode());
    }
}
