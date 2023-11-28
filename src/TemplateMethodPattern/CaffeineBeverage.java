package TemplateMethodPattern;

public abstract class CaffeineBeverage {

  //Template Method
  final void prepareRecipe() {
    boilwater();
    brew();
    pourInCup();
//    addCondiments();
    if(customerWantsCondiments()) addCondiments();
  }

  abstract void brew();
  abstract void addCondiments();

  public void boilwater() {
    System.out.println("Boiling water");
  }

  public void pourInCup() {
    System.out.println("Pouring into cup");
  }

  boolean customerWantsCondiments() {
    return true;
  }
}
