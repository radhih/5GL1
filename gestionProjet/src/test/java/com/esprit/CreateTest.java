package com.esprit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import edu.esprit.gestion_projet.domain.Entity.Developer;
import edu.esprit.gestion_projet.domain.Entity.Reporter;
import edu.esprit.gestion_projet.services.IService.IUserManager;

//SONARQUBE
//emailTEST33
//tests mahdi
//sonarLunch2 /// /// 20/11/2015
//emailTEST

//radhihouli
@RunWith(MockitoJUnitRunner.class)
public class CreateTest {
	
	IUserManager  userManger;
	@Before
	public void setUp() throws Exception {
		//chargement du context
		
		ApplicationContext ctx= new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Recuperation bean Majeur a travers interface 
		
		 userManger= (IUserManager) ctx.getBean("usmanager");	
			}
	@Test
	public void test_createDev1() {
		//chargement du context
		
	
		//Creation d'un User 
	Developer dev1 = new Developer();
	dev1.setName("ahmed ben ahmed");
	dev1.setE_mail("ahmed@esprit.tn");
	dev1.setCodeDeveloper("ABH");
	dev1.setLogin("ahmed");
	dev1.setPassword("ahmed");
	//Execution des methodes :creation d'un user 
	userManger.createUser(dev1);


	}

	

	@Test
	public void test_createDev2() {

		//Creation d'un User 
	Developer dev2 = new Developer();
	dev2.setName("haifa ben amor");
	dev2.setE_mail("haifa@esprit.tn");
	dev2.setCodeDeveloper("ABA");
	dev2.setLogin("haifa");
	dev2.setPassword("haifa");
	//Execution des methodes :creation d'un user 
	userManger.createUser(dev2);


	}

	
	@Test
	public void test_createReporter() {
		//chargement du context
		
		ApplicationContext ctx= new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Recuperation bean Majeur a travers interface 
		
		IUserManager  userManger= (IUserManager) ctx.getBean("usmanager");	
		
		//Creation d'un User 
	Reporter rep = new Reporter();
	rep.setName("Mohamed louz");
	rep.setE_mail("Mohamed@esprit.tn");
	rep.setCodReporter("ML");
	rep.setLogin("mohamed");
	rep.setPassword("louz");
	//Execution des methodes :creation d'un user 
	userManger.createUser(rep);


	}

	
	

}
