package d.Observer.display;

import d.Observer.Observer;
import d.Observer.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StatisticsDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private List<Float> temperatures = new ArrayList<>();

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        if (temp >= 0 && humidity >= 0 && pressure >= 0) {
            this.temperatures.add(temp);
            display();
        }
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = "
                + temperatures.stream().max(Float::compareTo).get() + "/"
                + temperatures.stream().min(Float::compareTo).get() + "/"
                + temperatures.stream().collect(Collectors.averagingDouble(Float::doubleValue)));
    }
}
