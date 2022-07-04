package com.example.demo;

import Models.Booking;
import Models.Course;
import Models.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer1;
    Course course1;
    Booking booking1;

    @Before
    public void before(){
        customer1 = Customer
                .builder()
                .name("Dave")
                .town("Edinburgh")
                .age(25)
                .build();

        		course1 = Course
				.builder()
				.name("CodeClan")
				.town("Edinburgh")
				.starRating(4)
				.build();

                booking1 = Booking
				.builder()
				.date("2/2/2222")
				.build();

    }

    @Test
    public void customerHasName(){
        assertEquals("Dave", customer1.getName());
    }


	@Test
	public void courseHasName(){
		assertEquals("CodeClan", course1.getName());
	}

	@Test
	public void bookingHasDate(){
		assertEquals("2/2/2222", booking1.getDate());
	}


}
