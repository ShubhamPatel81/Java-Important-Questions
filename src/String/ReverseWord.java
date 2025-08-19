package src.String;

public class ReverseWord {

    public static String reverseWord(String s){
        String arr [] = s.split("\\s+");
//        String res ="";
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length-1; i>=0;i--){
            if (arr[i].isEmpty()){
                continue;
            }
            //  word
            if (sb.isEmpty() ){
                sb.append(arr[i]);
            }else {
               sb.append(" ");
               sb.append(arr[i]);
            }
        }
    return sb.toString();
    }

    public static void main(String[] args) {
        String s = "the sky      is blue        ";
        System.out.println("Original String: "+s);
        String res = reverseWord(s);
        System.out.println("Reverse of the string is: "+res);
    }
}
