package banking;

public class SavingAccount extends Account implements Interest{


    private Double interest;
    private Interest interestI;
    public Interest getInterestI() {
        return interestI;
    }

    public void setInterestI(Interest interestI) {
        this.interestI = interestI;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }
    public Double getInterest() {
        return interest;
    }
    public void calculateInterest(){
       interest= interestI.calculate(getBalance());
    }
    public SavingAccount(){
        setInterestI(new Interest() {
            @Override
            public Double calculate(Double amount) {
                return amount * 0.01;
            }
        });
    }
    public SavingAccount(Integer number, String name, Double balance){
        super(number,name,balance);

    }
    @Override
    protected void showBalance() {
        System.out.println("============saving===============");
        System.out.println("Saving Act No: " + getNumber());
        System.out.println("Saving Act Name: " + getName());
        System.out.println("Balance: $" + getBalance());
        System.out.println("============================");
    }

    @Override
    public Double calculate(Double amount) {
        return null;
    }
}
