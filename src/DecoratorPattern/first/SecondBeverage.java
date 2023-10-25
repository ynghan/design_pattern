package DecoratorPattern.first;


public class SecondBeverage {
    boolean milk, soy, mocha, whip;
    protected String description;

    public boolean hasMilk() {
        return milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public float cost() {

        float condimentCost = 0.0F;

//        if(hasMilk())
//            condimentCost += milkCost;
//        if(hasSoy())
//            condimentConst += soyCost;
//        if(hasMocha())
//            condimentConst += mochaCost;
//        if(hasWhip())
//            condimentConst += whipCost;
        return condimentCost;
    }
}
