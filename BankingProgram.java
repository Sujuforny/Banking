package banking;

import java.util.Scanner;

public class BankingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard creditCard = new CreditCard();
        boolean isValid = false;
        User user;
        do {
            user = new User();
            user.userInput();
            creditCard.setNumber(user.getUserNumber());
            creditCard.setPin(user.getUserPin());
            if (Database.creditCard().getNumber().equals(creditCard.getNumber()) && Database.creditCard().getPin().equals(creditCard.getPin())){
                creditCard = Database.creditCard();
                creditCard.showBalance();
                isValid=true;
            }
            else {

                System.out.println("Invalid Card...!");

            }
        }while (!isValid);
        isValid = false;
        do {
            System.out.println("========Welcome to Your Account==========");
            System.out.println("1.Deposit");
            System.out.println("2.Withwithdrawal");
            System.out.println("3.Show saving account");
            System.out.println("4:Exit");
            System.out.print("chose:");
            String  num= scanner.nextLine();

            switch (num){
                case "1" :user.userDeposit();
                        creditCard.deposit(user.getAmount());
                        creditCard.showBalance();
                        break;
                case "2" :user.userWithwithdrawal();
                        creditCard.withdrawal(user.getAmount());
                        creditCard.showBalance();
                        break;
                case "3":SavingAccount savingAccount = new SavingAccount();
                        SavingAccount mySaving =Database.saving();
                        mySaving.setInterestI(new DollarRate());
                        mySaving.calculateInterest();
                        mySaving.showBalance();
                        System.out.println("Saving with Dollar:" + mySaving.getInterest());
                        break;
                case "4" :isValid = true;
                        break;
                default:
                    System.out.println("chose again");
            }

        }while (!isValid);


    }
}
