package com.example.codeclan.pirateservice.repository;

import com.example.codeclan.pirateservice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {

    List<Pirate> findByAgeGreaterThan(int age);

    List<Pirate> findByRaidsId(Long id);



//    operation*By*ConnectionProperty*Property*Operator (not used here)
//    operation = find , read, count, get
//    Connected property = an attribute in our class by models
//    Property = In our case ID (but this can be an attribute in the connected property's class
//    Operator = can be the varb `and`/`or`



}
