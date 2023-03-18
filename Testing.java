package banking;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        int value;
        boolean isValid = false;

        do{

            System.out.println("Enter positive value : ");
            value = input.nextInt();
            if(value>=0) isValid = true;

        }while(!isValid);



    }
}
