package src.DesignPattern.PrototypeDesignPattern;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating the Prototype design pattern" );

       NetworkConnection networkConnection= new NetworkConnection();
        networkConnection.setIp("192.168.3.3");
        networkConnection.loadVeryImportantData();
        System.out.println(networkConnection);



        // we want new object of network connection
        NetworkConnection networkConnection1 =  networkConnection.clone();
        networkConnection1.getDomains().remove(0);
        System.out.println(networkConnection1);
        NetworkConnection networkConnection2 = networkConnection.clone();
        System.out.println(networkConnection2);
    }
}
