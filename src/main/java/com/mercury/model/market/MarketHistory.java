package com.mercury.model.market;

import java.math.BigDecimal;

import javax.persistence.*;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import com.mercury.model.data.Item;
import com.mercury.model.data.Region;

@Entity(name = "market_history")
public class MarketHistory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "region_id")
  private int regionId;

  @Column(name = "item_id")
  private int itemId;

  @Type(type = "org.joda.time.contrib.hibernate.PersistentDateTime")
  private DateTime date;

  @Column(name = "total_orders")
  private int totalOrders;


  @Column(name = "total_qty")
  private int totalQty;

  private BigDecimal low;

  private BigDecimal high;

  private BigDecimal average;

  public MarketHistory() {}

  public MarketHistory(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public int getTotalOrders() {
    return totalOrders;
  }

  public void setTotalOrders(int totalOrders) {
    this.totalOrders = totalOrders;
  }

  public int getRegionId() {
    return regionId;
  }

  public void setRegion(Region region) {
    this.regionId = region.getId();
  }

  public int getItemId() {
    return itemId;
  }

  public void setItem(Item item) {
    this.itemId = item.getId();
  }

  public int getTotalQty() {
    return totalQty;
  }

  public void setTotalQty(int totalQty) {
    this.totalQty = totalQty;
  }

  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public BigDecimal getAverage() {
    return average;
  }

  public void setAverage(BigDecimal average) {
    this.average = average;
  }

  @Override
  public String toString() {
    return "MarketHistory[" + itemId + ":" + regionId + ":" + date + "]";
  }
}
