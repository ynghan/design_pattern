package ObserverPattern;

import hf.dp.Observer.Observer;
import hf.dp.Observer.Subject;

public class ConcreteSubject implements Subject {

    @Override
    public void registerObserver(Observer o) {};
    @Override
    public void removeObserver(Observer o) {};
    @Override
    public void notifyObservers() {};
}
