import org.junit.Test;

import java.util.Scanner;

public class ArithmeticCalculatorApp {

    public static void main(String[] args) {
        System.out.println("***Arithmetic Calculator***");

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number 1: ");
        double n1 = in.nextDouble();

        System.out.print("Enter the number 2: ");
        double n2 = in.nextDouble();

        System.out.print("Enter the arithmetic operator: ");
        char operator = in.next().charAt(0);

        ArithmeticCalculatorApp calculator = new ArithmeticCalculatorApp();

        double result = calculator.calculate(n1, n2, operator);

        System.out.printf("\nThe result of the chosen operation is: %.2f", result);
        in.close();
        in = null;

    }

    public double calculate(double n1, double n2, char operator) {

        double result = 0;

        switch(operator) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '*':
                return n1 * n2;
            case '/':
                return n1 / n2;
        }
        return result;

    }


}