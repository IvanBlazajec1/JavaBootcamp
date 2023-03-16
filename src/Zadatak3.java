import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        do {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                continue;
            }
            String dayName="";
            if (number >= 0) {
                switch (number) {
                    case 0:
                        dayName = "Sunday";
                        break;
                    case 1:
                        dayName = "Monday";
                        break;
                    case 2:
                        dayName = "Tuesday";
                        break;
                    case 3:
                        dayName = "Wednesday";
                        break;
                    case 4:
                        dayName = "Thursday";
                        break;
                    case 5:
                        dayName = "Friday";
                        break;
                    case 6:
                        dayName="Saturday";

                }
                System.out.println(dayName);
                if (number % 2 == 0) {
                    sum += number;
                }

            }else if(number<0){
                System.out.println("The sum of even numbers entered is: " +sum);
            }

        }while(number>=0);
    }
}

