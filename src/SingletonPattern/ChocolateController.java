package SingletonPattern;

import static SingletonPattern.MyHWInfo.printInfo;

public class ChocolateController {
  public static void main(String[] args) {

    printInfo();
    ChocolateBoiler boiler = ChocolateBoiler.getInstance();
    ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();

    boiler.fill();
    boiler2.reportBoilerState();
    boiler.boil();
    boiler2.reportBoilerState();
    boiler.drain();
    boiler2.reportBoilerState();
  }
}
