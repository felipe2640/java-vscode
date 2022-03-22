package calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Double num = 0.0;
        Double num2 = 0.0;
        String op = "";
        Double result = 0.0;

        System.out.println("Number 1: ");
        num = reader.nextDouble();
        System.out.println("Number 2: ");
        num2 = reader.nextDouble();
        reader.nextLine();
        System.out.println("Operation (+, -, *, /): ");
        op = reader.nextLine();
        reader.close();

        /*
         * 1° usando if
         * if (op.equals("+")) {
         * result = soma(num, num2);
         * 
         * } else if (op.equals("-")) {
         * result = subtracao(num, num2);
         * } else if (op.equals("/")) {
         * result = divisao(num, num2);
         * } else if (op.equals("*")) {
         * result = multiplicacao(num, num2);
         * }
         */

        // 2° opção usando switch
        switch (op) {
            case "+":
                result = soma(num, num2);
                break;
            case "-":
                result = subtracao(num, num2);
                break;
            case "*":
                result = multiplicacao(num, num2);
                break;
            case "/":
                result = divisao(num, num2);
                break;
        }
        System.out.println(result);

    };

    public static Double soma(Double num, Double num2) {
        return num + num2;
    }

    public static Double subtracao(Double num, Double num2) {
        return num - num2;

    }

    public static Double divisao(Double num, Double num2) {
        return num / num2;

    }

    public static Double multiplicacao(Double num, Double num2) {
        return num * num2;

    }
}
