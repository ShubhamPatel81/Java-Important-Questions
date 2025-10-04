package src.OOPS.interfaces;

interface Test1{
    int a = 0;
    void Test1(int n1);
}
class Test2 implements Test1{
    int x;
    public void Test1(int n1){
        if(n1 < 2)
            x = a;
        else x = n1+n1;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Test2[] arr = new Test2[3];
        for (int i = 0 ;i < 3;i++){
            arr[i] = new Test2();
        }
        arr[0].Test1(1);
        arr[1].Test1(2);
        arr[2].Test1(3);
        System.out.print(arr[0].x +" "+arr[1].x+"  "+arr[2].x);
    }
}
