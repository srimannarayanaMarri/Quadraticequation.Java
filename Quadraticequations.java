/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadraticequations;
import java.util.Scanner;
/**
 *
 * @author indhr
 */
public class Quadraticequations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        double r1,r2;
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the values:");
        a = Sc.nextInt();
        b = Sc.nextInt();
        c = Sc.nextInt();
        r1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        r2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println(r1);
        System.out.println(r2);
    }
    
}
