package com.passawit.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class BrownieOrder {
  @Id
  @GeneratedValue
  private Long id;
  private String customerName;
  private ArrayList<BrownieMenu> cart;
  private double totalPrice;

  public BrownieOrder() { }

  public BrownieOrder(String customerName, ArrayList<BrownieMenu> cart, double totalPrice) {
    this.customerName = customerName;
    this.cart = cart;
    this.totalPrice = totalPrice;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public ArrayList<BrownieMenu> getCart() {
    return cart;
  }

  public void setCart(ArrayList<BrownieMenu> cart) {
    this.cart = cart;
  }

  public double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }
}