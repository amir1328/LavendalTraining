public class PowerofNum {
    public static void main(String[] args) {
        int num=2;
        int pow=7;
        System.out.println(FindPower(num,pow));
    }
    static int FindPower(int n,int p){
       if(p==0)
           return 1;
        if(p==1)
            return n;
        return n*FindPower(n,--p);
    }
}
