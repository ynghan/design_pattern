package DecoratorPattern.second;

public abstract class ThirdsBeverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract float cost();

}
