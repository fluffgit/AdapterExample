package TRENER3.Observer;

public class ConcreteValueObserver extends Observer {


    public ConcreteValueObserver(Subject subject) {
        super(subject);
    }

    @Override
    void update() {
        System.out.println(subject.getValue());
    }
}
