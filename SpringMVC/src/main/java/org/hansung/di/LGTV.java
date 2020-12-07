package org.hansung.di;

public class LGTV implements TV{
	public void turnOn() {
		System.out.println(getClass().getSimpleName() + " - ON");
	}
	public void turnOff() {
		System.out.println(getClass().getSimpleName() + " - OFF");
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
