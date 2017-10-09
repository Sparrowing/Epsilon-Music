package com.sparrowing.epsilon.entities;

import java.time.LocalDateTime;
import java.util.List;

public class User {
	
	/*
	  int             id         Unique User id
	  String          username   Username of user
	  String          pwHash     The user's hashed password
	  LocalDateTime   joined     Date and time that user joined
	  List<Playlist>  playlists  Playlists owned by user
	  List<Song>      songs      User's song entries
	 */
	
	// PROPERTIES --------------------------------------------------------
	
	private int id;
	
	private String username;
	
	private String pwHash;
	
	private LocalDateTime joined;
	
	private List<Playlist> playlists;
	
	private List<Song> songs;
	
	// CONSTRUCTORS ------------------------------------------------------
	
	// PRIVATE METHODS ---------------------------------------------------
	
	// PUBLIC STATIC METHODS ---------------------------------------------
	
	// PUBLIC INSTANCE METHODS -------------------------------------------
	
	// GETTERS AND SETTERS -----------------------------------------------
	
}
