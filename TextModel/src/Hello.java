import Animal.Human;
import Animal.Robot;

import java.io.File;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello world");
        Human man1 = new Human();
        System.out.println(man1.getName());
        Robot robot = new Robot("Gaojian", "Huamn");
        System.out.println(robot.identify());
    }
}
