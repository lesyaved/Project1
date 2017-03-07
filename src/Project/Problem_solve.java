package Project;

import java.util.Scanner;

/**
 * Created by User on 07.03.2017.
 */
public class Problem_solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Point a  = new  Point(sc.nextDouble(),sc.nextDouble());
        Point b  = new  Point(sc.nextDouble(),sc.nextDouble());
        Point c  = new  Point(sc.nextDouble(),sc.nextDouble());
        Point p  = new  Point(sc.nextDouble(),sc.nextDouble());
        Triangle t= new Triangle (a,b,c);
System.out.print (t.checkPoint(p)==true?"Yes":"No") ;}
    }

