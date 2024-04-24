package com.main.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Entity
@Table(name="JPA_OTM_PHONE_NUMBER")
@Data
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
public class PhoneNumber implements Serializable
{
	 @Id
	 @SequenceGenerator(name = "gen1", sequenceName = "JPA_REGNO_SEQ", initialValue = 100, allocationSize = 1)
	 @GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
     private Integer regNo;
	 
	 @NonNull
	 private Long mobNo;
	 
	 @NonNull
	 private String provider;
	 
	 @NonNull
	 private String numberType;
	 
	 @ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	 //@JoinColumn(name="PERSON_ID", referencedColumnName = "PID")
	 private Person personInfo;
	 
	  public PhoneNumber()
	  {
		  System.out.println("PhoneNumber.PhoneNumber()");
	  }

	@Override
	public String toString() 
	{
		return "PhoneNumber [regNo=" + regNo + ", mobNo=" + mobNo + ", provider=" + provider + ", numberType="
				+ numberType + ", person=" + personInfo + "]";
	}
	   
}
