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
public class CreateCustomer {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.out.println("Hello World!");

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		Customer customer = new Customer();
		customer.setActive(true);
		customer.setAddress_id(1);
		customer.setCreate_date(new Date(2015, 9, 20, 16, 8, 0));
		customer.setEmail("awsbr@msn.com");
		customer.setFirst_name("Andre");
		customer.setLast_name("Silva");
		customer.setStore_id(1);

		entitymanager.persist(customer);
		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();
	}
}
