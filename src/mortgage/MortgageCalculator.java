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

    public void mortgageUpdatedCalculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Amount : ");
        int amount = scanner.nextInt();
        if(amount<1000){
            System.out.println("Please enter amount between 1000 to 1000000");

        }
        else if (amount >=1000 && amount <=1000000 ){
            System.out.println(amount);
        }else {
            System.out.println("retry!");

        }
        System.out.println("Enter the rate of interest : ");
        float rate = scanner.nextFloat();

        if(rate <=0 && rate >10){
            System.out.println("Please enter a value between 1 and 10 ");

        }else if (rate>0 && rate <10){
            System.out.println(rate);
        }else
            System.out.println("try again");
        System.out.println("Enter the time period");
        int time = scanner.nextInt();
        if(time > 30){
            System.out.println("Please enter a value below 30");
        }else if(time < 30){
            System.out.println(time);
        }else
            System.out.println("retry");


        System.out.println("DONE");


        }

    public void mortgageTest() {
        // PRINCIPAL AMOUNT CALCULATOR
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal ($1k - $1M) : ");
        int principal = scanner.nextInt();

        while(principal < 1000){
            System.out.print("Enter a amount within 1000 and 1,000,000 : ");
            principal = scanner.nextInt();
            if(principal > 1000000){
                System.out.print("Enter a amount within 1000 and 1,000,000 : ");
                principal = scanner.nextInt();
            }
        }
        System.out.println("Principal amount : "+principal);

        // INTEREST RATE CALCULATOR
        System.out.print("Annual Interest Rate : ");
        float interestRate = scanner.nextFloat();

        while(interestRate <= 0){
            System.out.print("Enter a valur greater than 0 and less than 15 : ");
            interestRate = scanner.nextFloat();
            if(interestRate > 15){
                System.out.print("Enter a valur greater than 0 and less than 15 : ");
                interestRate = scanner.nextFloat();
            }
        }
        System.out.println("Annual Interest Rate : "+interestRate);

        // PERIOD
        System.out.print("Period (Months) : ");
        int period = scanner.nextInt();
        while(period <= 0){
            System.out.print("Enter a value greater than 1 and less than 30 : ");
            period = scanner.nextInt();
            if(period >30){
                System.out.print("Enter a value greater than 1 and less than 30 : ");
                period = scanner.nextInt();
            }
        }
        System.out.println("Period : "+period);

        float totalInterestRate = 1+ interestRate;

        double calc = Math.pow(totalInterestRate , interestRate);
        //System.out.println("power value"+calc);

        double mortgageFinalCalc = principal * ((interestRate*calc) / (interestRate - 1));

        String finalMortgageCalculation = NumberFormat.getCurrencyInstance().format(mortgageFinalCalc / 100);

        System.out.println("Here is the Mortgage amount : "+ finalMortgageCalculation);




    }
}


