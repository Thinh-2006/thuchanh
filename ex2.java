package Lec4;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("- What percentage did you earn: ");
        int percent = s.nextInt();
        if (percent >= 93) {
            System.out.println("You got an S tier!");
        } else if(percent >=83){
            System.out.println("You got an A tier!");
        }else if (percent >= 73) {
            System.out.println("You got an B tier!");
        } else if (percent >= 63) {
            System.out.println("You got an C tier!");
        } else if (percent >= 53) {
            System.out.println("You got an D tier!");
        } else {
            System.out.println("You got an F tier!");
        }
    }
}
