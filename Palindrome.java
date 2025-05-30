public class Palindrome {
    public static void main(String[] args) {
        String Fir="Nivin";
        String rev=new StringBuilder(Fir).reverse().toString().toLowerCase();
        boolean Palindrome=false;
        if(Fir.toLowerCase().equals(rev)){
            Palindrome=true;
        }
        if(Palindrome)
            System.out.print("Palindrome");
        else
            System.out.println("Not Palindome");

    }
}
