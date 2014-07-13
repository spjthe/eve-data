package com.mercury.model.data;

import java.util.Objects;

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
  public int hashCode() {
    return Objects.hash(getId());
  }

  @Override
  public boolean equals(Object otherObject) {
    if (this == otherObject) {
      return true;
    }
    if (!(otherObject instanceof Region)) {
      return false;
    }
    Region otherRegion = (Region) otherObject;
    return Objects.equals(this.getId(), otherRegion.getId());
  }

  @Override
  public String toString() {
    return "Region[" + id + "," + name + "]";
  }
}
