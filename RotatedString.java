public class RotatedString {
    public static void main(String[] args) {
        String str1="waterbottle";
        String str2="bottlewater";
        str1=str1+str1;
        System.out.println(str1.contains(str2));
    }
}
