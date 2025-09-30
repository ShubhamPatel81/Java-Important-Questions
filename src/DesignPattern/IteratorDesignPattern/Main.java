package src.DesignPattern.IteratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("Shubh","1"));
        userManagement.addUser(new User("Aman","2"));
        userManagement.addUser(new User("Ram","3"));
        userManagement.addUser(new User("Shyam","4"));
        userManagement.addUser(new User("John","5"));


        MyIterator myIterator =  userManagement.getIterator();
        while (myIterator.hasNext()){
           User user = (User) myIterator.next();
            System.out.println(user.getUserId()+" " + user.getName());
        }
    }
}
