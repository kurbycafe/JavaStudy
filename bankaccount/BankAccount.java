public class BankAccount {
    private int balance;
    Person owner;
    public void setBalance(int newbalance){
        balance=newbalance;
    }
    public int getBalance( ){
        return balance;
    }
    public Person setOwner(Person newOwner){
        return owner=newOwner;
    }
    // 파라미터 : 입금할 액수(정수)
    // 리턴 : 성공여부(불린)
    boolean deposit(int amount) {
        // 1. write code here
        if (amount > owner.getCashAmount()){
            System.out.printf("입금 실패입니다. 잔고: %d원, 현금: %d원\n",balance, owner.getCashAmount());
            return false;
        }
        else{
            balance += amount;
            owner.setCashAmount(owner.getCashAmount() - amount);
            System.out.printf("%d원 입금하였습니다. 잔고: %d원, 현금: %d원\n",amount, balance, owner.getCashAmount());
            return true;
        }

    }

    // 파라미터 : 출금할 액수(정수)
    // 리턴 : 성공여부(불린)
    boolean withdraw(int amount) {
        // 2. write code here
        if (amount > balance ){
            System.out.printf("출금 실패입니다. 잔고: %d원, 현금: %d원\n",balance, owner.getCashAmount());
            return false;
        }
        else{
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.printf("%d원 출금하였습니다. 잔고: %d원, 현금: %d원\n",amount, balance, owner.getCashAmount());
            return true;
        }

    }

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to, int amount) {
        return transfer(to.getBankAccount(), amount);


    }

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
        if(amount >0 || amount <owner.getBankAccount().getBalance()){
            to.setBalance(to.getBalance()+amount);
            owner.getBankAccount().setBalance(owner.getBankAccount().getBalance()-amount);
            System.out.println("true - from: "+owner.getName()+
                    ", to: "+to.owner.getName()+
                    ", amount: "+amount+
                    ", balance: "+owner.getBankAccount().getBalance());
            return true;

        }
        else{
            System.out.println("false - from: "+owner.getName()+
                    ", to: "+to.owner.getName()+
                    ", amount: "+amount+
                    ", balance: "+owner.getBankAccount().getBalance());
            return false;
        }
    }
}