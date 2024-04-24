package com.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

 
import com.main.services.IOToMAssociationMngtService;

@SpringBootApplication
public class SbDataJpaProj12BlobAndClobApplication 
{

	public static void main(String[] args) throws IOException 
	{
		  ApplicationContext ctx =  SpringApplication.run(SbDataJpaProj12BlobAndClobApplication.class, args);
		  IOToMAssociationMngtService service = ctx.getBean("OToMService", IOToMAssociationMngtService.class);
		  
		  
		  service.saveDataUsingParent();
		   
		   ((ConfigurableApplicationContext) ctx).close();
		  
	}

}
