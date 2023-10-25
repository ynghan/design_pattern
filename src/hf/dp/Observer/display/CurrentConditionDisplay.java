package hf.dp.Observer.display;

import hf.dp.Observer.Observer;
import hf.dp.Observer.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        if (temp >= 0 && humidity >= 0 && pressure >= 0) {
            this.temperature = temp;
            this.humidity = humidity;
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
