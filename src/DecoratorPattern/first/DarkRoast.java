package DecoratorPattern.first;

import DecoratorPattern.second.ThirdsBeverage;

public class DarkRoast extends ThirdsBeverage {
    public DarkRoast() {
        description = "Excellent Dark Roast";
    }

    public float cost() {
        return 1.99F;
    }
}
