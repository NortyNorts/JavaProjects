package Controllers;

import Models.Booking;
import Models.Course;
import Repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/booking/date")
    public ResponseEntity<List<Booking>> getBookingsByDate(@RequestParam(name = "booking") String date) {
        return new ResponseEntity<>(bookingRepository.findByDate(date), HttpStatus.OK);
    }

}
