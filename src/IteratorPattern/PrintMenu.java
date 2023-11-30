package IteratorPattern;

import java.util.List;

public class PrintMenu {
  public static void main(String[] args) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
    DinerMenu dinerMenu = new DinerMenu();
    MenuItem[] lunchItems = dinerMenu.getMenuItems();

    for(int i = 0; i < breakfastItems.size(); i++) {
      MenuItem menuItem = breakfastItems.get(i);
      System.out.println(menuItem.getName() + " ");
      System.out.println(menuItem.getPrice() + " ");
      System.out.println(menuItem.getDescription() + " ");
    }
    for(int i = 0; i < lunchItems.length; i++) {
      MenuItem menuItem = lunchItems[i];
      System.out.println(menuItem.getName() + " ");
      System.out.println(menuItem.getPrice() + " ");
      System.out.println(menuItem.getDescription() + " ");
    }
  }
}

/**
 * Iterator iterator = breakfastMenu.createIterator();
 * while (iterator.hasNext())
 *    MenuItem menuItem = (MenuItem) iterator.next();
 *
 * iterator = lunchMenu.createIterator();
 * while(iterator.hasNext())
 *    MenuItem menuItem = (MenuItem) iterator.next();
 */