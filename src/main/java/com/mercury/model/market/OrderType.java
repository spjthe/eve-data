package com.mercury.model.market;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "order_type")
public class OrderType {

  public static final OrderType BUY = new OrderType(1, "Buy Order");
  public static final OrderType SELL = new OrderType(2, "Sell Order");

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;

  public OrderType() {}

  public OrderType(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "OrderType[" + id + ":" + name + "]";
  }
}
