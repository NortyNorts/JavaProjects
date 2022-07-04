package Componensts;

import Models.Booking;
import Models.Course;
import Models.Customer;
import Repositories.BookingRepository;
import Repositories.CourseRepository;
import Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test") //Run everytime Except for tests
@Component //Comment this out if you don't want the seed loader to run every time.
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

//        customerRepository.deleteAll();
//        bookingRepository.deleteAll();
//        courseRepository.deleteAll();

        Customer customer1 = Customer
                .builder()
                .name("Dave")
                .town("Edinburgh")
                .age(25)
                .build();
        customerRepository.save(customer1);

        Course course1 = Course
                .builder()
                .name("CodeClan")
                .town("Edinburgh")
                .starRating(4)
                .build();
        courseRepository.save(course1);

        Booking booking1 = Booking
                .builder()
                .date("2/2/2222")
                .course(course1)
                .customer(customer1)
                .build();
        bookingRepository.save(booking1);
//
//        Customer steve = new Customer("Steve", "Leven", 35);
//        customerRepository.save(steve);
//
//        Customer debbie = new Customer("Debbie", "Edinburgh", 28);
//        customerRepository.save(debbie);
//
//        Customer sophia = new Customer("Sophia", "Glasgow", 32);
//        customerRepository.save(sophia);
//
//        Course softwareDev = new Course("Software Development", "Glasgow", 4);
//        courseRepository.save(softwareDev);
//
//        Course DataEng = new Course("Data Engineering", "Edinburgh", 3);
//        courseRepository.save(DataEng);
//
//        Booking booking1 = new Booking("14/08/2019");
//        bookingRepository.save(booking1);
//
//        Booking booking2 = new Booking("01/01/2022");
//        bookingRepository.save(booking2);
//
//        Booking booking3 = new Booking("21/11/2018");
//        bookingRepository.save(booking3);
//
//        Booking booking4 = new Booking("02/04/2021");
//        bookingRepository.save(booking4);
//
//        Booking booking5 = new Booking("01/02/2022");
//        bookingRepository.save(booking5);
//
//

    }

}
