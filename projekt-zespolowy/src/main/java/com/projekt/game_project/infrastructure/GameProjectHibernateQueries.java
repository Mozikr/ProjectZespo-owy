/*
 * Created on 24-04-2023 19:45 by ajarzabe
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

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.projekt.game_project.application.GameProjectDto;
import com.projekt.game_project.application.GameProjectListDto;
import com.projekt.game_project.application.GameProjectQueries;
import com.projekt.game_project.domain.GameProject;


@Service
public class GameProjectHibernateQueries implements GameProjectQueries {

	private final SessionFactory sessionFactory;

	@Autowired
	GameProjectHibernateQueries(SessionFactory sessionFactory) {

		Assert.notNull(sessionFactory, "sessionFactory must not be null");

		this.sessionFactory = sessionFactory;
	}

	@Override
	public GameProjectDto getProjectDto(Long id) {

		try (Session session = sessionFactory.openSession()) {

			CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
			CriteriaQuery<GameProject> criteriaQuery = criteriaBuilder.createQuery(GameProject.class);
			Root<GameProject> root = criteriaQuery.from(GameProject.class);

			criteriaQuery.select(root)
				.where(criteriaBuilder.equal(root.get("id"), id));

			Query<GameProject> query = session.createQuery(criteriaQuery);

			GameProject gameProject = query.uniqueResult();

			if (gameProject == null) {

				return null;
			}

			return new GameProjectDto(gameProject.getId(),
				gameProject.getTitle(),
				gameProject.getShortDescription(),
				gameProject.getLongDescription(),
				gameProject.getGameUrl(),
				gameProject.getPicture1Url(),
				gameProject.getPicture2Url(),
				gameProject.getPicture3Url(),
				gameProject.getIconUrl());
		}
	}

	@Override
	public List<GameProjectListDto> getAllProjectsDto() {

		try (Session session = sessionFactory.openSession()) {

			CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
			CriteriaQuery<GameProject> criteriaQuery = criteriaBuilder.createQuery(GameProject.class);
			Root<GameProject> root = criteriaQuery.from(GameProject.class);

			criteriaQuery.select(root);

			Query<GameProject> query = session.createQuery(criteriaQuery);

			return query.getResultList().stream()
				.map(gameProject -> new GameProjectListDto(gameProject.getId(),
					gameProject.getTitle(),
					gameProject.getShortDescription(),
					gameProject.getIconUrl()))
				.collect(Collectors.toList());
		}
	}
}
