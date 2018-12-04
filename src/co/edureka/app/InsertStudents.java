package co.edureka.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.config.HibernateUtils;
import co.edureka.model.Student;

public class InsertStudents {

	public static void main(String[] args) {

		SessionFactory sFactory=HibernateUtils.getSessionFactory();
		
		Session session = sFactory.openSession();
		
		Transaction t=session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		String req="y";
		
		while(req.equalsIgnoreCase("y")) {
			System.out.println("Enter sname ,email , mobile");
			
			String name=sc.nextLine();
			String email=sc.nextLine();
			String mobile=sc.nextLine();
			
			Student st = new Student();
			
			st.setSname(name);
			st.setEmail(email);
			st.setMobile(mobile);
			
			session.save(st);
			
			System.out.print("Do you want to save more students [Y/N] :");
			req=sc.next();
			
		}
		
		t.commit();
		session.close();
		sFactory.close();

	}

}
