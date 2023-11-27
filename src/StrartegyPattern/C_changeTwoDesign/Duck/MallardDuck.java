package StrartegyPattern.C_changeTwoDesign.Duck;

import StrartegyPattern.C_changeTwoDesign.FlyBehavior.FlyWithWings;
import StrartegyPattern.C_changeTwoDesign.QuackBehavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("MallardDuck");
    }
}
