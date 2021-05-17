import java.util.List;

/**
 * 
 */

/**
 * @author madaliou
 *
 */
public class Ebook extends Product {
	
	private String author;
	
	private List<TalkingChapter> talkingChapters;
	
	public List<TalkingChapter> getTalkingChapters() {
		return talkingChapters;
	}


	public void setTalkingChapters(List<TalkingChapter> talkingChapters) {
		this.talkingChapters = talkingChapters;
	}


	public Ebook(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}	

}
