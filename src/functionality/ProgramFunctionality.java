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

        String input = "";
        while (!input.equals("quit")){
            System.out.print("Enter a value : ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }



}