package com.amazon.atlas22.queries;

import java.util.ArrayList;
import java.util.List;

interface Electronics{
	String getDescription();
	int getPrice();
	String accept(Visitor visitor); // Accept a Visitor
}

class HeadPhone implements Electronics{

	@Override
	public String getDescription() {
		return "Apple Ear Phones";
	}

	@Override
	public int getPrice() {
		return 15000;
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visitHeadPhones(this);
	}
	
}

class SmartWatch implements Electronics{

	@Override
	public String getDescription() {
		return "Apple Watch";
	}

	@Override
	public int getPrice() {
		return 45000;
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visitSmartWatches(this);
	}
	
}

class Speaker implements Electronics{

	@Override
	public String getDescription() {
		return "Apple Home Speaker";
	}

	@Override
	public int getPrice() {
		return 55000;
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visitSpeakers(this);
	}
	
}

interface Visitor{
	String visitHeadPhones(HeadPhone headPhone);
	String visitSmartWatches(SmartWatch smartWatch);
	String visitSpeakers(Speaker speaker);
}


class UserVisitorJourney implements Electronics{
	
	List<Electronics> electronics = new ArrayList<Electronics>();
	
	@Override
	public String getDescription() {
		return "";
	}

	@Override
	public int getPrice() {
		return 0;
	}

	@Override
	public String accept(Visitor visitor) {
		return "";
	}
	
	public void addAVisit(Electronics electronicDevice) {
		electronics.add(electronicDevice);
	}
	
	public void showJourney() {
		for(Electronics electronicDevice : electronics) {
			System.out.println(electronicDevice.getDescription()+" | "+electronicDevice.getPrice());
		}
	}
}

class UserVisitor implements Visitor{
	
	@Override
	public String visitHeadPhones(HeadPhone headPhone) {
		return headPhone.getDescription()+" | "+headPhone.getPrice();
	}

	@Override
	public String visitSmartWatches(SmartWatch smartWatch) {
		return smartWatch.getDescription()+" | "+smartWatch.getPrice();
	}

	@Override
	public String visitSpeakers(Speaker speaker) {
		return speaker.getDescription()+" | "+speaker.getPrice();
	}
	
}


public class VisitorPattern {

	public static void main(String[] args) {
		
		HeadPhone headPhone1 = new HeadPhone();
		SmartWatch watch1 = new SmartWatch();
		Speaker speaker1 = new Speaker();
		
		UserVisitor userVistor = new UserVisitor();
		
		headPhone1.accept(userVistor);
		watch1.accept(userVistor);
		speaker1.accept(userVistor);
		
		UserVisitorJourney journey = new UserVisitorJourney();
		journey.addAVisit(headPhone1);
		journey.addAVisit(watch1);
		journey.addAVisit(speaker1);
		
		journey.showJourney();
		

	}

}
