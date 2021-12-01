public class Person {
    private String name;
    private int age;
    private int cashAmount;
    BankAccount account;
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

    public int getAge( ){
        return age;
    }
}
