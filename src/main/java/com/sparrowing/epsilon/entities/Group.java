package com.sparrowing.epsilon.entities;

import java.util.List;

public class Group {
	
	private int id;
	
	// Playlist the group exists within
	private Playlist playlist;
	
	// Immediate parent if applicable
	private Group parent;
	
	// Any IMMEDIATE child groups
	private List<Group> subgroups;
	// Any IMMEDIATE songs in this group
	private List<Song> songs;

}
