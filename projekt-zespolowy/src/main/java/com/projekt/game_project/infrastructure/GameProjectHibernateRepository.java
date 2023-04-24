/*
 * Created on 24-04-2023 19:56 by ajarzabe
 *
 * Copyright (c) 2001-2023 Unity S.A.
 * ul. Przedmiejska 6-10, 54-201 Wrocław, Poland
 * Wszelkie prawa zastrzeżone
 *
 * Niniejsze oprogramowanie jest własnością Unity S.A.
 * Wykorzystanie niniejszego oprogramowania jest możliwe tylko na podstawie
 * i w zgodzie z warunkami umowy licencyjnej zawartej z Unity S.A.
 */

package com.projekt.game_project.infrastructure;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.projekt.game_project.application.GameProjectRepository;
import com.projekt.game_project.domain.GameProject;


@Service
public class GameProjectHibernateRepository implements GameProjectRepository {

	private final SessionFactory sessionFactory;

	@Autowired
	GameProjectHibernateRepository(SessionFactory sessionFactory) {

		Assert.notNull(sessionFactory, "sessionFactory must not be null");

		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveOrUpdateProject(GameProject gameProject) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(gameProject);
		session.getTransaction().commit();
		session.close();
	}
}
