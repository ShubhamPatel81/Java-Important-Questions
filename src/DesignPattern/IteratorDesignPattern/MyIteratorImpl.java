package src.DesignPattern.IteratorDesignPattern;

import java.util.List;

public class MyIteratorImpl implements  MyIterator{
    private List<User>  list;
    private int len ;
    private int position =0 ;
    public MyIteratorImpl(List<User> list){
        this.list = list;
        this.len=list.size();
    }

    @Override
    public boolean hasNext() {
         if (position>= len || list.get(position) ==null){
             return false;
         }else return true;
    }

    @Override
    public Object next() {
        User user = list.get(position);
        position +=1;
        return user;
    }
}
