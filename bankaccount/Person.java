public class Person {
    private String name;
    private int age;
    private int cashAmount;
    BankAccount account;
    public void setAccount(BankAccount newBank){
        account = newBank;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setCashAmount(int newAmount){
        cashAmount = newAmount;
    }
    public void setAge(int newAge){
        age=newAge;
    }
    public String getName( ){
        return name;
    }
    public int getCashAmount( ){
        return cashAmount;    }
    public BankAccount getBankAccount(){
        return account;
    }
    public int getAge( ){
        return age;
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
        if(amount >0 || amount <getBankAccount().getBalance()){
            to.setBalance(to.getBalance()+amount);
            getBankAccount().setBalance(getBankAccount().getBalance()-amount);
            System.out.println("true - from: "+getName()+
                    ", to: "+to.owner.getName()+
                    ", amount: "+amount+
                    ", balance: "+getBankAccount().getBalance());
            return true;

        }
        else{
            System.out.println("false - from: "+getName()+
                    ", to: "+to.owner.getName()+
                    ", amount: "+amount+
                    ", balance: "+getBankAccount().getBalance());
            return false;
        }
    }
}
