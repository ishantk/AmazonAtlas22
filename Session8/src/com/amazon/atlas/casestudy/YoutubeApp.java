package com.amazon.atlas.casestudy;

import java.util.Date;

interface Notification{
	void notifyUser(String message);
}

// Reference Variable of Notification can refer to the Object of User :)
class User implements Notification{
	
	//....

	public void notifyUser(String message) {
		System.out.println();
		System.out.println("Notification Received in User Object");
		System.out.println();
		System.out.println("````````````````````````````");
		System.out.println("A new Notification Received");
		System.out.println("Message: "+message);
		System.out.println();
		System.out.println("````````````````````````````");
	}
	
	
}

class YoutubeChannel{
	
	Notification notification; // will have reference to the User object
	//....
	
	void subscribe(Notification notification) { 
		this.notification = notification;
	}
	
	void uploadVideo(String videoName) {
		System.out.println("Notifiying from the Youtube Channel....");
		notification.notifyUser("A new video uploaded: "+videoName+" at "+new Date());
	}
	
}

public class YoutubeApp {

	public static void main(String[] args) {
		

		YoutubeChannel channel = new YoutubeChannel();
		User user = new User();
		
		channel.subscribe(user);
		
		channel.uploadVideo("LearningWithIshant.mp4");
		
	}

}
