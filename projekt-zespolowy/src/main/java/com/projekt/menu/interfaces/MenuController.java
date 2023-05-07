package com.projekt.menu.interfaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MenuController {

	public static final String MENU_URL = "/";
	public static final String ABOUT_URL = "/about";
	public static final String CONTACT_URL = "/contact";

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
