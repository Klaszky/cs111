public class Song
{
	private String title;
	private String artist;
	private String genre;
	private int length;

	public Song(String title, String artist, int length)
	{
		this.title = title;
		this.artist = artist;
		this.length = length;

	}

	public void setLength(int length)
	{
		this.length = length;
	}

	public int getLength()
	{
		return length;
	}

	public String getTitle()
	{
		return title;
	}

	public String getArtist()
	{
		return artist;
	}

	public String toString()
	{
		return title+" by "+artist;
	}

	public boolean equal(Song o)
	{

		if(
			this.length != o.length || 
			!this.artist.equals(o.artist) ||
			!this.title.equals(o.title)
		)
		{
			return false;
		}

		return true;
	}
}