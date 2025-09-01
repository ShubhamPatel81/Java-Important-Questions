package src.Top_Interview_leetcode;

//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
//        P   A   H   N
//        A P L S I I G
//        Y   I   R
//        And then read line by line: "PAHNAPLSIIGYIR"
public class Zigzag_Conversion_6 {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        int n = s.length();
        char[][] matrix = new char[numRows][n];
        int x = 0;
        int i = 0;
        int j = 0;
        while(x<n){
            if(i ==0) {
                while(i<numRows && x<n){
                    matrix[i][j] = s.charAt(x);
                    i++;
                    x++;

                }
                i--;
            }
            else{
                i--;
                j++;
                if(i==0 ) continue;
                matrix[i][j] = s.charAt(x);
                x++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char[] arr: matrix){
            for(char ch : arr){
                if(ch != '\u0000'){
                    sb.append(ch +"");
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        Zigzag_Conversion_6 z = new Zigzag_Conversion_6();
        String ans =   z.convert(s, numRows);
        System.out.println("The ZIGZAG conversion of the given String is : "+ ans);
    }
}
