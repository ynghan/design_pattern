package DecoratorPatternReview.ConcreteBeverage;

import DecoratorPatternReview.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    public double cost() {
        return 2.32;
    }

}
