package com.amazon.atlas.exceptions;

class Card{
	
	String name;
	String cardNumber;
	int atmPin;
	
	Card(){
		this("NA", "NA", 0);
	}
	
	Card(String name, String cardNumber, int atmPin) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.atmPin = atmPin;
	}
	
	@Override
	public boolean equals(Object obj) {
		Card card = (Card)obj;
		return cardNumber.equals(card.cardNumber) && card.atmPin == atmPin;
	}

	@Override
	public String toString() {
		return "Card [name=" + name + ", cardNumber=" + cardNumber + ", atmPin=" + atmPin + "]";
	}
	
}

class BankDB{
	
	private Card cards[];
	
	BankDB(){
		cards = new Card[5];
		cards[0] = new Card("John", "3321 2211", 1101);
		cards[1] = new Card("Fionna", "2111 3312", 3451);
		cards[2] = new Card("Jack", "4456 9987", 399);
		cards[3] = new Card("Dave", "5411 9876", 1200);
		cards[4] = new Card("Sia", "7754 1234", 5466);
		System.out.println("[BankDB] Initialized");
	}

	public Card[] getCards() {
		return cards;
	}
	
}


// RuntimeException -> is an UNCHECKED EXCEPTION
// All of its children are UNCHECKED
class ATMException extends RuntimeException{ // User Defined Exception
	
	ATMException(String message){
		super(message);
	}
}

// Exception-> is a CHECKED EXCEPTION
// Creating child of Exception class, you are creating a CHECKED EXCEPTION
class ATMBankingException extends Exception{ // User Defined
	
	ATMBankingException(String message){
		super(message);
	}
}

class ATMApp{
	
	private Card cards[];
	private int attempts=0;
	private final int maxAttempts = 5;
	
	ATMApp(){
		BankDB db = new BankDB();
		cards = db.getCards();
		System.out.println("[ATMApp] Initialized");
		System.out.println("[ATMApp] Cards Fetched from DB");
	}
	
	void inputCard(String cardNumber, int atmPin) throws ATMBankingException {
		
		System.out.println("[ATMApp] inputCard processing the Card Details");
		
		Card userCard = new Card("", cardNumber, atmPin);
		
		boolean isFound=false;
		
		for(Card card : cards) {
			if(card.equals(userCard)) {
				userCard.name = card.name;
				isFound = true;
				break;
			}
		}
		
		if(isFound) {
			System.out.println("[ATMApp] CARD FOUND WITH ATM PIN. You can Proceed with Transaction.");
			System.out.println(userCard);
		}else {
			attempts++;
			System.err.println("[ATMApp] CARD NOT FOUND with NUMBER "+userCard.cardNumber+" OR ATM PIN: "+userCard.atmPin);
			System.err.println("[ATMApp] Either Card Number or ATM PIN Invalid");
		}
		
		System.out.println();
		
		if(attempts == maxAttempts) {
			// Throwing an UNCHECKED EXCEPTION
			//ArithmeticException exception = new ArithmeticException("Illegal Attempts: "+maxAttempts);
			//ATMException exception = new ATMException("Illegal Attempts: "+maxAttempts);
			//throw exception;
			
			
			// Throwing a CHECKED EXCEPTION
			ATMBankingException exception = new ATMBankingException("Illegal Attempts: "+maxAttempts);
			throw exception;
		}
		
	}
	
}


public class ThrowDemo {

	public static void main(String[] args) {
		
		System.out.println("[main] App Started");
	
		ATMApp app = new ATMApp();
		
		try {
			for(int i=1;i<=999;i++) {
				app.inputCard("4456 9987", i);
			}
		}catch(Exception e) {
			System.out.println("Something Went Wrong...");
			System.out.println("e is: "+e);
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("[main] App Finished");

	}

}
