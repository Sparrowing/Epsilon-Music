package com.sparrowing.epsilon.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Playlist {
	
	private int id;
	private String name;
	
	private LocalDateTime created;
	private LocalDateTime updated;
	
	// IMMEDIATE child subgroups
	private List<Group> groups;
	// IMMEDIATE songs
	private List<Song> songs;
	
	private User creator;
	
	// private String description;
	
	// private List<User> allowedEdit;
	// private List<User> allowedView;

}
