package Lec4;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("- What percentage did you earn: ");
        int percent = s.nextInt();
        if (percent >= 90) {
            System.out.println("You got an A!");
        } else if (percent >= 80) {
            System.out.println("You got an B!");
        } else if (percent >= 70) {
            System.out.println("You got an C!");
        } else if (percent >= 60) {
            System.out.println("You got an D!");
        } else {
            System.out.println("You got an F!");
        }
    }
}
