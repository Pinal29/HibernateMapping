package com.cg.hibernateprogram;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FetchData {
	public static void main(String[] args) {    
	     
	    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate1tomany.cfg.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	    Session session=factory.openSession();  
	      TypedQuery query= session.createQuery("from question12");
	      List<Questions>list=query.getResultList();
	      Iterator<Questions>itr = list.iterator();
	      while(itr.hasNext())
	      {
	    	  Questions q=itr.next();
	    	  System.out.println("Questions Name:"+q.getQname());
	    	  //printing answers
	    	  List<Answer>list2= q.getAnswers();
	    	  Iterator<Answer>itr2=list2.iterator();
	    	  while(itr2.hasNext())
	    	  {
	    		  System.out.println(itr2.next());
	    	  }
	    	  
	      }
	      session.close();
	      
	      System.out.println("Success");
	      
	}
}
