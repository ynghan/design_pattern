package d.Strategy.duck;

import d.Strategy.fly.FlyWithWings;
import d.Strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("showing mallard duck");
    }


}
