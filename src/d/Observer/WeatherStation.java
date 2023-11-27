package d.Observer;

import d.Observer.display.CurrentConditionDisplay;
import d.Observer.display.ForecastDisplay;
import d.Observer.display.StatisticsDisplay;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherStation {
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

            WeatherData weatherData = new WeatherData();


            CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
            StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
            ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

            weatherData.setMeasurements(80, 65, 30.4f);
            weatherData.setMeasurements(82, 70, 29.2f);
            weatherData.setMeasurements(78, 90, 29.2f);
        } catch (SocketException | UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
