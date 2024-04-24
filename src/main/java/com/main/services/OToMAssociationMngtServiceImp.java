package com.main.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Person;
import com.main.entity.PhoneNumber;
import com.main.repository.IPersonRepository;
import com.main.repository.IPhoneRepository;

@Service("OToMService")
public class OToMAssociationMngtServiceImp implements IOToMAssociationMngtService 
{

	
	@Autowired
	private IPersonRepository personRepo;
	
	@Autowired
	private IPhoneRepository phoneRepo;
	
	@Override
	public void saveDataUsingParent() 
	{
		 //create parent object
		Person person = new Person("Sukanta","Kothar");
		//create child object
		PhoneNumber number1 = new PhoneNumber(9983999393L,"airtel","personal");
		PhoneNumber number2 = new PhoneNumber(6370578823L,"jio","office");
		//add parent to child
		number1.setPersonInfo(person);
		number2.setPersonInfo(person);
		//add child to parent
		Set<PhoneNumber> phoneSet = new HashSet<>();
		phoneSet.add(number1);phoneSet.add(number2);
		person.setContactDetails(phoneSet);
		
		//save the parent object
		personRepo.save(person);
		System.out.println("Person and his associated phone numbers are saved (parent to child)");

	}

	@Override
	public void saveDataUsingChild() 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void loadDataUsingParent() 
	{
		// TODO Auto-generated method stub

	}

}
