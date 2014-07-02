package com.mercury.data.eve.entity;

import javax.persistence.*;

@Entity
@Table(name = "invGroups")
public class Group {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "groupID", nullable = false)
  private int id;

  @Column(name = "groupName")
  private String name;

  private String description;

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return "Group[" + id + "," + name + "]";
  }
}
