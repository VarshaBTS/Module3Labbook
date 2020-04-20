package com.jpastart.author;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Author a = new Author();
		a.setAuthorid(2);
		a.setFirstname("dolly");
		a.setMiddlename("juli");
		a.setLastname("arigto");
		a.setPhoneno(1234);
		
		Author a1=new Author(1,"var","sha","mus",1234);
		Author a2=new Author(3,"shre","ya","donkey",1234);
		em.persist(a1);
		em.persist(a);
		em.persist(a2);
		
		System.out.println("Added author to database.");
		
		Author a3= em.find(Author.class,2);
		a3.setFirstname("siri");
		System.out.println("Updated");
		
		em.remove(a);
		System.out.println("removed Author a");
		em.getTransaction().commit();
		em.close();
		factory.close();

	}

}
