package com.passawit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SmartShopApplication {

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

}
