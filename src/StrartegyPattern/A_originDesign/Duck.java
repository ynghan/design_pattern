package StrartegyPattern.A_originDesign;

/**
 * 요구사항 :
 * 1. 모든 duck은 quack 동작함.
 * 2. 모든 duck은 같은 방법으로 swim 함.
 * 3. 모든 duck은 자신의 display를 구현한다.
 */
public abstract class Duck {
    public void quack() {
        System.out.println("Duck quack");
    }

    public void swim() {
        System.out.println("Duck swim");
    }

    public abstract void display();

}
