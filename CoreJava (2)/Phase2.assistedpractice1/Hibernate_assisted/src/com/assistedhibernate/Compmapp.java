package com.assistedhibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Compmapp {
public static void main(String[] args) {
	
	Session s=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	
	Comp2 e1=new Comp2("Dhir",new Comp1("Chennai","India",620044));
	Comp2 e2=new Comp2("vars",new Comp1("Trichy","India",620013));
	
	Transaction t=s.beginTransaction();
	
	s.save(e1);
	s.save(e2);
	
	t.commit();
	s.close();
	
	System.out.println("success...");
}
}


