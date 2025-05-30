public class MaxSubarray {
    public static void main(String[] args) {
        int []arr={1,2,3,-4,5,2,6,-10,12};
        System.out.println(FindMaxsum(arr,0,arr[0],0));

    }
    static int FindMaxsum(int []arr,int index,int max,int cur){
        cur=Math.max(arr[index],max+arr[index]);
        max=Math.max(max,cur);
        if(index==arr.length-1){
            return max;
        }
        return FindMaxsum(arr,index+1,max,cur);
    }
}
