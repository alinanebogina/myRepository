package Student;

import java.util.Scanner;
import java.io.IOException;
import java.util.Hashtable;




/**
 * Created by IntelliJ IDEA.
 * User: �����
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
                    System.out.println("y-��, n-���");
                    break;
            }        
        }
        return result;
    }

      public static void sleep() {
        System.out.println("���������� ����� =)");
        wakeUp();
    }

     public static void wakeUp() {
        System.out.println("���������");
        isLessons();
    }
    public static void isLessons() {
        if (ask("���� ����?"))
            importantPair();
        else
            sleep();
    }
    public static void importantPair() {
        if (ask("������ ����?"))
            haveTime();
        else
            getEnoughSleep();
    }
    public static void  getEnoughSleep() {
        if (ask("��������?"))
            hungry();
        else
            sleep();
    }
    public static void haveTime() {
        if (ask("������� � ������?"))
            runToUniversity();
        else
            getEnoughSleep();
    }
    public static void runToUniversity() {
        System.out.println("�����!");
        endLessons();
    }
    public static void endLessons() {
        if (ask("��������?"))
            goHome();
        else
            endLessons();
    }
    public static void hungry() {
        if (ask("�������?"))
            eat();
        else
            runToUniversity();
    }
    public static void eat() {
        System.out.println("������");
        importantPair();
    }
    public static void goHome() {
        sleep();
    }
    
}
