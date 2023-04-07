package com.jsp.hibernate_simple_crud_project.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDataJpql {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		String deleteQuery = "DELETE FROM Laptop L WHERE L.laptopId=:eid";
		
		Query query=entityManager.createQuery(deleteQuery);
		
		query.setParameter("eid", 3245);
		
		entityTransaction.begin();
		int a=query.executeUpdate();
		entityTransaction.commit();
		System.out.println(a);
	}
}
