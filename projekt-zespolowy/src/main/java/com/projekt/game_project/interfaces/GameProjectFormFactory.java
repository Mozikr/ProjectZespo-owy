/*
 * Created on 23-04-2023 14:07 by ajarzabe
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

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.projekt.game_project.application.GameProjectAppService;
import com.projekt.game_project.application.GameProjectDto;


@Service
public class GameProjectFormFactory {


	private final GameProjectAppService gameProjectAppService;

	@Autowired
	GameProjectFormFactory(GameProjectAppService gameProjectAppService) {

		Assert.notNull(gameProjectAppService, "gameProjectAppService must not be null");

		this.gameProjectAppService = gameProjectAppService;
	}

	public GameProjectForm getEmptyGameProjectForm() {

		return new GameProjectForm();
	}

	public GameProjectForm getProjectFormById(Long id) {

		GameProjectDto gameProjectDto = gameProjectAppService.getGameProject(id);

		if (gameProjectDto == null) {

			throw new EntityNotFoundException();
		}

		return new GameProjectForm(gameProjectDto.getId(),
			gameProjectDto.getTitle(),
			gameProjectDto.getShortDescription(),
			gameProjectDto.getLongDescription(),
			gameProjectDto.getGameUrl(),
			gameProjectDto.getPicture1Url(),
			gameProjectDto.getPicture2Url(),
			gameProjectDto.getPicture3Url(),
			gameProjectDto.getIconUrl());
	}
}
