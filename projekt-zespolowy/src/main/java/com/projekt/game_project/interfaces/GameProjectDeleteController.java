package com.projekt.game_project.interfaces;

import static com.projekt.game_project.interfaces.GameProjectDeleteController.DELETE_URL;
import static com.projekt.game_project.interfaces.GameProjectListController.LIST_PATH;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projekt.game_project.application.GameProjectAppService;


@Controller
@RequestMapping(DELETE_URL)
public class GameProjectDeleteController {

	public static final String DELETE_URL = "/gameProject-delete";
	private static final String P_ID = "id";

	private final GameProjectAppService gameProjectAppService;

	@Autowired
	GameProjectDeleteController(GameProjectAppService gameProjectAppService) {

		Assert.notNull(gameProjectAppService, "gameProjectAppService must not be null");

		this.gameProjectAppService = gameProjectAppService;
	}

	@GetMapping
	String deleteProject(@RequestParam(P_ID) Long id) {

		gameProjectAppService.deleteGameProject(id);

		return "redirect:" + LIST_PATH;
	}
}
