package problem;

public class Account {
    private String owner;
    private long balance;

    public Account(String owner, long balance){
        this.owner = owner;
        this.balance = balance;
    }

    public long deposit(long amount){
        System.out.println(amount + "원 입금");
        this.balance += amount;
        return balance;
    }

    public long withdraw(long amount){
        System.out.println(amount + "원 출금");
        this.balance -= amount;
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner = '" + owner + '\'' +
                ", 잔액 = " + balance +
                '}';
    }
}