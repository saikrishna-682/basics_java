package mortgage;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public void getAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal : ");
        String pricipal = scanner.next();
        int principalValue = Integer.parseInt(pricipal);
        //System.out.println(pricipal);
        System.out.print("Annual Interest Rate : ");
        String rate = scanner.next();
        float rateValue = Float.parseFloat(rate);
        //System.out.println(rate);
        System.out.print("Period : ");
        String period = scanner.next();
        int periodValue = Integer.parseInt(period);

        float finalResult = ( principalValue * rateValue * periodValue )/ 200;

        String mortgageValue = NumberFormat.getCurrencyInstance().format(finalResult);


        System.out.println("Mortage is : "+ mortgageValue);




    }
}
