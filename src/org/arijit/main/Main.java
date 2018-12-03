package org.arijit.main;

import java.util.Date;

import org.arijit.dto.Employee;
import org.arijit.dto.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		/*Person p1 = new Person();
		
		p1.setId(3);
		p1.setLastName("Deb");
		p1.setFirstName("Arijit");
		p1.setAddress("Singapore");
		p1.setCity("Bedok");
		*/
		
		//Employee emp1 = new Employee(1,"Arijit Deb",5900f);
		
		Employee emp1 = new Employee();
		
		//emp1.setId(1); For Automatically generating the id using @GeneratedValue annotation
		emp1.setName("Arijit Deb");
		emp1.setSalary(5980f);
		emp1.setJoinedDate(new Date());
		emp1.setAddress("First Employee Address");
		emp1.setDescription("Java resource");
		
		Employee emp2 = new Employee();
		emp2.setName("Auritra Deb");
		emp2.setSalary(2980f);
		emp2.setJoinedDate(new Date());
		emp2.setAddress("Second Employee Address");
		emp2.setDescription("All Stack Web developer");
		
		
		SessionFactory sFactory=new Configuration().configure().buildSessionFactory();
		Session session = sFactory.openSession();
		
		session.beginTransaction();
		//session.save(p1);
		
		session.save(emp1);
		session.save(emp2);
		session.getTransaction().commit();
		//session.close();
		
		
		/*emp1=null;
        session = sFactory.openSession();
		session.beginTransaction();
		
		emp1 = (Employee) session.get(Employee.class, 1);
		
		System.out.println(emp1.getName());
        */ 
	}

}
