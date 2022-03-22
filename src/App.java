import javax.print.PrintServiceLookup;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        System.out.println(cars[3]);
        int numero = 10;
        numero = soma(1, 2);
        System.out.println(numero);

    }

    public static int soma(int num, int num2) {
        return num + num2;

    }
}
