package org.spring.SampleHelloWorld;

public class Person {
	
	public void message() {
		System.out.println("Hello spring");
	
	}
	
	private int id;
	public void setAddress(Address address) {
		this.address = address;
	}

	private String name;
	private Address address;

	public Person(Address address) {
		super();
		this.address = address;
	}

	public Person() {
		
	}
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	}


