/*
 * Created on 23-04-2023 13:23 by ajarzabe
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

import static com.projekt.game_project.interfaces.GameProjectListController.LIST_PATH;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projekt.game_project.application.GameProjectAppService;


@Controller
@RequestMapping(GameProjectEditController.EDIT_PATH)
public class GameProjectEditController {

	public static final String EDIT_PATH = "/gameProject-edit";
	private static final String EDIT_VIEW = "game-project-edit-view";

	private static final String P_GAME_PROJECT_ID = "id";
	private static final String M_GAME_PROJECT = "gameProject";

	private final GameProjectFormFactory gameProjectFormFactory;
	private final GameProjectAppService gameProjectAppService;

	@Autowired
	GameProjectEditController(GameProjectFormFactory gameProjectFormFactory, GameProjectAppService gameProjectAppService) {

		Assert.notNull(gameProjectFormFactory, "gameProjectFormFactory must not be null");
		Assert.notNull(gameProjectAppService, "gameProjectAppService must not be null");

		this.gameProjectFormFactory = gameProjectFormFactory;
		this.gameProjectAppService = gameProjectAppService;
	}

	@GetMapping
	String getEditView(Model model, @RequestParam(required = false, name = P_GAME_PROJECT_ID) Long id) {

		if (id == null) {

			model.addAttribute(M_GAME_PROJECT, gameProjectFormFactory.getEmptyGameProjectForm());
		}
		else {

			model.addAttribute(M_GAME_PROJECT, gameProjectFormFactory.getProjectFormById(id));
		}

		return EDIT_VIEW;
	}

	@PostMapping
	String saveOrUpdateProject(@ModelAttribute(M_GAME_PROJECT) GameProjectForm gameProjectForm) {

		gameProjectAppService.saveOrUpdateProject(gameProjectForm);

		return "redirect:" + LIST_PATH;
	}
}