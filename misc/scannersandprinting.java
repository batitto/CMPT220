package misc;

import java.util.Scanner;

public class scannersandprinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("What is your last name? ");
        String Lname = sc.nextLine();
        System.out.println("Hello, " + name + " " + Lname + "!");

        sc.close();
    }
}
