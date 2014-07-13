package com.mercury.repository.market;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.mercury.model.market.MarketOrder;

@Repository
public interface MarketOrderDao extends PagingAndSortingRepository<MarketOrder, Integer> {

  List<MarketOrder> findByItemId(int itemId);
}
