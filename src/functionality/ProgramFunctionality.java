package functionality;

import java.util.Scanner;

public class ProgramFunctionality {
    Scanner scanner = new Scanner(System.in);
    public void functionality(){
        System.out.println("Enter a Integer : ");
        int number = scanner.nextInt();
        System.out.println("Enter a Dividor : ");
        int divider = scanner.nextInt();

        switch (number%divider){
            case 0:
                System.out.println("Divisible by : "+ divider);
                break;
            default:
                System.out.println("Not divisible by : " + divider);
                break;
        }

    }


    public void whileLoop(){
        // While loop ussage is only done when we dont know the amount of time that we run the loop
        String input = "";
        while (!input.equals("quit")){
            System.out.print("Enter a value : ");
            input = scanner.next().toLowerCase();
            if(input.equals("pass")) // using a continue statement within the loops
                continue;
            if(input.equals("quit")) // using a break statement whithin loops
                break;
            System.out.println(input);
            int var = 4;
            int var1 = 5;
            int result = var + var1;
        }
    }

    public void forEachLoop(){
        String[] fruite = {"apple","orange","coconut"};

        for(String fruits: fruite){
            System.out.println(fruits);
        }
    }



}
