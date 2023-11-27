package StrartegyPattern.B_changeOneDesign;

/**
 * 날지 못하는 특성이 있다.
 */
public class RubberDuck extends Duck{

    public void quack() {
        System.out.println("RubberDuck quack");
    }

    public void display() {
        System.out.println("showing rubber duck");
    }

    // fly() 메소드를 오버라이딩하지 않는다.
}
