package com.mercury.repository.data;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mercury.model.data.SolarSystem;

@Repository
public interface SolarSystemDao extends PagingAndSortingRepository<SolarSystem, Integer> {

  SolarSystem findById(@Param("id") int id);

  SolarSystem findByName(@Param("name") String name);

  List<SolarSystem> findByNameContains(@Param("name") String name);
}
