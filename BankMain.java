public class BankMain {
    public static void main(String[] args) {
        // 사람 선언
        Person p2 = new Person();
        p2.name = "김신의";
        p2.age = 28;
        p2.cashAmount = 100000;


        // 은행 계좌 생성
        BankAccount a2 = new BankAccount();
        a2.balance = 500000;

        p2.account = a2;
        a2.owner = p2;

        // 3 - 4. write code here
        a2.deposit(30000);
        a2.withdraw(170000);
        a2.deposit(620000);
        a2.withdraw(890000);
    }

}
