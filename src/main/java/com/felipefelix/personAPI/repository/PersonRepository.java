package com.felipefelix.personAPI.repository;

import com.felipefelix.personAPI.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
@EnableJpaRepositories
public interface PersonRepository extends JpaRepository<Person, Long> {

}
