class Calculatorfunctions {
    int result;
    static int OperationCount=10;
    int add(int a,int b){

        return a+b;
    }
    static void Display(){
        System.out.println(OperationCount);

    }
}
public class Calculator{
    public static void main(String[] args) {
        Calculatorfunctions fun=new Calculatorfunctions();
        System.out.println("OperationCount="+Calculatorfunctions.OperationCount);
        System.out.println(fun.add(2,3));
        fun.result=fun.add(3,4);
        System.out.println(fun.result);
        Calculatorfunctions.Display();

    }

}
