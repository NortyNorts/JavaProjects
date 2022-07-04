package Controllers;

import Models.Course;
import Repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/course/rating")
    public ResponseEntity<List<Course>> getCoursesByRating(@RequestParam(name = "rating") int starRating) {
        return new ResponseEntity<>(courseRepository.findByStarRating(starRating), HttpStatus.OK);
    }

    @GetMapping(value = "/course/customer")
    public ResponseEntity<List<Course>> getCoursesByCustomer(@RequestParam(name = "customer") String name) {
        return new ResponseEntity<>(courseRepository.findByBookings_Customer_Name(name), HttpStatus.OK);
    }

}