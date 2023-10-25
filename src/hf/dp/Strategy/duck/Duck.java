package hf.dp.Strategy.duck;

import hf.dp.Strategy.fly.FlyBehavior;
import hf.dp.Strategy.quack.QuackBehavior;
//hf.dp.Observer
public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    public Duck() {}
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }


}
