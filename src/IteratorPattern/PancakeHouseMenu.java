package IteratorPattern;

import IteratorPattern.DefineIteratorAndMenuIterator.Iterator;
import IteratorPattern.DefineIteratorAndMenuIterator.PancakeHouseMenuIterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
  private final List<MenuItem> menuItems;

  public PancakeHouseMenu() {
    menuItems = new ArrayList<>();
    addItem("Regular Pancake Breakfast",
            "Pancakes with fried eggs, sausage", false, 2.99);
    addItem("Blueberry pancakes",
            "Pancakes made with fresh blueberries", true, 3.49);
    addItem("K&B's Pancake Breakfast","Pancakes with scrambled eggs, and toast", true, 2.99);
    addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
   }

  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.add(menuItem);
  }

//  public List<MenuItem> getMenuItems() {
//    return menuItems;
//  }

  public Iterator createIterator() {
    return new PancakeHouseMenuIterator(menuItems);
  }
}
