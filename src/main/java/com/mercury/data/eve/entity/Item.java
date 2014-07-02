package com.mercury.data.eve.entity;

import javax.persistence.*;

@Entity
@Table(name = "invTypes")
public class Item {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "typeID", nullable = false)
  private int id;

  @Column(name = "typeName")
  private String name;

  private String description;

  @ManyToOne
  @JoinColumn(name = "groupID")
  private Group group;

  @ManyToOne
  @JoinColumn(name = "marketGroupID")
  private MarketGroup marketGroup;

  private double mass;

  private double volume;

  private double capacity;

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Group getGroup() {
    return group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  public MarketGroup getMarketGroup() {
    return marketGroup;
  }

  public void setMarketGroup(MarketGroup marketGroup) {
    this.marketGroup = marketGroup;
  }

  public double getMass() {
    return mass;
  }

  public void setMass(double mass) {
    this.mass = mass;
  }

  public double getVolume() {
    return volume;
  }

  public void setVolume(double volume) {
    this.volume = volume;
  }

  public double getCapacity() {
    return capacity;
  }

  public void setCapacity(double capacity) {
    this.capacity = capacity;
  }

  @Override
  public String toString() {
    return "Item[" + id + "," + name + "]";
  }
}
