package com.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


import com.cinema.entities.Ville;
@CrossOrigin("*")
@RepositoryRestResource
public interface VilleRepository extends JpaRepository<Ville,Long> {

}
                                                                       package com.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


import com.cinema.entities.Ville;
@CrossOrigin("*")
@RepositoryRestResource
public interface VilleRepository extends JpaRepository<Ville,Long> {

}
