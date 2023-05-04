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


@Controller
public class MenuController {

	private static final String MENU_URL = "/";
	private static final String ABOUT_URL = "/about";
	private static final String CONTACT_URL = "/contact";

	private static final String MENU_VIEW = "index";
	private static final String ABOUT_VIEW = "about";
	private static final String CONTACT_VIEW = "contact";

	@GetMapping(MENU_URL)
	String getMenuView() {

		return MENU_VIEW;
	}

	@GetMapping(ABOUT_URL)
	String getAboutView() {

		return ABOUT_VIEW;
	}

	@GetMapping(CONTACT_URL)
	String getContactView() {

		return CONTACT_VIEW;
	}
}
