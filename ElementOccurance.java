public class ElementOccurance {
    public static void main(String[] args) {
        String str="programmings";
        char c='g';
        System.out.println(CountOccr(str,c,0,0));
    }
    static int CountOccr(String str,char c,int curr,int count){
        if(str.length()==curr)
            return count;
        if(str.charAt(curr)==c)
            count++;
        return CountOccr(str,c,curr+1,count);
    }
}
