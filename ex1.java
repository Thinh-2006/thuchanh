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
                    System.out.println("-> Phuong trinh vo nghiem");
                }
            } else {
                double x = -c / b;
                System.out.println("-> Nghiem: " + x);

            
                double check = b * x + c;
                System.out.println("-> Kiem tra: " + check);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("-> Phuong trinh vo nghiem");
            } else if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("-> 2 nghiem: " + x1 + ", " + x2);

            
                System.out.println("-> Check x1: " + (a*x1*x1 + b*x1 + c));
                System.out.println("-> Check x2: " + (a*x2*x2 + b*x2 + c));
            } else {
                double x = -b / (2 * a);
                System.out.println("-> Nghiem kep: " + x);

           
                System.out.println("-> Check: " + (a*x*x + b*x + c));
            }
        }
    }
}