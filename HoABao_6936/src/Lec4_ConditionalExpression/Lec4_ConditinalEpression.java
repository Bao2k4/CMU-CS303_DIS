//package Lec4_ConditionalExpression;
package Lec4_ConditionalExpression;

import java.util.Scanner;

public class Lec4_ConditinalEpression {

    public static int quadrant(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else { // at least one coordinate equals 0
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem A : ");
        double percentA = scanner.nextInt();
        System.out.print("Nhap diem B : ");
        double percentB = scanner.nextInt();
        System.out.println(quadrant(percentA, percentB));
    }
}
