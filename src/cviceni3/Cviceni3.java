/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cviceni3;

import java.util.Scanner;

/**
 *
 * @author Dang-T-2d76
 */
public class Cviceni3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 2. task
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        if (y != 0 && x % y == 0) {
            System.out.println("x is divisible by y");
        } else {
            System.out.println("x is not divisible by y");
        }
        // 3. task
        System.out.println("Enter coordinates of a point [a,b]: ");
        int a, b, m, n, radius;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter coordinates of the mid point"
                + "of the circle [m,n]: ");

        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Enter the radius");
        radius = sc.nextInt();
        double circle = Math.pow(a - m, 2) + Math.pow(b - n, 2);
        int comp = Double.compare(circle, radius * radius);

        if (comp == 0) {
            System.out.println("the point is on the circle");
        } else if (comp < 0) {
            System.out.println("the point is inside the circle");
        } else {
            System.out.println("the point is outside the circle");
        }
        
        // 4.task
        
    }
}