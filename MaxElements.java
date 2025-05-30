public class MaxElements {
    public static void main(String[] args) {
        int []arr={2,3,3,2,3,4,5,3,3,4,4};
        int curr=0;
        int max=arr[0];
        System.out.println(FindMaxElements(arr,0, curr, max));
    }
    static int FindMaxElements(int[]arr,int index,int curr,int max){

        if(max==arr[index]){
            curr++;
        }
        else if(curr==0){
            max=arr[index];
            curr=1;
        }
        else if(max!=arr[curr]){
            curr--;
        }
        if(index==arr.length-1){
            return max;
        }
        return FindMaxElements(arr,index+1,curr,max);
    }
}
