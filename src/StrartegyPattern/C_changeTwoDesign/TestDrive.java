package StrartegyPattern.C_changeTwoDesign;

import StrartegyPattern.C_changeTwoDesign.Duck.Duck;
import StrartegyPattern.C_changeTwoDesign.Duck.MallardDuck;
import StrartegyPattern.C_changeTwoDesign.Duck.ModelDuck;
import StrartegyPattern.C_changeTwoDesign.FlyBehavior.FlyRocketPowered;

public class TestDrive {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck(); // 생성되는 시점에 지정한 flyBehavior, quackBehavior 객체를 주입
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly(); // 위임 : 구성된 객체에 메소드 호출 전달
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
