package TemplateMethodPattern;

public class Coffee extends CaffeineBeverage {

  public void brew() {
    System.out.println("Dripping Coffee through filter");
  }

  public void addCondiments() {
    System.out.println("Adding Sugar and Milk");
  }

//  public void brewCoffeeGrinds() {
//    System.out.println("Dripping Coffee through filter");
//  }
//
//  public void addSugarAndMilk() {
//    System.out.println("Adding Sugar and Milk");
//  }

}
