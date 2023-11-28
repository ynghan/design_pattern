package TemplateMethodPattern;

import AdapterFacadePattern.hw4.MyHWInfo;

public class BeverageTestDrive {
  public static void main(String[] args) {
    MyHWInfo.printInfo();
    Tea tea = new Tea();
    Coffee coffee = new Coffee();
    System.out.println("\nMaking tea...");
    tea.prepareRecipe();
    System.out.println("\nMaking coffee...");
    coffee.prepareRecipe();
    TeaWithHook teaHook = new TeaWithHook();
    CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
    System.out.println("\nMaking tea...");
    teaHook.prepareRecipe();
    System.out.println("\nMaking coffee...");
    coffeeWithHook.prepareRecipe();

  }
}
