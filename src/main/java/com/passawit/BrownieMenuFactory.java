package com.passawit;

public class BrownieMenuFactory {
  public static final BrownieMenu[] BROWNIE_MENUS = new BrownieMenu[] {
    new BrownieMenu("Set A", "A swirl brownies set include Tahini swirl, Condensed milk and Jam", new Brownie[] {
      new Brownie(1),
      new Brownie(2),
      new Brownie(3)
    }, 89),
    new BrownieMenu("Set B", "A sprinkle brownies set include Peppermint patties, Ritz crackers and Oreos", new Brownie[] {
      new Brownie(4),
      new Brownie(5),
      new Brownie(6)
    }, 89),
    new BrownieMenu("Set C", "A drop brownies set include Chocolate streusel, Peanut butter cookie dough and Black bottom", new Brownie[] {
      new Brownie(7),
      new Brownie(8),
      new Brownie(9)
    }, 89),
    new BrownieMenu("Set D", "A swoosh brownies set include Salted caramel, Matcha glaze and Nutella fudge", new Brownie[] {
      new Brownie(10),
      new Brownie(11),
      new Brownie(12)
    }, 89),
    new BrownieMenu("Set E", "A 12 brownies set include all topping.", new Brownie[] {
      new Brownie(1),
      new Brownie(2),
      new Brownie(3),
      new Brownie(4),
      new Brownie(5),
      new Brownie(6),
      new Brownie(7),
      new Brownie(8),
      new Brownie(9),
      new Brownie(10),
      new Brownie(11),
      new Brownie(12)
    }, 349)
  };

  public static BrownieMenu getBrownieMenu(int menu) {
    return BROWNIE_MENUS[menu];
  }

  public static BrownieMenu[] getBrownieMenuList() {
    return BROWNIE_MENUS;
  }

}
