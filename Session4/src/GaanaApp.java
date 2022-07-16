// We ideally create a class containing main method separately
// Also, we try to create all the classes in separate files, rather than in single file

// Main Class
public class GaanaApp {

	// Main Method: Execution Begins Here
	public static void main(String[] args) {
		
		Song song1 = new Song("1. Kitni Haseen Hogi", "Arijit Singh", 5.30);
		Song song2 = new Song("2. Mutiyare Ni.....", "Gippy Grewal", 2.47);
		Song song3 = new Song("3. Galliyan Returns", "Ankit Tiwari", 5.50);
		
		//System.out.println("song1 is: "+song1);
		//System.out.println("song2 is: "+song2);
		//System.out.println("song3 is: "+song3);
		
		// Update Operation
		song1.duration = 5.45;
		
		//song1.showSong();
		//song2.showSong();
		//song3.showSong(); 
		
		// Reference Copy Operation
		// At the same time, we are sort of linking the objects
		
		// Hard-Coded operation i.e. we are manually linking these objects :)
		
		// Forward Linking
		song1.nextSong = song2;
		song2.nextSong = song3;
		song3.nextSong = song1;
		
		// Reverse Linking
		song3.previousSong = song2;
		song2.previousSong = song1;
		song1.previousSong = song3;
		
		// Iteration of Songs
		// 1. Forward Iteration (Navigating from 1st Song to the Last Song)
		
		// s1: 101
		// s2: 201
		// s3: 301
		
		// song: 301
		Song song = song1; // Initially we need to begin from song1
		
		System.out.println("SONG PLAYLIST (FORWARD ITERATION)");
		while(true) {
			song.showSong();
			// Increment to the next song :)
			song = song.nextSong; 
			
			if(song.nextSong == song1) {
				song.showSong();
				break;
			}
		}
		
		System.out.println();
		
		// 2. Backward Iteration (Navigating from Last Song to the 1st Song)
		System.out.println("SONG PLAYLIST (BACKWARD ITERATION)");
		song = song3;
		while(true) {
			song.showSong();
			// Decrement to the previous song
			song = song.previousSong;
			
			if(song.previousSong == song3) {
				song.showSong();
				break;
			}
		}

	}

}
