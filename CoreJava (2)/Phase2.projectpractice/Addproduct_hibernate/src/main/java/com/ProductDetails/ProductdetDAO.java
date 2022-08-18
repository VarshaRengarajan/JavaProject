package com.ProductDetails;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.SynthSpinnerUI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


@WebServlet("/ProductdetDAO")
public class ProductdetDAO extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProductdetDAO() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String pid = request.getParameter("id");
		
		String pname = request.getParameter("product_name");
		int pprice = Integer.parseInt(request.getParameter("product_price"));
		String pcategory = request.getParameter("product_category");
		
		Productdet det=new Productdet();
		det.setid(pid);
		det.setproduct_price(pprice);
		det.setproduct_name(pname);
		det.setproduct_category(pcategory);
		
		Configuration config=new Configuration();
		SessionFactory sessionFactory=config.configure().buildSessionFactory();
		
		//open connection
		Session session = sessionFactory.openSession();
		session.beginTransaction();
	
		//save object as record
		session.save(det);
		
		
		session.getTransaction().commit();
		
		session.close();
				
				PrintWriter out = response.getWriter();
				out.println("The details are inserted");
	}
}


