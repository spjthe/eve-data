package com.mercury.repository.data;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mercury.model.data.Region;

@Repository
public interface RegionDao extends PagingAndSortingRepository<Region, Integer> {

  Region findById(@Param("id") int id);

  Region findByName(@Param("name") String name);

  List<Region> findByNameContains(@Param("name") String name);
}
