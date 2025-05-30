public class PossibleSubSequence {
    static void PossibleSequence(int arr[], int index, int tar, int []output,int outindex) {
        if (tar < 0) return;
        if (index == arr.length) {
            if (tar == 0) {
                for (int i = 0; i < outindex; i++)
                    System.out.print(output[i]+" ");
                System.out.println();
            }

          return;
        }
        output[outindex]=arr[index];
        PossibleSequence(arr, index + 1, tar - arr[index], output, outindex+1);
        PossibleSequence(arr,index+1,tar,output,outindex);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int tar=5;
        int newarr[]=new int[arr.length];
        PossibleSequence(arr,0,tar,newarr,0);
    }
}
