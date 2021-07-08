package com.epam.unit08.finaltask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AllCustomers {
	private List<Customer> allcustomers;

	public AllCustomers() {
		allcustomers = new ArrayList<Customer>();
	}

	public List<Customer> getAllcustomers() {
		return allcustomers;
	}

	public void setAllcustomers(List<Customer> allcustomers) {
		this.allcustomers = allcustomers;
	}

	public void addCustomer(Customer c) {
		allcustomers.add(c);
	}

	@Override
	public String toString() {
		return "allcustomers=" + allcustomers;
	}

	public String sorting() {
		this.allcustomers.sort(Comparator.comparing(Customer::getCustomerFullName));
		String s = "";
		for (Customer elem : this.allcustomers) {
			s += elem.getCustomerFullName() + "\n";
		}
		return s;

	}

	public List<Customer> getCreditCradsWithinRange(int x, int y) {
		List<Customer> result = new ArrayList<Customer>();

		for (Customer c : allcustomers) {
			if (c.getNumberCreditCard() > x && c.getNumberCreditCard() < y) {
				result.add(c);
			}
		}
		return result;
	}

}