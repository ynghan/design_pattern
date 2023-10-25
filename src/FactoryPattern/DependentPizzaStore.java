package FactoryPattern;

import FactoryPattern.pizza.ChicagoStyleCheesePizza;
import FactoryPattern.pizza.ChicagoStyleVeggiePizza;
import FactoryPattern.pizza.NYStyleCheesePizza;
import FactoryPattern.pizza.Pizza;

/**
 * 잘못된 설계
 */
public class DependentPizzaStore {
    public Pizza creaetePizza(String style, String type) {
        Pizza pizza = null;

        if(style.equals("NY")) {
            if(type.equals("cheese")) {
                pizza = new NYStyleCheesePizza();
            } else if (type.equals("Chicago")) {
                pizza = new ChicagoStyleCheesePizza();
            }
        } else if (style.equals("chicago")) {
            if(style.equals("cheese")) {
                pizza = new ChicagoStyleCheesePizza();
            } else if (type.equals("veggie")){
                pizza = new ChicagoStyleVeggiePizza();
            }
        } else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
