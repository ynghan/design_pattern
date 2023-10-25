package DecoratorPattern.second;

public class Mocha extends CondimentDecorator {
    public Mocha(ThirdsBeverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public float cost() {
        return .20F;
    }
}
