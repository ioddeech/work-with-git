import javax.swing.*;

public class Security {
    public void Check(int code) {
        if (code == 1234) {
            System.out.println("Проход открыт, можете пройти.");
        } else {
            System.out.println("Неверный код доступа.");
        }
    }
}
