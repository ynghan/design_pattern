package StrartegyPattern.C_changeTwoDesign.Duck;

import StrartegyPattern.C_changeTwoDesign.FlyBehavior.FlyBehavior;
import StrartegyPattern.C_changeTwoDesign.QuackBehavior.QuackBehavior;

public abstract class Duck {

    public FlyBehavior flyBehavior; //object composition
    public QuackBehavior quackBehavior; //object composition
    public Duck() {}
    public void performFly() {
        flyBehavior.fly(); // delegation
    }
    public void performQuack() {
        quackBehavior.quack(); // delegation
    }

    /**
     * 동적 행위 변경을 위한 Setter 추가
     */
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
    public void swim() {
        System.out.println("Duck swim");
    }
    public abstract void display();
}
