package com.esoxjem.movieguide.details;

import com.esoxjem.movieguide.entities.Review;
import com.esoxjem.movieguide.entities.Video;

import java.util.List;

import rx.Observable;

/**
 * @author arun
 */
public interface IMovieDetailsInteractor
{
    Observable<List<Video>> getTrailers(String id);
    Observable<List<Review>> getReviews(String id);
}
