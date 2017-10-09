package com.sparrowing.epsilon.entities;

public class Song {
	
	private int id;
	private String name;
	private String artist;
	
	// ID of the corresponding YouTube video
	private String youtubeVideoId;
	
	// User that created this song entry
	private User user;
	
	// Parent group the song is in
	private Group group;

}
