/*
 * Created on 23-04-2023 13:43 by ajarzabe
 *
 * Copyright (c) 2001-2023 Unity S.A.
 * ul. Przedmiejska 6-10, 54-201 Wrocław, Poland
 * Wszelkie prawa zastrzeżone
 *
 * Niniejsze oprogramowanie jest własnością Unity S.A.
 * Wykorzystanie niniejszego oprogramowania jest możliwe tylko na podstawie
 * i w zgodzie z warunkami umowy licencyjnej zawartej z Unity S.A.
 */

package com.projekt.game_project.interfaces;

import com.projekt.game_project.application.GameProjectDto;


public class GameProjectForm {


	private Long id;
	private String title;
	private String shortDescription;
	private String longDescription;
	private String gameUrl;

	public GameProjectForm() {

	}

	public GameProjectForm(Long id, String title, String shortDescription, String longDescription, String gameUrl) {

		this.id = id;
		this.title = title;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.gameUrl = gameUrl;
	}

	public Long getId() {

		return id;
	}

	public void setId(Long id) {

		this.id = id;
	}

	public String getTitle() {

		return title;
	}

	public void setTitle(String title) {

		this.title = title;
	}

	public String getShortDescription() {

		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {

		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {

		return longDescription;
	}

	public void setLongDescription(String longDescription) {

		this.longDescription = longDescription;
	}

	public String getGameUrl() {

		return gameUrl;
	}

	public void setGameUrl(String gameUrl) {

		this.gameUrl = gameUrl;
	}
}
