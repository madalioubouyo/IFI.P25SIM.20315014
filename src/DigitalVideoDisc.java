public class DigitalVideoDisc extends Product {
	
	private String director;
	private int length;
	
	public DigitalVideoDisc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, int lenght, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	
	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}	
	
	
}