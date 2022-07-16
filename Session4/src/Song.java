public class Song {

	// Attributes: Property of Object :)
	String track;
	String artists;
	double duration;
	
	// These reference vars are by default null
	Song nextSong;			// reference variable: which can hold the hashcode of Song Object
	Song previousSong;		// reference variable: which can hold the hashcode of Song Object
	
	public Song() {
		track = "NA";
		artists = "NA";
		duration = 0.0;
		//nextSong = null;		// no need to do it, as they are by default null
		//previousSong = null;	// no need to do it, as they are by default null
	}
	
	public Song(String track, String artists, double duration) {
		this.track = track;
		this.artists = artists;
		this.duration = duration;
	}
	
	void showSong() {
		System.out.println("----------------------------------------------------------------");
		System.out.println(track+"\t\t"+artists+"\t\t"+duration);
		System.out.println("----------------------------------------------------------------");
	}
	
}
