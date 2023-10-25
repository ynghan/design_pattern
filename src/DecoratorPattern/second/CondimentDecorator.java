package DecoratorPattern.second;

public abstract class CondimentDecorator extends ThirdsBeverage {
    protected ThirdsBeverage beverage;
    public abstract String getDescription();
}
