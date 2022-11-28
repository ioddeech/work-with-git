import javax.swing.*;

public class Security {
    public void Check(int code) {
        if (code == 1234) {
            System.out.println("Проход открыт.");
        } else {
            System.out.println("Неверный пароль.");
        }
    }
}
