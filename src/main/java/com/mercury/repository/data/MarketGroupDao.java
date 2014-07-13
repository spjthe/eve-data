package com.mercury.repository.data;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.mercury.model.data.MarketGroup;

@Repository
public interface MarketGroupDao extends PagingAndSortingRepository<MarketGroup, Integer> {
  List<MarketGroup> findByParentIsNull();
}
