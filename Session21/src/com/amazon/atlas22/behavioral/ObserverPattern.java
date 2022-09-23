package com.amazon.atlas22.behavioral;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

interface Notification{
	void notifyUser(String message);
}

class GitHubUser implements Notification{

	String username;
	
	GitHubUser(String username){
		this.username = username;
	}
	
	public void notifyUser(String message) {
		System.out.println("``````````````````````````````````````````");
		System.out.println("A New Notification Received by "+username+" at "+new Date());
		System.out.println("Message: "+message);
		System.out.println("``````````````````````````````````````````");
		System.out.println();
	}	
}

class GitHubRepository{
	
	String linkToRepo;
	String owner;
	
	List<Notification> watchers = new ArrayList<Notification>();
	
	public GitHubRepository(String linkToRepo, String owner) {
		this.linkToRepo = linkToRepo;
		this.owner = owner;
	}
	
	void pushCode(String commitMessage) {
		System.out.println("New Code Pushed at "+new Date());
		System.out.println("Commit Message: "+commitMessage);
		
		for(Notification notification : watchers) {
			notification.notifyUser(commitMessage);
		}
	}
	
	void watch(Notification notification) {
		watchers.add(notification);
	}
	
	void unwatch(Notification notification) {
		watchers.remove(notification);
	}
}

public class ObserverPattern {

	public static void main(String[] args) {
		
		//  GitHubRepository is a Subject/Topic :)
		GitHubRepository amazonAtlas22 = new GitHubRepository("https://github.com/ishantk/AmazonAtlas22.git", "ishantk");
		
		GitHubUser user1 = new GitHubUser("dayanand2311");
		GitHubUser user2 = new GitHubUser("harikrishnan33377");
		GitHubUser user3 = new GitHubUser("ishantk");
		
		// 3 Different Users are watching the Repository :)
		// Hence, Users are Observers :)
		amazonAtlas22.watch(user1);
		amazonAtlas22.watch(user2);
		amazonAtlas22.watch(user3);
		
		amazonAtlas22.pushCode("Structural and Behvioral Design Patterns");

	}

}
