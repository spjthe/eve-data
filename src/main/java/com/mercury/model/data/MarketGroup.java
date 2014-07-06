package com.mercury.model.data;

import javax.persistence.*;
import java.util.Objects;

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
  public int hashCode() {
    return Objects.hash(getId());
  }

  @Override
  public boolean equals(Object otherObject) {
    if (this == otherObject) {
      return true;
    }
    if (!(otherObject instanceof MarketGroup)) {
      return false;
    }
    MarketGroup otherMarketGroup = (MarketGroup) otherObject;
    return Objects.equals(this.getId(), otherMarketGroup.getId());
  }

  @Override
  public String toString() {
    return "MarketGroup[" + id + "," + name + "]";
  }
}
