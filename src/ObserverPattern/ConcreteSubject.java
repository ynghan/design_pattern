package ObserverPattern;

import d.Observer.Observer;
import d.Observer.Subject;

public class ConcreteSubject implements Subject {

    @Override
    public void registerObserver(Observer o) {};
    @Override
    public void removeObserver(Observer o) {};
    @Override
    public void notifyObservers() {};
}
