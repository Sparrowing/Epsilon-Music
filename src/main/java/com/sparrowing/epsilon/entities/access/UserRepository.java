package com.sparrowing.epsilon.entities.access;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sparrowing.epsilon.entities.User;

@Transactional @Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	List<User> findAll();
}
