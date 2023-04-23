/*
 * Created on 23-04-2023 13:04 by ajarzabe
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

import java.util.List;

import org.springframework.util.Assert;


public class GameProjectDto {

	private final Long id;
	private final String title;
	private final String shortDescription;
	private final String longDescription;
	private final String gameUrl;

	public GameProjectDto(Long id, String title, String shortDescription, String longDescription, String gameUrl) {

		Assert.notNull(id, "id must not be null");
		Assert.notNull(title, "title must not be null");
		Assert.notNull(shortDescription, "shortDescription must not be null");
		Assert.notNull(longDescription, "longDescription must not be null");
		Assert.notNull(gameUrl, "gameUrl must not be null");

		this.id = id;
		this.title = title;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.gameUrl = gameUrl;
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

	public String getLongDescription() {

		return longDescription;
	}

	public String getGameUrl() {

		return gameUrl;
	}
}
