import java.util.HashSet;

public class DupliacteElement {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        int []arr={1,2,3,4,4,6,7,8};
        boolean duplicate=false;
        for(int i=0;i< arr.length;i++){
            if(!set.add(i)){
                duplicate=true;
                break;
            }
            set.add(arr[i]);
        }
        if(duplicate)
            System.out.println("Dupliacte Elements is there");
        else
            System.out.println("NO Dupliactes");
    }
}
