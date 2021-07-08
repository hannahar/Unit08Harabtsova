package com.epam.unit08.finaltask;

public class Customer {
	private int id;
	private String surname;
	private String name;
	private String fatherName;
	private String address;
	private int numberCreditCard;
	private int bankAccount;

	public Customer() {
		id = 0;
		surname = "";
		name = "";
		fatherName = "";
		address = "";
		numberCreditCard = 0;
		bankAccount = 0;
	}

	public Customer(int _id, String _surname, String _name, String _fatherName, String _address, int _numberCreditCard,
			int _bankAccount) {
		id = _id;
		surname = _surname;
		name = _name;
		fatherName = _fatherName;
		address = _address;
		numberCreditCard = _numberCreditCard;
		bankAccount = _bankAccount;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberCreditCard() {
		return numberCreditCard;
	}

	public void setNumberCreditCard(int numberCreditCard) {
		this.numberCreditCard = numberCreditCard;
	}

	public int getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String toString() {
		return getName() + " " + getSurname();
	}
	
	public String getCustomerFullName () {
		String fullName;
		fullName = getSurname() + getName();
		return fullName;
	}

}
