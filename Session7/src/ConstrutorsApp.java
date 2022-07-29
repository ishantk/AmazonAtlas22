
class PhoneSettings{
	
	String carrier;
	
	int ringerVolume;
	int speakerVolume;
	String ringtone;
	
	// If we do not create constructor compiler creates it for us
	/*PhoneSettings(){
		ringerVolume = 0;
		speakerVolume = 0;
		ringtone = null;
	}*/
	
	// Executed automatically when the object is constructed
	/*PhoneSettings(){
		ringerVolume = 3;
		speakerVolume = 2;
		
		if(carrier.equals("airtel")) {
			ringtone = "Airtel Jingle...";
		}else {
			ringtone = "Opening...";
		}
		System.out.println("[PhoneSettings] - default constructor exeuted");
	}*/
	
	// BLOCK -> Instance Initialization BLOCK
	{
		carrier = "airtel";
		System.out.println("[PhoneSettings] - block executed");
	}
	
	PhoneSettings(){
		this(3, 2, "Opening..."); // this execution call must be the first statement
		System.out.println("[PhoneSettings] - default constructor exeuted");
	}
	
	PhoneSettings(int ringerVolume, int speakerVolume, String ringtone){
		
		this.ringerVolume = ringerVolume;
		this.speakerVolume = speakerVolume;
		
		if(carrier.equals("airtel")) {
			this.ringtone = "Airtel Jingle...";
		}else {
			this.ringtone = ringtone;
		}
		
		System.out.println("[PhoneSettings] - paramterized constructor exeuted");
	}
	
	void showSettings() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("ringerVolume is: "+ringerVolume);
		System.out.println("speakerVolume is: "+speakerVolume);
		System.out.println("ringtone is: "+ringtone);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
	
}

public class ConstrutorsApp {

	public static void main(String[] args) {
		
		System.out.println("[ConstrutorsApp] - main method exeuted");

		
		PhoneSettings settings = new PhoneSettings(); // PhoneSettings(); -> execution to constructor
		
		System.out.println();
		
		PhoneSettings mySettings = new PhoneSettings(5, 1, "Christmas Chimes...");
		
		settings.showSettings();
		mySettings.showSettings();

	}

}
