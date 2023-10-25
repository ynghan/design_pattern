package hf.dp.Strategy.duck;

import hf.dp.Strategy.fly.FlyWithWings;
import hf.dp.Strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("showing mallard duck");
    }


}
