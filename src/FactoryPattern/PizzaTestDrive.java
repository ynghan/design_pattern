package FactoryPattern;

import FactoryPattern.pizza.Pizza;
import FactoryPattern.pizzaStore.ChicagoPizzaStore;
import FactoryPattern.pizzaStore.NYPizzaStore;
import FactoryPattern.pizzaStore.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + nyPizza.getName());

        Pizza chicagoPizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + chicagoPizza.getName());

    }
}
