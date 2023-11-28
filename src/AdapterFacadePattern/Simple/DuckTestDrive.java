package AdapterFacadePattern.Simple;

import AdapterFacadePattern.hw4.MyHWInfo;

public class DuckTestDrive {
  public static void main(String[] args) {

    MyHWInfo.printInfo();

    wildTurkey turkey = new wildTurkey();
    Duck turkeyAdapter = new TurkeyAdapter(turkey);

    System.out.println("The Turkey says...");
    turkey.gobble();
    turkey.fly();

    System.out.println("\nThe Duck says...");
    testDuck(turkeyAdapter);
  }

  static void testDuck(Duck duck) {
    duck.quack();
    duck.fly();
  }
}
