package org.hansung.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("pu")
public class PeopleUse {

	@Autowired
	People people;
	
	public void test() {
		System.out.println(people);
	}
	
}
