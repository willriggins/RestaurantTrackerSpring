package com.theironyard;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by will on 6/21/16.
 */
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {
    public Iterable<Restaurant> findByRating(int rating);
    public Iterable<Restaurant> findByLocation(String location);
    public Iterable<Restaurant> findByLocationAndRating(String location, int rating);
    public Iterable<Restaurant> findByRatingGreaterThanEqual(int rating);
    public int countByLocation(String location);
    public Iterable<Restaurant> findByOrderByRatingDesc(); //Asc for ascending
    public Iterable<Restaurant> findByUser(User user);

    @Query("SELECT r from Restaurant r WHERE r.location LIKE ?1%")
    public Iterable<Restaurant> searchLocation(String location);
    // on the @query line, add extra conditions by OR or AND and say r.name = x or w/e you want


}
