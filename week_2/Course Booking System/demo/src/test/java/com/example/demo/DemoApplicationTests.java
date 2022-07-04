package com.example.demo;

import Models.Booking;
import Models.Course;
import Models.Customer;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

//@SpringBootTest
public class DemoApplicationTests {



	Customer customer1;
	Course course1;
	Booking booking1;

//	@Test
//	void contextLoads() {
//	}

	@Before
	public void before(){
		customer1 = Customer
				.builder()
				.name("Dave")
				.town("Edinburgh")
				.age(25)
				.build();

//		course1 = Course
//				.builder()
//				.name("CodeClan")
//				.town("Edinburgh")
//				.starRating(4)
//				.build();
//
//		booking1 = Booking
//				.builder()
//				.date("2/2/2222")
//				.build();

	}

	@Test
	public void customerHasName(){
		assertEquals("Dave", customer1.getName());
	}
//
//	@Test
//	public void courseHasName(){
//		assertEquals("CodeClan", course1.getName());
//	}

//	@Test
//	public void bookingHasDate(){
//		assertEquals("2/2/2222", booking1.getDate());
//	}


}
