package com.sowmyareddyClasses.DMS.repository;

import java.util.List;

/*
 * 
 * @author Sowmya Reddy Boppidi
 */

import org.springframework.data.repository.CrudRepository;

import com.sowmyareddyClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer> {
	
	List<Dog> findByName(String name);
}
