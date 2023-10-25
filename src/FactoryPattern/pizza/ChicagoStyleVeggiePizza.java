package FactoryPattern.pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Deep Dish and Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato sauce";
        toppings.add("Shredded Mozzarella Veggie");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
