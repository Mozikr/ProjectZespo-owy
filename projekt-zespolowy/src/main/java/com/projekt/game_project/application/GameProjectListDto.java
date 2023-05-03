/*
 * Created on 03-05-2023 12:52 by ajarzabe
 *
 * Copyright (c) 2001-2023 Unity S.A.
 * ul. Przedmiejska 6-10, 54-201 Wrocław, Poland
 * Wszelkie prawa zastrzeżone
 *
 * Niniejsze oprogramowanie jest własnością Unity S.A.
 * Wykorzystanie niniejszego oprogramowania jest możliwe tylko na podstawie
 * i w zgodzie z warunkami umowy licencyjnej zawartej z Unity S.A.
 */

package com.projekt.game_project.application;

public class GameProjectListDto {

	private Long id;
	private String title;
	private String shortDescription;
	private String iconUrl;

	public GameProjectListDto(Long id, String title, String shortDescription, String iconUrl) {

		this.id = id;
		this.title = title;
		this.shortDescription = shortDescription;
		this.iconUrl = iconUrl;
	}

	public GameProjectListDto() {

	}

	public Long getId() {

		return id;
	}

	public String getTitle() {

		return title;
	}

	public String getShortDescription() {

		return shortDescription;
	}

	public String getIconUrl() {

		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {

		this.iconUrl = iconUrl;
	}
}
