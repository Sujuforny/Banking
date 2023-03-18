package banking;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Database {
    public static CreditCard creditCard() {
        CreditCard creditCard = new CreditCard(1111,"pengny",1000.0);
        creditCard.setPin(123);
        creditCard.setLimitAmount(1000.0);
        creditCard.setThruDate(LocalDate.now().plus(1, ChronoUnit.DAYS));
        return creditCard;
    }
    public static SavingAccount saving (){
        SavingAccount saving = new SavingAccount(1111,"pengny",200.0);
        return saving;
    }
}
