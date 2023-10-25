package DecoratorPatternReview.ConcreteBeverage;

import DecoratorPatternReview.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    public double cost() {
        return 1.68;
    }
}
