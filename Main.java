import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите пароль для входа в систему.");
        System.out.println("Только аккуратно:)");
        int value = new Scanner(System.in).nextInt();
        Security security = new Security();
        security.Check(value);
    }
}
