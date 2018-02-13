package org.spring.SampleHelloWorld;

public class Address {
	private String street;
	private String pincode;
	
	public Address(String street, String pincode) {
		super();
		this.street = street;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", pincode=" + pincode + "]";
	}

}
