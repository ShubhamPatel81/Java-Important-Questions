package src.Stack;

public class Clear_Digits {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i< s.length() ; i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <='9'){
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 ="cb34";
        Clear_Digits cd = new Clear_Digits();
       String ans1 = cd.clearDigits(s1);
      String ans2 =  cd.clearDigits(s2);
        System.out.println("The answer of both is : "+ans1 +" and : "+ans2);
    }
}
