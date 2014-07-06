package com.mercury.model.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "staStations")
public class Station {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "stationID", nullable = false)
  private int id;

  @ManyToOne
  @JoinColumn(name = "regionID")
  private Region region;

  @ManyToOne
  @JoinColumn(name = "solarSystemID")
  private SolarSystem solarSystem;

  @Column(name = "stationName")
  private String name;

  public int getId() {
    return id;
  }

  public Region getRegion() {
    return region;
  }

  public void setRegion(Region region) {
    this.region = region;
  }

  public SolarSystem getSolarSystem() {
    return solarSystem;
  }

  public void setSolarSystem(SolarSystem solarSystem) {
    this.solarSystem = solarSystem;
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
    if (!(otherObject instanceof Station)) {
      return false;
    }
    Station otherStation = (Station) otherObject;
    return Objects.equals(this.getId(), otherStation.getId());
  }

  @Override
  public String toString() {
    return "Station[" + id + "," + name + "]";
  }
}
