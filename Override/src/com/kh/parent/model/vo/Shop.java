package com.kh.parent.model.vo;

public class Shop {

	private String owner;
	private String address;
	
	public Shop() {
		
	}

	public Shop(String owner, String address) {
		super();
		this.owner = owner;
		this.address = address;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "주인: " + owner + ", 주소: " + address;
	}
	
	
}
