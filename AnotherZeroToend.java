
import java.util.Arrays;

public class AnotherZeroToend {
    public static void main(String[] args) {
        int arr[]={1,2,3,0,3,0,2,0,4};
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index< arr.length){
            arr[index]=0;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
