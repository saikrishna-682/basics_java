import functionality.ProgramFunctionality;
import mortgage.MortgageCalculator;

import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age =30;
        String name = "saikrishna";
        System.out.println("Hello \"world\"!");
        System.out.println(name+age);
        Date now = new Date();
        System.out.println(now);

        int x = 1;
        int y = x;
        x = 2;
        System.out.println(y);
        System.out.println(x);


        Point point = new Point(1,2);
        Point point1 = point;
        point1.x=2;
        System.out.println(point1);
        System.out.println(point);
        System.out.println("c:\\windows\\..");
        System.out.println("c:\nwindows\\..");
        System.out.println("c:\twindows\\..");

        // Arrays

        int[] numbers = {0,1,5,2,4};
        System.out.println("The length of the array is : "+numbers.length);
        Arrays.sort(numbers); // sorting the array using the sort method which is default in java
        System.out.println(Arrays.toString(numbers)); // for single dimensional arrays we use tostring
        // for multi dimensional array we use deeptostring which is also a default method in java

        int[][] matrix = new int[2][3];
        matrix[0][0] = 1;
        System.out.println(Arrays.deepToString(matrix));
        // now using the curley brases instead of [][]
        int [][] matrix1= {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(matrix1));

        int[] num = {0,4,2,4,1,3,2};
        for(int i=0 ; i<num.length ;i++){
            System.out.println(num[i]);
        }

        // constants : final is the keyword that is defined to make a variable constant and in a capital letter as a variable

        final float PI = 3.14F;

        // Arithmetic expressions

        String a = "12";
        int b = Integer.parseInt(a) + 5; // converting string to integer using the inbuilt Integer.parseInt()
        System.out.println(b);

        // Math class  : Math.round() , Math.ceil() , Math.max(), Math.floor()

        int random = (int) Math.random()*100;
        System.out.println(random);

        // How to format numbers in number for this there is a class in java names NumbersFromat
        //*****
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        String number = currency.format(12345.56);
        String number1 = percent.format(0.1);
        System.out.println(number);
        System.out.println(number1);

        // Method chaining

        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);

        // input from the user using scanner class in java

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name : ");
//        String fullName = scanner.nextLine().trim();
//        System.out.println(fullName);


        // excercise
        MortgageCalculator mortgageCalculator = new MortgageCalculator();
        mortgageCalculator.getAmount();

        // ternary operator

        int income = 120_000;
        String incomeClass = income > 100_000 ? "First" : "Economy";


        ProgramFunctionality programFunctionality = new ProgramFunctionality();
        programFunctionality.functionality();








    }

}