package com.mercury.repository.data;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mercury.model.data.Station;

@Repository
public interface StationDao extends PagingAndSortingRepository<Station, Integer> {

  Station findById(@Param("id") int id);

  Station findByName(@Param("name") String name);

  List<Station> findByNameContains(@Param("name") String name);

}
