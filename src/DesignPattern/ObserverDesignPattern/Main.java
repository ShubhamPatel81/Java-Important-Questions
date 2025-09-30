package src.DesignPattern.ObserverDesignPattern;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel  channel = new YouTubeChannel();

        Subscriber aman = new Subscriber("Aman");
        Subscriber raman = new Subscriber("Raman");

        channel.subscribe(aman);
        channel.subscribe(raman);
        channel.notifyChanges();
    }
}
