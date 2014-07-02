package com.mercury.data.eve.entity;

import javax.persistence.*;

@Entity
@Table(name = "mapRegions")
public class Region {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "regionID", nullable = false)
  private int id;

  @Column(name = "regionName")
  private String name;

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Region[" + id + "," + name + "]";
  }
}
