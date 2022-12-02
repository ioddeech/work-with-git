import javax.swing.*;
import java.util.Scanner;

public class Security {
    public boolean boo;

    public void Check(int code) {
        CheckOrientation();
        if (boo == false) return;
        if (code == 1234) {
            System.out.println("Проход открыт, можете пройти.");
        } else {
            System.out.println("Неверный код доступа.");
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

