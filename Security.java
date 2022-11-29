import javax.swing.*;
import java.util.Random;

public class Security {

    public void Check(int code, int rightCode) {
        //while (true) {
            if (code == rightCode) {
                System.out.println("Проход открыт.");

            } else if (code == 1212) {
                System.out.println("Пароль равен: " + rightCode);
            } else {
                System.out.println("Неверный пароль.");
            }
       // }
    }
}
