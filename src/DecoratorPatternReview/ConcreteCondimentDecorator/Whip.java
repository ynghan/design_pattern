package DecoratorPatternReview.ConcreteCondimentDecorator;

import DecoratorPatternReview.Beverage;
import DecoratorPatternReview.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .30 + beverage.cost();
    }
}
