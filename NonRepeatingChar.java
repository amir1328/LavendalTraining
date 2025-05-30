import java.util.HashMap;
public class NonRepeatingChar {
    public static void main(String[] args) {
        String str="mountain";
        System.out.println(FindNonRepeating(str));
    }
    static int FindNonRepeating(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return i;
            }

        }
        return -1;
    }
}
