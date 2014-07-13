package com.mercury.repository.market;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.mercury.model.market.MarketHistory;

@Repository
public interface MarketHistoryDao extends PagingAndSortingRepository<MarketHistory, Integer> {

  List<MarketHistory> findByItemId(int itemId);
}
