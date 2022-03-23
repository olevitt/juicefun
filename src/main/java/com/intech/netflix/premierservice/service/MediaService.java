package com.intech.netflix.premierservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intech.netflix.premierservice.model.Media;
import com.intech.netflix.premierservice.repository.MediaRepository;

@Service
public class MediaService {

	@Autowired
	MediaRepository mediaRepository;
	
	public List<Media> getAllMedias(){

		return mediaRepository.findAll();
	}
}
