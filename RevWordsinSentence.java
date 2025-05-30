public class RevWordsinSentence {

    public static void main(String[] args) {
        String sen="Ameer is an Engineer";
        String []words=sen.split(" ");
        for(String i:words){
            System.out.print(new StringBuilder(i).reverse()+" ");
        }
    }
}
