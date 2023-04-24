/*
 * Created on 19-04-2023 20:23 by ajarzabe
 *
 * Copyright (c) 2001-2023 Unity S.A.
 * ul. Przedmiejska 6-10, 54-201 Wrocław, Poland
 * Wszelkie prawa zastrzeżone
 *
 * Niniejsze oprogramowanie jest własnością Unity S.A.
 * Wykorzystanie niniejszego oprogramowania jest możliwe tylko na podstawie
 * i w zgodzie z warunkami umowy licencyjnej zawartej z Unity S.A.
 */

package com.projekt.game_project.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.util.Assert;


@Entity(name = "game_projects")
public class GameProject {

	@Id
	@GeneratedValue
	@Column(updatable = false)
	private Long id;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private String shortDescription;

	@Column(nullable = false)
	private String longDescription;

	@Column
	private String gameUrl;

	public GameProject(Long id, String title, String shortDescription, String longDescription, String gameUrl) {

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

	public GameProject() {}

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
