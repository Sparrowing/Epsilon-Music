package com.sparrowing.epsilon.entities;

import java.util.List;

public class Group {
	
	/*
	  int          i          Unique Group id
	  Playlist     playlist   Playlist the group exists within
	  Group        parent     Immediate parent group (if applicable)
	  List<Group>  subgroups  Any IMMEDIATE child groups
	  List<Song>   songs      Any IMMEDIATE songs in this group
	 */
	
	// PROPERTIES --------------------------------------------------------
	
	private int id;
	
	private Playlist playlist;
	
	private Group parent;
	
	private List<Group> subgroups;
	
	private List<Song> songs;
	
	// CONSTRUCTORS ------------------------------------------------------
	
	// PRIVATE METHODS ---------------------------------------------------
	
	// PUBLIC STATIC METHODS ---------------------------------------------
	
	// PUBLIC INSTANCE METHODS -------------------------------------------
	
	// GETTERS AND SETTERS -----------------------------------------------

}
