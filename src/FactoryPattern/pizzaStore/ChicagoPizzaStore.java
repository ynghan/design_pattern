package FactoryPattern.pizzaStore;

import FactoryPattern.pizza.ChicagoStyleCheesePizza;
import FactoryPattern.pizza.ChicagoStyleVeggiePizza;
import FactoryPattern.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
