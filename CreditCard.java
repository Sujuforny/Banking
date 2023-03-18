package banking;

import java.time.LocalDate;

public class CreditCard extends Account{
    private Integer pin;
    private Double limitAmount;
    LocalDate thruDate;

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public Double getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(Double limitAmount) {
        this.limitAmount = limitAmount;
    }

    public LocalDate getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDate thruDate) {
        this.thruDate = thruDate;
    }
    public CreditCard(Integer number, String name, Double balance){
        super(number,name,balance);

    }
    public CreditCard (){}
    @Override
    protected void deposit(Double amount) {
        if (isExpired(thruDate)){
            System.out.println("Card is Expired...!");
            return;

        }
        super.deposit(amount);
    }

    @Override
    protected void withdrawal(Double amount) {
       if (amount > limitAmount){
           System.out.println("Over the limit amount...!");
           return;
       }
       if (isExpired(thruDate)){
           System.out.println("Card is Expired");
           return;
       }
       super.withdrawal(amount);
    }
    private boolean isExpired(LocalDate date){
        LocalDate now = LocalDate.now();
        return now.isAfter(date);
    }
    //overload method
    //withdrawal all amount
    protected void withdrawal(){
        withdrawal(getBalance());
    }
    @Override
    protected void showBalance() {
        System.out.println("===========================");
        System.out.println("Act No: " + getNumber());
        System.out.println("Act Name: " + getName());
        System.out.println("Balance: $" + getBalance());
        System.out.println("Pin: " + pin);
        System.out.println("Thru Date: " + thruDate);
        System.out.println("Limit Amount: $" + limitAmount);
        System.out.println("============================");
    }
}
