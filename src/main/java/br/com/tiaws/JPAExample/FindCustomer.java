package br.com.tiaws.JPAExample;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tiaws.JPAExample.Model.Customer;

/**
 * Hello world!
 *
 */
public class FindCustomer {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Customer customer = entitymanager.find( Customer.class, 601 );
		
	    System.out.println( customer );
	    System.out.println("Customer NAME = " + customer.getFirst_name());
	    
		entitymanager.close();
		emfactory.close();
	}
}
