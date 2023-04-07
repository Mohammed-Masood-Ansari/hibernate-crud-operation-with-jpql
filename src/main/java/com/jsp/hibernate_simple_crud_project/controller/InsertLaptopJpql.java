package com.jsp.hibernate_simple_crud_project.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InsertLaptopJpql {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		String insertQuery = "INSERT INTO laptop(laptopId,laptopName,laptopPrice) VALUES (?,?,?)";

		Query query = entityManager.createNativeQuery(insertQuery);

		query.setParameter(1, 8765);
		query.setParameter(2, "DELL");
		query.setParameter(3, 5478);
		
		entityTransaction.begin();
		int a = query.executeUpdate();
		entityTransaction.commit();
		System.out.println(a);
	}
}
