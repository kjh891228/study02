package org.hansung.di;

public class Car {
	String model;
	int price;
	
	public Car(String model, int price) {
		System.out.println("Car »ý¼ºÀÚ");
		this.model = model;
		this.price = price;
	}
	
	public void go() {
		System.out.println(model+"GO~~");
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}
}
