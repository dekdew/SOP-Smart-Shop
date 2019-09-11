package com.passawit.models;

import java.io.Serializable;

public class Brownie implements Serializable {
  private static final String[] ALL_TOPPINGS = new String[] {
    "Original",
    "Tahini swirl",
    "Condensed milk",
    "Jam",
    "Peppermint patties",
    "Ritz crackers",
    "Oreos",
    "Chocolate streusel",
    "Peanut butter cookie dough",
    "Black bottom",
    "Salted caramel",
    "Matcha glaze",
    "Nutella fudge"
  };

  private int id;
  private String topping;

  public Brownie(int topping) {
    this.id = topping;
    this.topping = getToppingName(topping);
  }

  public int getId() { return id; }

  public String getTopping() { return topping; }

  private static String getToppingName(int id) {
    return Brownie.ALL_TOPPINGS[id];
  }

  public void setTopping(int topping) {
    if (topping < 0 || topping >= Brownie.ALL_TOPPINGS.length) {
      this.id = 0;
      this.topping = getToppingName(0);
    } else {
      this.id = topping;
      this.topping = getToppingName(topping);
    }
  }

}
