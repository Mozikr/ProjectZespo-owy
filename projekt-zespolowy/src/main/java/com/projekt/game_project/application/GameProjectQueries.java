package com.projekt.game_project.application;

import java.util.List;

import com.projekt.game_project.domain.GameProject;


public interface GameProjectQueries {

	GameProjectDto getProjectDto(Long id);

	List<GameProjectListDto> getAllProjectsDto();
	GameProject get(Long id);
}
