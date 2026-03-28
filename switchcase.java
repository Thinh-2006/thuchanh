package Lec4;

import java.util.Scanner;

public class switchcase {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("-Nhap so: ");
        int dept = s.nextInt();
        switch (dept) {
            case 2:
                System.out.println("Thu hai");
                break;
            case 3:
                System.out.println("Thu ba");
                break;
            case 4:
                System.out.println("Thu tu");
                break;
            case 5:
                System.out.println("Thu nam");
            case 6:
                System.out.println("Thu sau");
                break;
            case 7:
                System.out.println("Thu bay");
                break;
            case 8:
                System.out.println("Chu nhat");
                break;
            case 9:
                System.out.println("hihihihi!");
                break;
            default:
                System.out.println("Vui long nhap lai.");
        }
    }
}
