package com.intech.netflix.premierservice.model;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Media {

	private List<Episode> episodes = new ArrayList<Episode>();

	public List<Episode> getEpisodes() {
		return episodes;
	}

	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}
	
}
