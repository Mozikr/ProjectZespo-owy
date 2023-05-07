package com.projekt.game_project.interfaces;

import javax.persistence.Column;

import com.projekt.game_project.application.GameProjectDto;


public class GameProjectForm {


	private Long id;
	private String title;
	private String shortDescription;
	private String longDescription;
	private String gameUrl;
	private String picture1Url;
	private String picture2Url;
	private String picture3Url;
	private String iconUrl;

	public GameProjectForm() {

	}

	public GameProjectForm(Long id,
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
