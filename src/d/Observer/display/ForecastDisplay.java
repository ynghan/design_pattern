package d.Observer.display;

import d.Observer.Observer;
import d.Observer.Subject;

public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;
    int i = 0;
    String[] forecast = { "Improving weather on the way!", "Watch out for cooler, rainy weather", "More of the same"};
    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        if (temp >= 0 && humidity >= 0 && pressure >= 0) {
            this.temperature = temp;
            this.humidity = humidity;
            this.pressure = pressure;
            display();
        }
    }

    public void display() {
        if(i >= 0 && i < 3 ) {
            System.out.println("Forcast: " + forecast[i] + "\n");
            if(i == 2) {
                i = 0;
            } else {
                i++;
            }
        }
    }
}
