package Java;
import java.awt.*;
import java.awt.event.InputEvent;

public class main {
    static Point point;
    static int x,y;
    static Robot robot;
    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            int i=0;
            while (true) {
                System.out.println("------running-------  "+i+" time ");i++;
                dosth(575,325);

                Thread.sleep(5000);//
                System.out.println("sth done");

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void dosth(int x, int y)
    {
        point=MouseInfo.getPointerInfo().getLocation();
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(point.x, point.y);//
        try {
            Thread.sleep(1200);//
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}

