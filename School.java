class Student{
    int RollNo;
    static String Name;
    Student(int RollNo){
        this.RollNo=RollNo;
        this.Name="Unknown";
    }
    Student(int RollNo,String Name){
        this.RollNo=RollNo;
        this.Name=Name;
    }
    void Display(){
        System.out.println(Name);
        System.out.println(RollNo);
    }

}
public class School {
    public static void main(String[] args) {
        Student S1=new Student(123);
        S1.Display();
        Student S2=new Student(124,"Ameer");
        S2.Display();
    }
}
