package com.amazon.atlas22.grasp;

interface Remote{
	void directionButtons();
	void powerButton();
	void volumeButtons();
}

class TVRemote implements Remote{

	@Override
	public void directionButtons() {
		
	}

	@Override
	public void powerButton() {
		System.out.println("Power On/Off the TV");
	}

	@Override
	public void volumeButtons() {
		
	}
	
}

class ProjectorRemote implements Remote{

	@Override
	public void directionButtons() {
		
	}

	@Override
	public void powerButton() {
		System.out.println("Power On/Off the Projector");
	}

	@Override
	public void volumeButtons() {
		
	}
	
}


class GamingRemote implements Remote{

	@Override
	public void directionButtons() {
		
	}

	@Override
	public void powerButton() {
		System.out.println("Power On/Off the Play Station Remote");
	}

	@Override
	public void volumeButtons() {
		
	}
	
}

class AmazonFireStickRemote implements Remote{

	@Override
	public void directionButtons() {
		
	}

	@Override
	public void powerButton() {
		System.out.println("Power On/Off the Amazon Fire Stick");
	}

	@Override
	public void volumeButtons() {
		
	}
	
}

public class Polymorphism {

	public static void main(String[] args) {
		

		Remote remote;
		// Polymorphic Behavior :)
		//remote = new TVRemote();
		//remote = new ProjectorRemote();
		//remote = new GamingRemote();
		remote = new AmazonFireStickRemote();
		remote.powerButton();
	}

}
