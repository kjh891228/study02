package org.hansung.di;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class People {
	String name;
	String pNum;
	
	@Resource
	Car car;

	List<String> major;
	List<Car> carList;

	public People() {
	}
	
	public People(String name, String pNum, Car car) {
		super();
		this.name = name;
		this.pNum = pNum;
		this.car = car;
	}
	
	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

	public void setMajor(List<String> major) {
		this.major = major;
	}

	//@Required
	public void setName(String name) {
		this.name = name;
	}

	public void setpNum(String pNum) {
		this.pNum = pNum;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", pNum=" + pNum + ", car=" + car + ", major=" + major + ", carList=" + carList
				+ "]";
	}

}
