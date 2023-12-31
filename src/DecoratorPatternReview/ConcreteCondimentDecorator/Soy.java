package DecoratorPatternReview.ConcreteCondimentDecorator;

import DecoratorPatternReview.Beverage;
import DecoratorPatternReview.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
