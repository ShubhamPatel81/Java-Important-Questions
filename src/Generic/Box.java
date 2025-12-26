package src.Generic;

public class Box<T> {
    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }

}
class Main{
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setValue("Box 1 ");
        System.out.println("Value of box (String : "+ box.getValue());
        System.out.println("Setting generic value as integer ");
        Box <Integer> box1 = new Box<>();
        box1.setValue(12);
        System.out.println("Value of box (Integer) : "+ box1.getValue());
    }
}
