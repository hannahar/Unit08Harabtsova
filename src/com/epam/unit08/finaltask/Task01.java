package com.epam.unit08.finaltask;

import java.util.List;

public class Task01 {

	public static void main(String[] args) {

		
		AllCustomers s2 = new AllCustomers();

		s2.addCustomer(new Customer(1, "John", "Johnson", "Jack", "New York, Main str", 981, 67891));
		s2.addCustomer(new Customer(2, "wwwJack", "Jackson", "", "Chicagok, Main str", 101, 9765433));
		s2.addCustomer(new Customer(3, "White", "Sue", "Sue", "Denver, Main str2", 123, 94846535));
		s2.addCustomer(new Customer(4, "Sue", "Sue", "Sue", "Denver, Main str", 671, 94846535));

	
		System.out.println(">>>>Sorting:");
		System.out.println(s2.sorting());

		int a = 9;
		int b = 150;
		List<Customer> resultCards = s2.getCreditCradsWithinRange(a, b);
		System.out.println(resultCards.toString());

	}
}
