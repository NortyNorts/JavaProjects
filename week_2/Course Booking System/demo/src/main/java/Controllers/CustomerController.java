package Controllers;

import Models.Course;
import Models.Customer;
import Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value="/customer")
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    @GetMapping(value = "/customer/course")
    public ResponseEntity<List<Customer>> getCustomersByCourse(@RequestParam(name = "course") String name) {
        return new ResponseEntity<>(customerRepository.findByBookings_Course_Name(name), HttpStatus.OK);
    }

}
