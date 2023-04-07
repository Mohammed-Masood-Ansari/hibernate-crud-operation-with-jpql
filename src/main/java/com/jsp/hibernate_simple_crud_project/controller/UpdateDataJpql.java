package com.jsp.hibernate_simple_crud_project.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDataJpql {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		String updateQuery = "UPDATE Laptop L SET L.laptopName=:lname WHERE L.laptopId=:eid";

		Query query = entityManager.createQuery(updateQuery);

		query.setParameter("eid", 324554);
		query.setParameter("lname", "ASUS");

		entityTransaction.begin();
		int a = query.executeUpdate();
		entityTransaction.commit();
		System.out.println(a);
	}
}
