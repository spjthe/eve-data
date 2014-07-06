package com.mercury.repository.data;

import com.mercury.model.data.Item;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "items", path = "items")
public interface ItemDao extends PagingAndSortingRepository<Item, Integer> {

  Item findById(@Param("id") int id);

  Item findByName(@Param("name") String name);

  List<Item> findByNameContains(@Param("name") String name);
}
