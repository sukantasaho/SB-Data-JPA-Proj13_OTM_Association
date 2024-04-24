package com.main.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="JPA_OTM_PERSON")
@Data
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
public class Person implements Serializable
{
	 @Id
	 @SequenceGenerator(name = "gen1", sequenceName = "JPA_PERSON_ID_SEQ", initialValue = 10000, allocationSize = 1)
	 @GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
     private Integer pid;
	 
	 @NonNull
     private String pname;
	 
	 @NonNull
     private String paddrs;
	 
	  @OneToMany(targetEntity = PhoneNumber.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "personInfo")
	  @JoinColumn(name="PERSON_ID", referencedColumnName = "PID")
	  private Set<PhoneNumber> contactDetails;
	  
	  public Person()
	  {
		  System.out.println("Person.Person()");
	  }

	@Override
	public String toString() 
	{
		return "Person [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + ", contactDetails=" + contactDetails
				+ "]";
	}
	  
	  
}
