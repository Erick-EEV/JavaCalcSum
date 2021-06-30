import java.util.Scanner;
public class CalcSum {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This program will calculate two numbers");
        System.out.println("What is the first number?");
        int num1 = keyboard.nextInt();
        System.out.println("What is the second number?");
        int num2 = keyboard.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is" + sum);
    }
}