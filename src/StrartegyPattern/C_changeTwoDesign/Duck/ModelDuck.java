package StrartegyPattern.C_changeTwoDesign.Duck;

import StrartegyPattern.C_changeTwoDesign.FlyBehavior.FlyNoway;
import StrartegyPattern.C_changeTwoDesign.QuackBehavior.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoway();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("ModelDuck");
    }
}
