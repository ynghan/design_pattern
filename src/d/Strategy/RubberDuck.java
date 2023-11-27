package d.Strategy;

import d.Strategy.duck.Duck;

public class RubberDuck extends Duck implements Quackable {

    public void quack() {

    }

    public void display() {
        System.out.println("showing rubber duck");
    }

    public void fly() {};
}
