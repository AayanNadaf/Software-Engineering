import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer obs1 = new ConcreteObserver("Observer1");
        Observer obs2 = new ConcreteObserver("Observer2");
        subject.addObserver(obs1);
        subject.addObserver(obs2);
        subject.notifyObservers("State Changed!");
    }
}
