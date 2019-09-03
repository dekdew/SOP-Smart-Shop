package com.passawit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class SmartShopApplication {
  private static ArrayList<BrownieMenu> cart = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(SmartShopApplication.class, args);
	}

  @RequestMapping("/")
  String index() {
    return "Welcome to Brownie Smart Shop.";
  }

  @RequestMapping("/menus")
  BrownieMenu[] viewBrownieMenuList() {
	  return BrownieMenuFactory.getBrownieMenuList();
  }

  @RequestMapping("/menu/{id}")
  BrownieMenu viewBrownieMenu(@PathVariable int id) {
    return BrownieMenuFactory.getBrownieMenu(id);
  }

  @RequestMapping("/menu/{id}/add")
  String addToCart(@PathVariable int id) {
	  cart.add(BrownieMenuFactory.getBrownieMenu(id));
	  return String.format("\"%s\" has been added to the cart.", BrownieMenuFactory.getBrownieMenu(id).getName());
  }

  @RequestMapping("/cart")
  String viewCart() {
    double total = cart.stream().mapToDouble(BrownieMenu::getPrice).sum();
    StringBuilder toString = new StringBuilder(String.format("Total number of items in cart is %d (", cart.size()));
    for (BrownieMenu menu : cart) {
      toString.append(String.format("\"%s\", ", menu.getName()));
    }
    toString.append(String.format(") Total: %.2f", total));
    return toString.toString();
  }

  @RequestMapping("/checkout")
  String checkout() {
    double total = cart.stream().mapToDouble(BrownieMenu::getPrice).sum();
    cart.clear();
    return "Order has been received. Total price is " + total;
  }

}
