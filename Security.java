import javax.swing.*;
import java.util.Scanner;

public class Security {
    public boolean boo;

    public void Check(int code, int rightCode) {
        CheckOrientation();
        if (boo == false) return;
        if (code == rightCode) {
            System.out.println("Проход открыт.");

        } else if (code == 1212) {
            System.out.println("Пароль равен: " + rightCode);
        } else {
            System.out.println("Неверный пароль.");
        }
    }

    public boolean CheckOrientation() {
        System.out.println("Вы гей?");
        System.out.println("1. Yes" + "\n" +
                "2. Нет");
        int thb = new Scanner(System.in).nextInt();
        boo = true;

        while (boo == true) {
            if (thb == 1) {
                System.out.println("Отлично!!!");
                return boo;
            } else if (thb == 2) {
                System.out.println("Вы не подходите");
                return boo = false;
            } else {
                System.out.println("Введено некорректное значение.");
            }
        }
        return boo = true;
    }

}

