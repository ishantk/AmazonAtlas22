package com.amazon.atlas22.creational;

class Button{
	
	String text;
	
	Button(String text){
		this.text = text;
	}
	
	void onClick() {
		System.out.println("Button Cicked");
	}
}

class AlertDialog{
	
	// Attributes of AlertDialog :)
	String title;
	String message;
	
	// Has-A Relation :)
	Button okButton;
	Button cancelButton;
	
	// private: you will not be able to create Object of AlertDialog Directly :)
	private AlertDialog(){
		
	}
	
	// Let the Object be not constructed outside :)
	private AlertDialog(String title, String message, Button okButton, Button cancelButton) {
		this.title = title;
		this.message = message;
		this.okButton = okButton;
		this.cancelButton = cancelButton;
	}
	
	public void showAlertDialog() {
		System.out.println("----------------------------------");
		System.out.println(title);
		System.out.println("````````````````");
		System.out.println(message);
		System.out.println();
		System.out.println("\t\t"+okButton.text+"   "+cancelButton.text);
		System.out.println("----------------------------------");
	}


	// Nested Class :)
	// Use the Builder to get copy of an Alert Dialog Object :)
	static class Builder{
		
		String title;
		String message;
		
		// Has-A Relation :)
		Button okButton;
		Button cancelButton;

		public Builder setTitle(String title) {
			this.title = title;
			return this; // Return Reference to the Current Object
		}
	
		public Builder setMessage(String message) {
			// Some Algo to Validate the Message :)
			this.message = message;
			return this;
		}

		public Builder setOkButton(Button okButton) {
			this.okButton = okButton;
			return this;
		}

		public Builder setCancelButton(Button cancelButton) {
			this.cancelButton = cancelButton;
			return this;
		}
		
		public AlertDialog build() {
			return new AlertDialog(title, message, okButton, cancelButton);
		}
	}
	
}

public class Builder {

	public static void main(String[] args) {
	
		// No Direct Object Construction Allowed :)
		// AlertDialog dialog = new AlertDialog();
		
		// Error: As Builder is non static internally of AlertDialog
		//AlertDialog.Builder builder = new AlertDialog.Builder();
		
		// OK: As Builder is Static internally of AlertDialog
		//AlertDialog.Builder builder = new AlertDialog.Builder();
		
		AlertDialog dialog = new AlertDialog.Builder()
				.setTitle("Delete John")
				.setMessage("Are you sure to delete John?")
				.setOkButton(new Button("Delete"))
				.setCancelButton(new Button("Cancel"))
				.build();
		
		dialog.showAlertDialog();
	}

}
