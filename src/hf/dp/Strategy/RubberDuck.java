package hf.dp.Strategy;

import hf.dp.Strategy.duck.Duck;

public class RubberDuck extends Duck implements Quackable {

    public void quack() {

    }

    public void display() {
        System.out.println("showing rubber duck");
    }

    public void fly() {};
}
