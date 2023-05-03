/*
 * Created on 23-04-2023 13:13 by ajarzabe
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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.projekt.game_project.domain.GameProject;
import com.projekt.game_project.interfaces.GameProjectForm;


@Service
public class GameProjectAppService {

	private final GameProjectQueries gameProjectQueries;
	private final GameProjectRepository gameProjectRepository;

	@Autowired
	GameProjectAppService(GameProjectQueries gameProjectQueries, GameProjectRepository gameProjectRepository) {

		Assert.notNull(gameProjectQueries, "gameProjectQueries must not be null");
		Assert.notNull(gameProjectRepository, "gameProjectRepository must not be null");

		this.gameProjectQueries = gameProjectQueries;
		this.gameProjectRepository = gameProjectRepository;
	}

	public GameProjectDto getGameProject(Long id) {

		return gameProjectQueries.getProjectDto(id);
	}

	public List<GameProjectListDto> getAllGameProjects() {

		return gameProjectQueries.getAllProjectsDto();
	}

	public void saveOrUpdateProject(GameProjectForm gameProjectForm) {

		GameProject gameProject = new GameProject(gameProjectForm.getId(),
			gameProjectForm.getTitle(),
			gameProjectForm.getShortDescription(),
			gameProjectForm.getLongDescription(),
			gameProjectForm.getGameUrl(),
			gameProjectForm.getPicture1Url(),
			gameProjectForm.getPicture2Url(),
			gameProjectForm.getPicture3Url(),
			gameProjectForm.getIconUrl());

		gameProjectRepository.saveOrUpdateProject(gameProject);
	}
}
