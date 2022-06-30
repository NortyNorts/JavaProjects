package com.example.codeclan.pirateservice.repository;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Raid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface RaidRepository extends JpaRepository<Raid, Long> {

    List<Raid> findByLocation(String location);

    Optional<Raid> findByLocationAndLoot(String location, int loot);

    List<Raid> findByPirates_FirstNameAndPirates_AgeAndPirates_Ship_Name(String firstName, int age, String name);

    @Query("select r from Raid r inner join r.pirates pirates " +
            "where r.loot = ?1 and pirates.firstName = ?2 and r.location = ?3 and pirates.ship.name = ?4")
    List<Raid> findByLootAndPirates_FirstNameAndLocationAndPirates_Ship_Name(int loot, String firstName, String location, String name);

}
