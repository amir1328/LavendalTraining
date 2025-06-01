public class StringRepeatAndCount {
    public static void main(String[] args) {
        String str="aba";
        int n=10;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a')
                count++;
        }
        int maxOccr=n/str.length();
        int remider=n%str.length();
        int totalcount=maxOccr*count;
        for(int i=0;i<remider;i++){
            if(str.charAt(i)=='a'){
                totalcount++;
            }
        }
        System.out.println(totalcount);

    }

}

