package src.DesignPattern.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

//The Prototype design pattern is a creational design pattern in Java that enables
// the creation of new objects by copying an existing object, known as the prototype.
public class NetworkConnection implements Cloneable  {

        private String ip;
        private String importantData;
        private List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domains=" + domains +
                '}';
    }

    public void loadVeryImportantData() throws InterruptedException {
        this.importantData ="This is very importand Data";
        domains.add("www.hello.com");
        domains.add("www.shubh.com");
        domains.add("www.patel.com");
        //it will tale 5 minutes
        Thread.sleep(5000);
    }

    @Override
    public NetworkConnection clone() {
        //login for cloning(deep copy logic)
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImportantData(this.getImportantData());

        for (String d:this.getDomains()){
            networkConnection.getDomains().add(d);
        }
         return  networkConnection;

        // this is the login of Prototype Design pattern for cloning
//        try {
//            NetworkConnection clone = (NetworkConnection) super.clone();
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
    }
}
