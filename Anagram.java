import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String First="Ameer";
        String Second="Meera";
        char[]chararray1=First.toLowerCase().toCharArray();
        char[]chararray2=Second.toLowerCase().toCharArray();
        Arrays.sort(chararray1);
        Arrays.sort(chararray2);
        boolean Anagram=Arrays.equals(chararray1,chararray2);
        if(Anagram)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

    }
}
