package src.OOPS;

class Pen{
    String color;
    String type;
    public void  write(){
        System.out.println("Writing Something.....");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Students{
    String name;
    int age;
    public void printInfo(){
        System.out.println("Student Name : "+this.name +"\n"+ "Student Age : "+ this.age);
    }
}

public class OOPS_Example {
    public static void main(String[] args) {
        Pen pen =new Pen();
        pen.color = "Blue";
        pen.type = "gel";

        Pen  pen1 =new Pen();
        pen1.color = "Black";
        pen1.type = "BallPen";

        pen.write();
        pen.printColor();
        pen1.printColor();

        Students students = new Students();
        students.name= "Rahul";
        students.age = 23;
        students.printInfo();

    }
}
