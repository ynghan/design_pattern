package TemplateMethodPattern;

public class Tea extends CaffeineBeverage {

  public void brew() {
    System.out.println("Steeping the tea");
  }

  public void addCondiments() {
    System.out.println("Adding Lemon");
  }

//  public void steepTeaBag() {
//    System.out.println("Steeping the tea");
//  }
//
//  public void addLemon() {
//    System.out.println("Adding Lemon");
//  }

}
