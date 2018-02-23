package examples.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparable {
	List<Song> songs = new ArrayList<>();
	List<String> strings = new ArrayList<String>();
	public static void main(String[] args) {
		Song song = new Song();
		song.setName("hello");
		song.setArtist("abhiram");
		song.setReleaseYear("2017");
	}
}


class Song implements Comparable<Song>{
	String name;
	String artist;
	String releaseYear;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	// sort by name
	public int compareTo(Song song) {
		return name.compareTo(song.getName());
	}
}

class artistSort implements Comparator<Song> {
	public int compare(Song s1, Song s2) {
		return s1.getArtist().compareTo(s2.getArtist());
	}
}