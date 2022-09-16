package com.amazon.atlas22.grasp;

import java.util.Date;

class Configuration{
	
	static Configuration configuration = new Configuration();
	
	String appName;
	int typeOfPlan;
	int priceOfPlan;
	Date expiry;
	
	private Configuration() {
		appName = "Crify";
		typeOfPlan = 1;
		priceOfPlan = 3000;
		expiry = new Date();
	}
	
	static Configuration getConfig() {
		return configuration;
	}
	
}


class CRMApp{
	
	Configuration configuration;
	
	public CRMApp(){
		configuration = Configuration.getConfig();
	}
	
}

class CRMCustomer{
	
	Configuration configuration;
	
	public CRMCustomer() {
		configuration = Configuration.getConfig();
	}
	
}


public class Indirection {

	public static void main(String[] args) {
		
		CRMApp app = new CRMApp();
		CRMCustomer customer = new CRMCustomer();

	}

}
