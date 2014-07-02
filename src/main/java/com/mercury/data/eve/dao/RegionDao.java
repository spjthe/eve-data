package com.mercury.data.eve.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mercury.data.eve.entity.Region;

@RepositoryRestResource(collectionResourceRel = "regions", path = "regions")
public interface RegionDao extends PagingAndSortingRepository<Region, Integer> {

  Region findById(@Param("id") int id);

  Region findByName(@Param("name") String name);

  List<Region> findByNameContains(@Param("name") String name);
}
