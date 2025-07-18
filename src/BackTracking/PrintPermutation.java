package src.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class PrintPermutation {
    public static void main(String[] args) {
        String str= "abc";
        List<String>list= new ArrayList<>();
        printp(str,"",list);
        for (int i = 0;i<list.size();i++){
            System.out.println( list.get(i));
        }
    }
    private static void printp(String str, String s,List<String> list) {
        if (str.isEmpty()){
                list.add(s);
            return;
        }
        for (int i = 0 ; i<str.length();i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right=str.substring(i+1);
            String remain  = left+right;
            printp(remain,s+ch,list);
        }
    }
}
