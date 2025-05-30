import java.util.Scanner;

public class Area {
    static float[] Rectangle(float l,float b){
        float arr[]=new float[2];
        arr[0]=l*b;
        arr[1]=2*(l+b);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float l=sc.nextFloat();
        float b=sc.nextFloat();

        for (float i:Rectangle(l,b)){
            System.out.println(i);
        }
    }
}
