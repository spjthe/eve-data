package com.mercury.data.eve.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mercury.data.eve.entity.SolarSystem;

@RepositoryRestResource(collectionResourceRel = "solarSystems", path = "solarSystems")
public interface SolarSystemDao extends PagingAndSortingRepository<SolarSystem, Integer> {

  SolarSystem findById(@Param("id") int id);

  SolarSystem findByName(@Param("name") String name);

  List<SolarSystem> findByNameContains(@Param("name") String name);
}
