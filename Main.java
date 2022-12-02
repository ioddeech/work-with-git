
import java.awt.print.PrinterGraphics;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Приветствуем вас!" + "\n" +
                "Сразу сообщаем, что будет вопрос интимного характера ;)");
        int value2 = new Random().nextInt(10000);
        while (true) {
            System.out.println("Введите пароль для входа в систему.");
            int value = new Scanner(System.in).nextInt();
            Security security = new Security();
            security.Check(value, value2);
        }
    }
}
