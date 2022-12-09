import javax.swing.*;
import java.util.Scanner;

public class Security {
    public boolean boo;
    public boolean exit = false;

    public void Check(int code, int rightCode) {
      //  if (boo == false) return;
        if (code == rightCode) {
            System.out.println("Проход открыт.");
            CheckOrientation();
            if (boo != false) {
                System.out.println("Проход открыт.");
                exit = true;
            } else {
                System.out.println("Вход для истинных геев!");
            }
        } else if (code == 1212) {
            System.out.println("Пароль равен: " + rightCode);
        } else if (code == 0) {
             exit = true;
        } else {
            System.out.println("Неверный пароль.");
        }
    }

    public boolean CheckOrientation() {
        System.out.println("Вы гей?");
        System.out.println("1. Yes)))0))000)" + "\n" +
                "2. Нет");
        //int thb = new Scanner(System.in).nextInt();
        boo = true;
        while (boo == true) {
            int thb = new Scanner(System.in).nextInt();
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

