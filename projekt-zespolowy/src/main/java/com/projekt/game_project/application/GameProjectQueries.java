/*
 * Created on 23-04-2023 13:06 by ajarzabe
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


public interface GameProjectQueries {

	GameProjectDto getProjectDto(Long id);

	List<GameProjectDto> getAllProjectsDto();
}
