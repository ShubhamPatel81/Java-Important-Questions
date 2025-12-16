package src.recursion;

import java.util.ArrayList;
import java.util.List;

//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
// Example: Input: n = 3
//        Output: ["((()))","(()())","(())()","()(())","()()()"]

/*
public class Generate_Parentheses_22 {
      static   List<String> res = new ArrayList<>();

        public static boolean isValid(String curr) {
            int count = 0;
            for (int i = 0; i < curr.length(); i++) {
                char ch = curr.charAt(i);
                if (ch == '(') count++;
                else count--;
                if (count < 0) return false;
            }
            return count == 0;
        }

        public static void solve(String curr, int n) {
            if (curr.length() == 2 * n) {
                if (isValid(curr)) {
                    res.add(curr);
                }
                return;
            }

            solve(curr + "(", n);
            solve(curr + ")", n);
        }

        public static List<String> generateParenthesis(int n) {
            solve("", n);
            return res;
        }

    public static void main(String[] args) {
        int n = 3;

        System.out.println(generateParenthesis(n));
    }
}
*/
// optimize way is ;
public class Generate_Parentheses_22 {

    static List<String > res = new ArrayList<>();

    public static void  solve(String curr, int n , int open , int close){
        if(curr.length() == 2* n) {
            res.add(curr);
            return;
        }
        if(open < n){
            solve(curr + "(",n, open+1, close );

        }
        if (close < open){
            solve(curr + ")", n, open,  close+1);
        }
    }
    public static List<String> generateParenthesis(int n) {
        solve("", n, 0, 0);
        return res;
    }



    public static void main(String[] args) {
        Generate_Parentheses_22 g = new Generate_Parentheses_22();
        int n=3;
        List<String> result =g.generateParenthesis(n);
        for (String s : result){
            System.out.print( s+" ");
        }
    }

}
