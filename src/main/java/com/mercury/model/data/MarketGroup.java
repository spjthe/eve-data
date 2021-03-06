package com.mercury.model.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

  @OneToMany(mappedBy = "parent")
  private List<MarketGroup> children = new ArrayList<>();

  @OneToMany(mappedBy = "marketGroup")
  List<Item> items = new ArrayList<>();

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

  public List<MarketGroup> getChildren() {
    return children;
  }

  public void setChildren(List<MarketGroup> children) {
    this.children = children;
  }

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
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
