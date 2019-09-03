package com.passawit;

public class BrownieMenu {
  private String name;
  private String details;
  private Brownie[] brownies;
  private double price;

  public BrownieMenu(String name, String details, Brownie[] brownies, double price) {
    this.name = name;
    this.details = details;
    this.brownies = brownies;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public Brownie[] getBrownies() {
    return brownies;
  }

  public void setBrownies(Brownie[] brownies) {
    this.brownies = brownies;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
