package com.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cinema.entities.Cinema;
import com.cinema.entities.Place;
import com.cinema.entities.Salle;


@RepositoryRestResource
@CrossOrigin("*")
public interface PlaceRepository extends JpaRepository<Place,Long> {package com.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cinema.entities.Cinema;
import com.cinema.entities.Place;
import com.cinema.entities.Salle;


@RepositoryRestResource
@CrossOrigin("*")
public interface PlaceRepository extends JpaRepository<Place,Long> {

}
