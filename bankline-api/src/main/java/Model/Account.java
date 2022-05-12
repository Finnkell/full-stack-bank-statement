package Model;

public class Account {
    private Long number;
    private Double balance;

    public void setNumber(Long number) {
        this.number = number;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Long getNumber() {
        return number;
    }

    public Double getBalance() {
        return balance;
    }
}
