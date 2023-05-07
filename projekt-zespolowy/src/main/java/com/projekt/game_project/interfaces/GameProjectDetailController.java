package com.projekt.game_project.interfaces;

import static com.projekt.game_project.interfaces.GameProjectDetailController.DETAIL_PATH;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projekt.game_project.application.GameProjectAppService;
import com.projekt.game_project.application.GameProjectDto;


@Controller
@RequestMapping(DETAIL_PATH)
public class GameProjectDetailController {

	public static final String DETAIL_PATH = "/gameProject-detail";
	private static final String DETAIL_VIEW = "game-project-detail-view";

	private static final String M_GAME_PROJECT = "game";
	private static final String P_ID = "id";

	private final GameProjectAppService gameProjectAppService;

	@Autowired
	GameProjectDetailController(GameProjectAppService gameProjectAppService) {

		Assert.notNull(gameProjectAppService, "gameProjectAppService must not be null");

		this.gameProjectAppService = gameProjectAppService;
	}

	@GetMapping
	String getDetailView(Model model, @RequestParam(P_ID) Long id) {

		model.addAttribute(M_GAME_PROJECT, gameProjectAppService.getGameProject(id));

		return DETAIL_VIEW;
	}
}
