import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        double a = input.nextDouble();
        System.out.println("Introduceti al doilea numar: ");
        double b = input.nextDouble();
        System.out.println(Math.abs(a-b)<0.01);

    }
}
