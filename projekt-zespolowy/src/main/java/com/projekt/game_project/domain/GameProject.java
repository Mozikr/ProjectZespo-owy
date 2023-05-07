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

	@Column
	private String title;

	@Column
	private String shortDescription;

	@Column
	private String longDescription;

	@Column
	private String gameUrl;

	@Column(name = "picture1_url")
	private String picture1Url;

	@Column(name = "picture2_url")
	private String picture2Url;

	@Column(name = "picture3_url")
	private String picture3Url;

	@Column
	private String iconUrl;

	public GameProject(Long id,
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

	public GameProject() {

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
