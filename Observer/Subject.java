package TRENER3.Observer;


import java.util.HashSet;
import java.util.Set;

public class Subject {

    private Set<Observer> observers = new HashSet<>();
    private int value;

    public void subscribe(Observer observer){
            observers.add(observer);
    }

    public void setValue(int value){
        this.value = value;
        notifyObserver();
    }

    public int  getValue(){
        return this.value;
    }



    public void notifyObserver(){
        for(Observer e: observers){
            e.update();
        }
    }



}
