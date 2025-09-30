package src.DesignPattern.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;

public class UserManagement {
    private ArrayList<User> userList = new ArrayList<>();

    public void addUser(User user){
        userList.add(user);
    }
    public User getUsre(int index){
        return userList.get(index);
    }
    public MyIterator getIterator(){
        return new MyIteratorImpl(userList);
    }
}
