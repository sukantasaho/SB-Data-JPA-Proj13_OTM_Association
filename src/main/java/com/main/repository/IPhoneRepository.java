package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.PhoneNumber;

public interface IPhoneRepository extends JpaRepository<PhoneNumber, Integer> 
{
  
}
