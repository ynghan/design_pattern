package StrartegyPattern.B_changeOneDesign;


public abstract class Duck {
    public void quack() {
        System.out.println("Duck quack");
    }

    public void fly() {
        System.out.println("Duck flying");
    }

    public void swim() {
        System.out.println("Duck swim");
    }

    public abstract void display();

}
