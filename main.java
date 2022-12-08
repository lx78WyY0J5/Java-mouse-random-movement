import java.awt.*;
import java.util.Random;

public class main {
    public static void main(String[] args) throws Exception {

        Robot robot = new Robot();
        Random random = new Random();

        boolean infinite = false;
        int amount = 2000;
        int duration = 10;

        int width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

        while (infinite || amount >= 1) {

            robot.mouseMove(random.nextInt(width), random.nextInt(height));
            Thread.sleep(duration);

            if (!infinite) {
                amount--;
            }
        }
    }
}