package com.jsp.hibernate_simple_crud_project.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_simple_crud_project.Laptop;

public class DisplayLaptopCpntroller {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String select = "SELECT a FROM Laptop a";
		
		Query query=entityManager.createQuery(select);
		
		List<Laptop> laptops=query.getResultList();
		
		for (Laptop laptop : laptops) {
			System.out.println("laptopId = "+laptop.getLaptopId());
			System.out.println("laptopName = "+laptop.getLaptopName());
			System.out.println("laptopPrice = "+laptop.getLaptopPrice());
		}

	}
}
