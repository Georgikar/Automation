package QA.Course;

import java.util.Scanner;

public class WorkingWithConsole
{

    public static void main(String[] args){

        Scanner consoleInput = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = consoleInput.nextLine();
        System.out.println("The name ist:" + name);

        System.out.println("What is your hobby?");
        String hobby = consoleInput.nextLine();
        System.out.println("The Hobby ist:" + hobby);

    }

}