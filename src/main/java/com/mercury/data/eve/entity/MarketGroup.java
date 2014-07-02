package com.mercury.data.eve.entity;

import javax.persistence.*;

@Entity
@Table(name = "invMarketGroups")
public class MarketGroup {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "marketGroupID", nullable = false)
  private int id;

  @Column(name = "marketGroupName")
  private String name;

  private String description;

  @ManyToOne
  @JoinColumn(name = "parentGroupID")
  private MarketGroup parent;

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

  public MarketGroup getParent() {
    return parent;
  }

  public void setParent(MarketGroup parent) {
    this.parent = parent;
  }

  @Override
  public String toString() {
    return "MarketGroup[" + id + "," + name + "]";
  }
}
