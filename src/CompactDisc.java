
import java.util.List;

/**
 * 
 */

/**
 * @author madaliou
 *
 */
public class CompactDisc extends Product {
	
	private String artist;
	private List<Track> tracks;
	
	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}

	public CompactDisc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
}
