package FactoryPattern.pizzaStore;

import FactoryPattern.pizza.NYStyleCheesePizza;
import FactoryPattern.pizza.NYStyleVeggiePizza;
import FactoryPattern.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
