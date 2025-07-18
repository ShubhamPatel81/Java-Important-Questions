package src;

public class ToString {
    // Your object fields here

    private String message  = "This is getfield() method !!!";
    public  String getFields(){
        return message;
    }
    @Override
    public  String toString(){
        return "MyObject{" +
                "fields='" + getFields() + '\'' +
                '}';
    }
    public static void main(String[] args) {
        ToString ts = new ToString();
        System.out.println(ts);

    }
}
