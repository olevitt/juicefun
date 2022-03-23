package com.intech.netflix.premierservice.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intech.netflix.premierservice.model.Film;
import com.intech.netflix.premierservice.model.Media;

@Repository
public interface MediaRepository extends JpaRepository<Media, Integer> {
	
	

}
