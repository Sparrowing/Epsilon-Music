package com.sparrowing.epsilon.entities.access;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sparrowing.epsilon.entities.Group;

@Transactional @Repository
public interface GroupRepository extends CrudRepository<Group, Integer> {
	
	List<Group> findAll();
}
