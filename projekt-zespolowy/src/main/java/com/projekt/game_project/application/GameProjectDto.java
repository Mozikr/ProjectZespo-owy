package com.projekt.game_project.application;

import java.util.List;

import org.springframework.util.Assert;


public class GameProjectDto {

	private final Long id;
	private final String title;
	private final String shortDescription;
	private final String longDescription;
	private final String gameUrl;
	private String picture1Url;
	private String picture2Url;
	private String picture3Url;
	private String iconUrl;

	public GameProjectDto(Long id,
		String title,
		String shortDescription,
		String longDescription,
		String gameUrl,
		String picture1Url,
		String picture2Url,
		String picture3Url,
		String iconUrl) {

		this.id = id;
		this.title = title;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.gameUrl = gameUrl;
		this.picture1Url = picture1Url;
		this.picture2Url = picture2Url;
		this.picture3Url = picture3Url;
		this.iconUrl = iconUrl;
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

	public String getPicture1Url() {

		return picture1Url;
	}

	public void setPicture1Url(String picture1Url) {

		this.picture1Url = picture1Url;
	}

	public String getPicture2Url() {

		return picture2Url;
	}

	public void setPicture2Url(String picture2Url) {

		this.picture2Url = picture2Url;
	}

	public String getPicture3Url() {

		return picture3Url;
	}

	public void setPicture3Url(String picture3Url) {

		this.picture3Url = picture3Url;
	}

	public String getIconUrl() {

		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {

		this.iconUrl = iconUrl;
	}
}
