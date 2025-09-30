package src.DesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    List<Observer> subscriber = new ArrayList<>();

    @Override
    public void subscribe(Observer ob) {
        this.subscriber.add(ob);
    }

    @Override
    public void unsubscribe(Observer ob) {
            this.subscriber.remove(ob);
    }

    @Override
    public void notifyChanges() {
        for (Observer ob:this.subscriber){
            ob.notified();
        }
    }
//    String title;
}
