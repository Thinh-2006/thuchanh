package Lec4;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("- Nhap 3 he so a,b,c: ");
        double a = s.nextDouble();

        double b = s.nextDouble();
        double c = s.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("-> Phuong trinh vo so nghiem");
                } else {
                    System.out.println("-> Phương trinh vo nghiem");
                }
            } else {
                if (c == 0) {
                    System.out.println("-> Phuong trinh co nghiem bang 0");
                } else {
                    System.out.println("-> Phuong trinh co nghiem la: " + (-c / b));
                }
            }
        } else {
            double delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                System.out.println("-> Phuong trinh vo nghiem");
            } else if (delta > 0) {
                double x1 = ((-b + Math.sqrt(delta)) / 2 * a);
                double x2 = ((-b - Math.sqrt(delta)) / 2 * a);
                System.out.println("-> Phuong trinh co 2 nghiem phan biet: " + x1 + ", " + x2);
            } else {
                double x1 = -b / (2 * a);
                System.out.println("-> Phuong trinh co nghiem kep la: " + x1);
            }
        }
    }
}
