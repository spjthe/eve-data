package com.mercury.data.eve.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mercury.data.eve.entity.Station;

@RepositoryRestResource(collectionResourceRel = "stations", path = "stations")
public interface StationDao extends PagingAndSortingRepository<Station, Integer> {

  Station findById(@Param("id") int id);

  Station findByName(@Param("name") String name);

  List<Station> findByNameContains(@Param("name") String name);

}
