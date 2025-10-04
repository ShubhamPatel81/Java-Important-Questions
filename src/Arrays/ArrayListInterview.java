package src.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInterview {
    public static void main(String[] args) {

        List<String> li = new ArrayList<String>(7);
        li.add("Hello");
        li.add("Welcome");
        li.add("India");
        li.add("Subjects");
        li.add("Courses");
        li.add("Institute");
        li.add("Tution");
        List<String> scope = new ArrayList<>();
        scope = li.subList(3,5);
        System.out.println(scope);




    }
}
