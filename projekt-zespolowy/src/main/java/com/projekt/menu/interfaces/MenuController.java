/*
 * Created on 19-04-2023 19:57 by ajarzabe
 *
 * Copyright (c) 2001-2023 Unity S.A.
 * ul. Przedmiejska 6-10, 54-201 Wrocław, Poland
 * Wszelkie prawa zastrzeżone
 *
 * Niniejsze oprogramowanie jest własnością Unity S.A.
 * Wykorzystanie niniejszego oprogramowania jest możliwe tylko na podstawie
 * i w zgodzie z warunkami umowy licencyjnej zawartej z Unity S.A.
 */

package com.projekt.menu.interfaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(MenuController.MENU_URL)
public class MenuController {

	static final String MENU_URL = "/";
	private static final String MENU_VIEW_NAME = "static/index.html";

	@GetMapping
	String getMenuView() {

		return MENU_VIEW_NAME;
	}
}
