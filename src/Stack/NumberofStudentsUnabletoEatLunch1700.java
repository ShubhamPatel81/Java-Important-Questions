package src.Stack;

public class NumberofStudentsUnabletoEatLunch1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        int circleSandwich = 0;
        int squareSandwich = 0;
        for(int choice: students){
            if(choice == 0 ){
                circleSandwich++;
            }
            else{
                squareSandwich++;
            }
        }
        for(int sandwich: sandwiches){
            if(sandwich == 0 && circleSandwich == 0){
                return squareSandwich;
            }
            if(sandwich ==1 && squareSandwich == 0){
                return circleSandwich;
            }
            if(sandwich==0){
                circleSandwich--;
            }
            else{
                squareSandwich--;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        NumberofStudentsUnabletoEatLunch1700 nm = new NumberofStudentsUnabletoEatLunch1700();
        int [] students = {1,1,0,0};
        int [] sandwiches = {0,1,0,1};
       int ans =  nm.countStudents(students,sandwiches);
        System.out.println("The Final answer is : "+ans);
    }
}
