package src.Top_Interview_150_leetcode;

public class Integer_to_Roman_12 {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        process(sb, '*', 'M', '*', num / 1000); // Thousands place
        num %= 1000;

        process(sb, 'M', 'C', 'D', num / 100); // Hundreds place
        num %= 100;

        process(sb, 'C', 'X', 'L', num / 10); // Tens place
        num %= 10;

        process(sb, 'X', 'I', 'V', num); // Units place

        return sb.toString();
    }

    private void process(StringBuilder sb, char major, char minor, char middle, int val) {
        if (val <= 3) {
            for (int i = 0; i < val; i++) {
                sb.append(minor);
            }
        } else if (val == 4) {
            sb.append(minor);
            sb.append(middle);
        } else if (val == 5) {
            sb.append(middle);
        } else if (val <= 8) {
            sb.append(middle);
            for (int i = 0; i < val - 5; i++) {
                sb.append(minor);
            }
        } else if (val == 9) {
            sb.append(minor);
            sb.append(major);
        }
    }

    public static void main(String[] args) {
        Integer_to_Roman_12 i= new Integer_to_Roman_12();
        int num = 3749;
        String  ans = i.intToRoman(num);
        System.out.println("The conversion of Integer to Roman is : "+ ans);
    }
}
