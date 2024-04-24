package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.main.entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer>
{

}
