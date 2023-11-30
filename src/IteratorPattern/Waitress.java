package IteratorPattern;

import IteratorPattern.DefineIteratorAndMenuIterator.Iterator;

public class Waitress {

  PancakeHouseMenu pancakeHouseMenu;
  DinerMenu dinerMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu() {
    Iterator pancakeIterator = pancakeHouseMenu.createIterator();
    Iterator dinerIterator = dinerMenu.createIterator();
    System.out.println("Menu\n----\nBREAKFAST");
    printMenu(pancakeIterator); //PancakeHouseMenu 이름 출력
    System.out.println("\nLUNCH");
    printMenu(dinerIterator); //DinerMenu 이름 출력
  }

  private void printMenu(Iterator iterator) {
    while(iterator.hasNext()) {
      MenuItem menuItem = (MenuItem) iterator.next();
      System.out.println(menuItem.getName() + ", ");
    }
  }
}
