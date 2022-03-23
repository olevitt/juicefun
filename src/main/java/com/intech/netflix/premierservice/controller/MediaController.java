package com.intech.netflix.premierservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intech.netflix.premierservice.model.Media;
import com.intech.netflix.premierservice.service.MediaService;

@RestController
public class MediaController {

	@Autowired
	MediaService mediaService;
	@GetMapping("/medias")
	List<Media> getAllMedias(){
		
		return mediaService.getAllMedias();
	}

}
