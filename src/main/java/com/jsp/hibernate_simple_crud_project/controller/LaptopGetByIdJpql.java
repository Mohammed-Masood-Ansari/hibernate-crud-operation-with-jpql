package com.jsp.hibernate_simple_crud_project.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_simple_crud_project.Laptop;

public class LaptopGetByIdJpql {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		String getByIdQuery = "SELECT L FROM Laptop L WHERE L.laptopId=:eid";
		
		Query query=entityManager.createQuery(getByIdQuery);
		
		query.setParameter("eid", 3245);
		
		Object object=query.getSingleResult();
		
		Laptop laptop = (Laptop)object;
		
		System.out.println(laptop.getLaptopId());
		System.out.println(laptop.getLaptopName());
		System.out.println(laptop.getLaptopPrice());
	}
}
