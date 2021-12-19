package TRENER3.Observer;

public abstract class Observer {
    Subject subject;


    public Observer(Subject subject) {
        this.subject =subject;
        this.subject.subscribe(this);
    }

    abstract void update();
}
