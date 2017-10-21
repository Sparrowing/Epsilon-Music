package com.sparrowing.epsilon.base;

import org.springframework.beans.factory.annotation.Autowired;

import com.sparrowing.epsilon.entities.access.GroupRepository;
import com.sparrowing.epsilon.entities.access.PlaylistRepository;
import com.sparrowing.epsilon.entities.access.SongRepository;
import com.sparrowing.epsilon.entities.access.UserRepository;

public class BaseController {
	
	@Autowired protected GroupRepository groupRepo;
	@Autowired protected PlaylistRepository playlistRepo;
	@Autowired protected SongRepository songRepo;
	@Autowired protected UserRepository userRepo;

}
