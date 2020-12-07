package org.hansung.di;

public class TVFactory {
	
	public static TV makeTV(String brand) {
		TV tv = null;
		if (brand.equals("SAMSUNG")) {
			//tv = new SamsungTV();
		} else if (brand.equals("LG")) {
			tv = new LGTV();
		} 
		return tv;
	}
}
