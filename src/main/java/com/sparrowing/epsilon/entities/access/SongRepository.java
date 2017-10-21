package com.sparrowing.epsilon.entities.access;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sparrowing.epsilon.entities.Song;

@Transactional @Repository
public interface SongRepository extends CrudRepository<Song, Integer> {

	List<Song> findAll();
}
