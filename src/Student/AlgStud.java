package Student;

import java.util.Scanner;
import java.io.IOException;
import java.util.Hashtable;




/**
 * Created by IntelliJ IDEA.
 * User: Алина
 * Date: 23.09.2014
 * Time: 8:26:49
 * To change this template use File | Settings | File Templates.
 */
public class AlgStud {
    public static void main(String[] args) {
        sleep();
    }
       
        public static boolean ask(String question) {
        Scanner in = new Scanner(System.in);
        String s;
        boolean result = false;
        boolean success = false;
         while (!success) {
            System.out.println(question);
            s = in.nextLine();
            switch (s.charAt(0)) {
                case 'y':
                    result = true;
                    success = true;
                    break;
                case 'n':
                    result = false;
                    success = true;
                    break;
                default:
                    System.out.println("y-да, n-нет");
                    break;
            }        
        }
        return result;
    }

      public static void sleep() {
        System.out.println("Продолжаем спать =)");
        wakeUp();
    }

     public static void wakeUp() {
        System.out.println("Проснулся");
        isLessons();
    }
    public static void isLessons() {
        if (ask("Есть пара?"))
            importantPair();
        else
            sleep();
    }
    public static void importantPair() {
        if (ask("Важная пара?"))
            haveTime();
        else
            getEnoughSleep();
    }
    public static void  getEnoughSleep() {
        if (ask("Выспался?"))
            hungry();
        else
            sleep();
    }
    public static void haveTime() {
        if (ask("Успеешь в универ?"))
            runToUniversity();
        else
            getEnoughSleep();
    }
    public static void runToUniversity() {
        System.out.println("Учись!");
        endLessons();
    }
    public static void endLessons() {
        if (ask("Отучился?"))
            goHome();
        else
            endLessons();
    }
    public static void hungry() {
        if (ask("Голоден?"))
            eat();
        else
            runToUniversity();
    }
    public static void eat() {
        System.out.println("Кушаем");
        importantPair();
    }
    public static void goHome() {
        sleep();
    }
    
}
