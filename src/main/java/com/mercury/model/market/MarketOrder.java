package com.mercury.model.market;

import java.math.BigDecimal;

import javax.persistence.*;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import com.mercury.model.data.Item;
import com.mercury.model.data.Region;
import com.mercury.model.data.SolarSystem;
import com.mercury.model.data.Station;

@Entity(name = "market_order")
public class MarketOrder {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "region_id")
  private int regionId;

  @Column(name = "item_id")
  private int itemId;

  private BigDecimal price;

  @Column(name = "volume_remaining")
  private int volumeRemaining;

  @Column(name = "order_range")
  private int range;

  @Column(name = "volume_original")
  private int volumeOriginal;

  @Column(name = "volume_minimum")
  private int volumeMinimum;

  @ManyToOne
  @JoinColumn(name = "order_type_id")
  private OrderType orderType;

  @Type(type = "org.joda.time.contrib.hibernate.PersistentDateTime")
  @Column(name = "date_issued")
  private DateTime dateIssued;

  private int duration;

  @Column(name = "station_id")
  private int stationId;

  @Column(name = "solar_system_id")
  private int solarSystemId;

  @Type(type = "org.joda.time.contrib.hibernate.PersistentDateTime")
  @Column(name = "date_generated")
  private DateTime dateGenerated;

  public MarketOrder() {}

  public MarketOrder(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
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

  public void setItemId(Item item) {
    this.itemId = item.getId();
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public int getVolumeRemaining() {
    return volumeRemaining;
  }

  public void setVolumeRemaining(int volumeRemaining) {
    this.volumeRemaining = volumeRemaining;
  }

  public int getRange() {
    return range;
  }

  public void setRange(int range) {
    this.range = range;
  }

  public int getVolumeOriginal() {
    return volumeOriginal;
  }

  public void setVolumeOriginal(int volumeOriginal) {
    this.volumeOriginal = volumeOriginal;
  }

  public int getVolumeMinimum() {
    return volumeMinimum;
  }

  public void setVolumeMinimum(int volumeMinimum) {
    this.volumeMinimum = volumeMinimum;
  }

  public OrderType getOrderType() {
    return orderType;
  }

  public void setOrderType(OrderType orderType) {
    this.orderType = orderType;
  }

  public DateTime getDateIssued() {
    return dateIssued;
  }

  public void setDateIssued(DateTime dateIssued) {
    this.dateIssued = dateIssued;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public int getStationId() {
    return stationId;
  }

  public void setStationId(Station station) {
    this.stationId = station.getId();
  }

  public int getSolarSystemId() {
    return solarSystemId;
  }

  public void setSolarSystemId(SolarSystem solarSystem) {
    this.solarSystemId = solarSystem.getId();
  }

  public DateTime getDateGenerated() {
    return dateGenerated;
  }

  public void setDateGenerated(DateTime dateGenerated) {
    this.dateGenerated = dateGenerated;
  }

  @Override
  public String toString() {
    return "MarketOrder[" + itemId + ":" + regionId + ":" + dateGenerated + "]";
  }
}
