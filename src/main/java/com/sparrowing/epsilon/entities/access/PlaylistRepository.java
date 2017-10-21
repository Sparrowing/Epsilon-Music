package com.sparrowing.epsilon.entities.access;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sparrowing.epsilon.entities.Playlist;

@Transactional @Repository
public interface PlaylistRepository extends CrudRepository<Playlist, Integer> {

	List<Playlist> findAll();
}
