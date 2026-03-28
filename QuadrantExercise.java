package Lec4;

import java.util.Scanner;

public class QuadrantExercise {

    public static int quadrant(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("- Nhap so a: ");
        double a = s.nextDouble();
        System.out.print("- Nhap so b: ");
        double b = s.nextDouble();
        System.out.println("Ket qua la: " + quadrant(a, b));

    }
}
