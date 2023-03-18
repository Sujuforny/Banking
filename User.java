package banking;

import java.util.Scanner;

public class User {
    private Integer userPin,userNumber;
    private Double amount;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = Integer.valueOf(userNumber);
    }

    public Integer getUserPin() {
        return userPin;
    }

    public void setUserPin(Integer userPin) {
        this.userPin = userPin;
    }
    Scanner scanner=new Scanner(System.in);
    public  void userInput(){

        System.out.println("          ______________________");
        System.out.println("          |Welcome to joji Bank|");
        System.out.println("          ----------------------");
        System.out.println("============Your account===========");
        System.out.print("Enter user number:");
        this.userNumber= Integer.valueOf(scanner.nextLine());
        System.out.print("Enter PIN:");
        this.userPin= scanner.nextInt();

    }
    public void userDeposit (){
        System.out.println("**********Deposit*********");
        System.out.print("Enter amount:");
        amount = scanner.nextDouble();
    }
    public void userWithwithdrawal (){
        System.out.println("**********withdrawal*********");
        System.out.print("Enter amount:");
        amount = scanner.nextDouble();
    }

}
