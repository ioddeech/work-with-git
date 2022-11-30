import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите код для входа.");
        int value = new Scanner(System.in).nextInt();
        Security security = new Security();
        security.Check(value);
    }
}
