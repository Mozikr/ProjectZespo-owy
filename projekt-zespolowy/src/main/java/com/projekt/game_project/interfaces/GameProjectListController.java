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
import com.projekt.game_project.application.GameProjectListDto;


@Controller
@RequestMapping(GameProjectListController.LIST_PATH)
public class GameProjectListController {

	public static final String LIST_PATH = "/gameProjects-list";
	static final String LIST_VIEW = "game-project-list-view";

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
	List<GameProjectListDto> getGameProjects() {

		return gameProjectAppService.getAllGameProjects();
	}
}
