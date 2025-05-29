public class PalindromeRecurive {
    public static void main(String[] args) {
        String str="madam";
        System.out.println(PalindromeorNot(str,0,str.length()-1));
    }
    static boolean PalindromeorNot(String str,int l,int r){
        if(l==r)
           return true;
        if(str.charAt(l)!=str.charAt(r)){
            return false;
        }
            return PalindromeorNot(str,++l,--r);
    }
}
