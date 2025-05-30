class BankAccount{
    private float Balance=1000.0f;
    float Deposit(float amount){
        return Balance+amount;
    }
    float GetBalance(){
        return Balance;
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAccount bc=new BankAccount();
        bc.Deposit(300);
        System.out.println(bc.GetBalance());
//        System.out.println(bc.Balance);
    }

}
