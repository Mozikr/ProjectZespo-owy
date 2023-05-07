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
