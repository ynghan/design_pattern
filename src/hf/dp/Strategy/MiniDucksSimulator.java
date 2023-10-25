package hf.dp.Strategy;

import hf.dp.Strategy.duck.Duck;
import hf.dp.Strategy.duck.MallardDuck;
import hf.dp.Strategy.duck.ModelDuck;
import hf.dp.Strategy.fly.FlyRocketPowered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MiniDucksSimulator {
    public static void main(String[] args) {

        // 현재 사용자 이름 가져오기
        String username = System.getProperty("user.name");

        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("현재 날짜와 시간: " + formattedDate);
        System.out.println("사용자 이름: " + username);


        String result = "";
        InetAddress ip;

        try {
            ip = InetAddress.getLocalHost();

            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            byte[] mac = network.getHardwareAddress();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
            }
            result = sb.toString();

            System.out.println("Mac 주소 : " + result);

        System.out.println("=======================================");


        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    } catch (SocketException e) {
            throw new RuntimeException(e);
    } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
