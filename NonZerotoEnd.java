public class NonZerotoEnd {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,0,43,6,0,4,0};
        int temp[]=new int[arr.length];
        int flag=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                temp[flag]=arr[i];
                flag++;
            }
        }
        while(flag< temp.length){
            temp[flag++]=0;
            flag++;
        }
        for (int i=0;i<temp.length;i++){
            System.out.print(temp[i] +" ");
        }
    }
}
