package DecoratorPattern.second;

public class Whip extends CondimentDecorator {
    public Whip(ThirdsBeverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public float cost() {
        return .20F;
    }
}
