package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

public class hibernateMain 
{
    public static void main( String[] args )
    {
    
    		Configuration cfg = new Configuration().configure();
    		SessionFactory sf = cfg.buildSessionFactory();
    		Session s = sf.openSession();
    		Transaction t = s.beginTransaction();
    		
    		Product product = new Product();
    		product.setProductId(1010);
    		product.setName("Realme 3 pro");
    		product.setBrand("Realme");
    		product.setPrice(13999);
    		
    		s.save(product);
    		System.out.println("Product saved successfully : ");
    		t.commit();
    		s.close();
    }
}
