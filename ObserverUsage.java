package TRENER3;

import TRENER3.Observer.ConcreteValueObserver;
import TRENER3.Observer.Observer;
import TRENER3.Observer.Subject;

public class ObserverUsage {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer = new ConcreteValueObserver(subject);

        subject.setValue(123);
        subject.setValue(1234);
        subject.setValue(12345);
    }
}
