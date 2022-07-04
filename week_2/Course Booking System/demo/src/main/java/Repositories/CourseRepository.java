package Repositories;

import Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByStarRating(int starRating);

    List<Course> findByBookings_Customer_Name(String name);


}
