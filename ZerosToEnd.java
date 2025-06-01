public class ZerosToEnd {
    public static void main(String[] args) {
        int[]arr={4,3,2,0,4,5,0,6};
        int flag=0;
        int[]arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
               arr2[flag]=arr[i];
               flag++;
           }
        }
        for(int i=0;i< arr.length;i++)
        System.out.print(arr2[i]+" ");
    }
}
