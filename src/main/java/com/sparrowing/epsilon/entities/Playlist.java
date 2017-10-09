package com.sparrowing.epsilon.entities;

import java.time.LocalDateTime;

public class Playlist {
	
	/*
	  int            id           Unique Playlist id
	  String         name         Display name of playlist
	  LocalDateTime  created      Creation time of playlist
	  LocalDateTime  updated      Last update time of playlist
	  Group          holderGroup  Base-level group of playlist
	  User           creator      User that created the playlist
	 */
	
	// PROPERTIES --------------------------------------------------------
	
	private int id;
	
	private String name;
	
	private LocalDateTime created;
	
	private LocalDateTime updated;
	
	private Group holderGroup;
	
	private User creator;
	
	// CONSTRUCTORS ------------------------------------------------------
	
	// PRIVATE METHODS ---------------------------------------------------
	
	// PUBLIC STATIC METHODS ---------------------------------------------
	
	// PUBLIC INSTANCE METHODS -------------------------------------------
	
	// GETTERS AND SETTERS -----------------------------------------------

}
