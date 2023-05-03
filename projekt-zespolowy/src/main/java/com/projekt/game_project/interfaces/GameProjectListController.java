/*
 * Created on 23-04-2023 13:00 by ajarzabe
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

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projekt.game_project.application.GameProjectAppService;
import com.projekt.game_project.application.GameProjectDto;


@Controller
@RequestMapping(GameProjectListController.LIST_PATH)
public class GameProjectListController {

	static final String LIST_PATH = "/gameProjects-list";
	private static final String LIST_VIEW = "Projects.html";

	private static final String M_GAME_PROJECTS = "gameProjects";


	private final GameProjectAppService gameProjectAppService;

	@Autowired
	GameProjectListController(GameProjectAppService gameProjectAppService) {

		Assert.notNull(gameProjectAppService, "gameProjectAppService must not be null");

		this.gameProjectAppService = gameProjectAppService;
	}

	@GetMapping()
	String getListView() {

		return LIST_VIEW;
	}

	@ModelAttribute(M_GAME_PROJECTS)
	List<GameProjectDto> getGameProjects() {

		return gameProjectAppService.getAllGameProjects();
	}
}
