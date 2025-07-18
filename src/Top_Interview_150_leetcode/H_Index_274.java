package src.Top_Interview_150_leetcode;
//
//Input: citations = [3,0,6,1,5]
//        Output: 3
//        Explanation: [3,0,6,1,5]
//        means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
//        Since the researcher has 3 papers with at least 3 citations each and
//        the remaining two with no more than 3 citations each, their h-index is 3.
class H_Index_274 {
    public int hIndex(int[] citations) {
        int n= citations.length;
        int[] arr = new int[n+1];

        for(int c:citations){
            if(c>n){
                arr[n]++;
            }
            else{
                arr[c]++;
            }
        }
        int count =0;
        for(int i = n ; i>=0; i--){
            count = count+arr[i];
            if(count>=i){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] citations = {3,0,6,1,5};
        H_Index_274 h = new H_Index_274();
        int ans = h.hIndex(citations);
        System.out.println("The H-Index Value is: "+ ans);
    }

    public void merge(int[] nums1, int m, int[] num2, int n) {
    }
}