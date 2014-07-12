package com.mercury.repository.data;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mercury.model.data.MarketGroup;

@RepositoryRestResource(collectionResourceRel = "marketGroups", path = "marketGroups")
public interface MarketGroupDao extends PagingAndSortingRepository<MarketGroup, Integer> {
  List<MarketGroup> findByParentIsNull();
}
