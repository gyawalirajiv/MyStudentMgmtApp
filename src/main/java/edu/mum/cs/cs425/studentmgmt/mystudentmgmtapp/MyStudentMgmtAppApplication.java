package edu.mum.cs.cs425.studentmgmt.mystudentmgmtapp;

import edu.mum.cs.cs425.studentmgmt.mystudentmgmtapp.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.mystudentmgmtapp.model.Student;
import edu.mum.cs.cs425.studentmgmt.mystudentmgmtapp.model.Transcript;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class MyStudentMgmtAppApplication {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("StudentmgmtApplication");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		entityTransaction.begin();
		Transcript transcript= new Transcript("BS Computer Science");
		Classroom classroom=new Classroom("McLaughlin Building","M105");
		Student student=new Student("Anna", "Lynn", null, "Smith", 3.45, new Date(), transcript, classroom);

		entityManagerFactory.close();
	}

}
