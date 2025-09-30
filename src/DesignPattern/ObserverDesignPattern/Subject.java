package src.DesignPattern.ObserverDesignPattern;

public interface Subject {
    void subscribe(Observer ob);
    void  unsubscribe(Observer ob);
    void  notifyChanges();
}
