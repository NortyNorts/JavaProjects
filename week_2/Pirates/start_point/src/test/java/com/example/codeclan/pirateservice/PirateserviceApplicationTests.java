package com.example.codeclan.pirateservice;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Raid;
import com.example.codeclan.pirateservice.models.Ship;
import com.example.codeclan.pirateservice.repository.PirateRepository;
import com.example.codeclan.pirateservice.repository.RaidRepository;
import com.example.codeclan.pirateservice.repository.ShipRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@ActiveProfiles("test") //Indicates it's a test, so will not run.
@SpringBootTest
public class PirateserviceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	@Test
	public void contextLoads() {
	}

//	@Test
//	public void createPirateAndShipThenSave(){
//
//		Ship dutchman = new Ship("The Flying Dutchman");
//		shipRepository.save(dutchman);
//		Pirate jack = new Pirate("jack", "sparrow", 32, dutchman);
//		pirateRepository.save(jack);
//	}
//
//	@Test
//	public void createPirateAndRaidThenSave(){
//		Ship dutchman = new Ship("The Flying Dutchman");
//		shipRepository.save(dutchman);
//		Pirate jack = new Pirate("jack", "sparrow", 32, dutchman);
//		pirateRepository.save(jack);
//
//		Raid raid = new Raid("Tortuga", 100);
//		raidRepository.save(raid);
//
//		jack.addRaid(raid);
//		raid.addPirate(jack);
//		raidRepository.save(raid);
//
//	}

	@Test
	public void canFindPiratesOverTheAgeOf30(){
		List<Pirate> found = pirateRepository.findByAgeGreaterThan(30);
		assertEquals(7, found.size());
	}

	@Test
	public void canFindRaidByLocation(){
		List<Raid> found = raidRepository.findByLocation("Tortuga");
		assertTrue(found.size()>0);
	}

	@Test
	public void findPiratesByRaidId(){
		List<Pirate> foundPirate = pirateRepository.findByRaidsId(1L);
		assertEquals(1, foundPirate.size());
		assertEquals("Jack", foundPirate.get(0).getFirstName());
	}

	@Test
	public void findShipByPirateFirstName() {
		List<Ship> foundShip = shipRepository.findByPiratesFirstName("Maggie");
		assertEquals(1, foundShip.size());

	}

}
