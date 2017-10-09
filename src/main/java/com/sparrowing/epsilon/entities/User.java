package com.sparrowing.epsilon.entities;

import java.time.LocalDateTime;
import java.util.List;

public class User {
	
	private int id;
	private String username;
	private String pwHash;
	
	private LocalDateTime joined;
	
	// Owned playlists
	private List<Playlist> playlists;
	
	// Song entries
	private List<Song> songs;
	
}
