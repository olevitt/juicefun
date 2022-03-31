package com.intech.netflix.premierservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intech.netflix.premierservice.model.Media;
import com.intech.netflix.premierservice.repository.MediaRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class MediaService {

	@Autowired
	MediaRepository mediaRepository;

	@PersistenceContext
	private EntityManager entityManager;

	public void getMediaById(String id) {
		entityManager.createNativeQuery("SELECT * FROM media WHERE id = "+id).getResultList();
	}
	
	public List<Media> getAllMedias(){

		return mediaRepository.findAll();
	}
}
