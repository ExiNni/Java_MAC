package com.kh.p2.child.model.vo;

public class CoffeeShop {

	private String coffeeName;
	private int price;
	private String shopName;
	
	public CoffeeShop() {
		
		
	}

	public CoffeeShop(String coffeeName, int price, String shopName) {
		super();
		this.coffeeName = coffeeName;
		this.price = price;
		this.shopName = shopName;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	@Override
	public String toString() {
		return "가게명: " + coffeeName + ", 가격: " + price;
	}
}
