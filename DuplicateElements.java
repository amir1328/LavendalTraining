import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int flag=0;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=sc.nextInt();
            for(int j=0;j<i;j++){
                if(temp[i]==temp[j]){
                    arr[flag]=temp[i];
                    flag++;
                }
            }
        }for(int i=0;i<flag;i++)
        System.out.println(arr[i]);

    }
}
