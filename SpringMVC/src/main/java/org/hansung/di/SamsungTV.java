package org.hansung.di;

public class SamsungTV implements TV{
	String model;
	int price;
	
	public SamsungTV(String model, int price) {
		System.out.println("SAMSUNG TV »ý¼ºÀÚ");
		this.model = model;
		this.price = price;
	}
	
	@Override
	public void show() {
		System.out.println(getClass().getSimpleName() + " - ON");
	}
	@Override
	public void hide() {
		System.out.println(getClass().getSimpleName() + " - OFF");
	}
}
