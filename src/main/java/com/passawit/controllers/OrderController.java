package com.passawit.controllers;

import com.passawit.BrownieMenuFactory;
import com.passawit.models.BrownieMenu;
import com.passawit.models.BrownieOrder;
import com.passawit.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {
  @Autowired
  private static ArrayList<BrownieMenu> cart = new ArrayList<>();
  @Autowired
  private OrderRepository orderRepository;
  private static double totalPrice = 0.0;

  @RequestMapping("/")
  public String index() {
    return "Welcome to Brownie Smart Shop.";
  }

  @GetMapping("/menus")
  public BrownieMenu[] viewBrownieMenuList() {
    return BrownieMenuFactory.getBrownieMenuList();
  }

  @GetMapping("/menus/{id}")
  public BrownieMenu viewBrownieMenu(@PathVariable int id) {
    return BrownieMenuFactory.getBrownieMenu(id);
  }

  @PostMapping("/menus/{id}")
  public String addToCart(@PathVariable int id) {
    cart.add(BrownieMenuFactory.getBrownieMenu(id));
    totalPrice += BrownieMenuFactory.getBrownieMenu(id).getPrice();
    return String.format("\"%s\" has been added to the cart.", BrownieMenuFactory.getBrownieMenu(id).getName());
  }

  @GetMapping("/cart")
  public String viewCart() {
    StringBuilder toString = new StringBuilder(String.format("Total number of items in cart is %d (", cart.size()));
    for (BrownieMenu menu : cart) {
      toString.append(String.format("\"%s\", ", menu.getName()));
    }
    toString.append(String.format("). Total price is %.2f", totalPrice));
    return toString.toString();
  }

  @GetMapping("/orders")
  public List<BrownieOrder> retrieveAllOrders() {
    return orderRepository.findAll();
  }

  @GetMapping("/orders/{id}")
  public BrownieOrder retrieveOrder(@PathVariable long id) {
    Optional<BrownieOrder> order = orderRepository.findById(id);
    return order.get();
  }

  @PostMapping("/orders")
  public String createOrder(@RequestBody String customerName) {
    BrownieOrder brownieOrder = new BrownieOrder(customerName, cart, totalPrice);
    BrownieOrder savedBrownieOrder = orderRepository.save(brownieOrder);

    URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedBrownieOrder.getId()).toUri();

    cart.clear();
    totalPrice = 0;

    return String.format("Order %d has been placed.", brownieOrder.getId());
  }

  @DeleteMapping("/orders/{id}")
  public String deleteOrder(@PathVariable long id) {
    orderRepository.deleteById(id);

    return String.format("Order %d has been cancelled.", id);
  }

}
