package com.projekt.game_project.application;

import com.projekt.game_project.domain.GameProject;
import com.projekt.game_project.interfaces.GameProjectForm;


public interface GameProjectRepository {

	void saveOrUpdateProject(GameProject gameProject);
	void deleteGameProject(GameProject gameProject);
}
