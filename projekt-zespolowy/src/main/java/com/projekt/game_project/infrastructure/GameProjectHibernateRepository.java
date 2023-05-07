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

	@Override
	public void deleteGameProject(GameProject gameProject) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		gameProject = (GameProject) session.merge(gameProject);
		session.delete(gameProject);
		session.getTransaction().commit();
		session.close();
	}
}
