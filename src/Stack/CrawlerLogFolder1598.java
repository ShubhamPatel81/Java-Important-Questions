package src.Stack;

public class CrawlerLogFolder1598 {
    public int minOperations(String[] logs) {
        int level = 0;
        for(String log: logs){
            if(log.equals("../")){
                if(level != 0){
                    level--;
                }
            }
            else if(log.equals("./")){
                continue;
            }
            else{
                level++;
            }
        }
        return level;
    }

    public static void main(String[] args) {
        CrawlerLogFolder1598 cw = new CrawlerLogFolder1598();
        String [] logs= {"d1/","d2/","../","d21/","./"};
      int ans =  cw.minOperations(logs);
        System.out.println("The final answer is : "+ ans);

    }
}
