package com.mercury.data.eve.entity;

import javax.persistence.*;

@Entity
@Table(name = "mapSolarSystems")
public class SolarSystem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "solarSystemID")
  private int id;

  @ManyToOne
  @JoinColumn(name = "regionID")
  private Region region;

  @Column(name = "solarSystemName")
  private String name;

  @Column(name = "security")
  private double securityStatus;

  public int getId() {
    return id;
  }

  public Region getRegion() {
    return region;
  }

  public void setRegion(Region region) {
    this.region = region;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSecurityStatus() {
    return securityStatus;
  }

  public void setSecurityStatus(double securityStatus) {
    this.securityStatus = securityStatus;
  }

  @Override
  public String toString() {
    return "SolarSystem[" + id + "," + name + "]";
  }
}
