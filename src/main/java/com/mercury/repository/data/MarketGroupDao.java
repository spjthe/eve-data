package com.mercury.repository.data;

import java.util.List;

import com.mercury.model.data.MarketGroup;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "marketGroups", path = "marketGroups")
public interface MarketGroupDao extends PagingAndSortingRepository<MarketGroup, Integer> {
  List<MarketGroup> findByParentIsNull();
}
