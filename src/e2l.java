/*
 Luek Simpson
 */

import java.util.*;

public class e2l {

    public static void main(String[] args) {
        double dX1, dX2, dY1, dY2, dSlope, dDX, dDY;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the X coordinate of the first point");
        dX1 = sin.nextInt();
        System.out.println("Enter the Y coordinate of the first point");
        dY1 = sin.nextInt();
        System.out.println("Enter the X coordinate of the second point");
        dX2 = sin.nextInt();
        System.out.println("Enter the Y coordinate of the second point");
        dY2 = sin.nextInt();
        dDX = dX2 - dX1;
        dDY = dY2 - dY1;
        dSlope = dDY / dDX;
        
        if (dDX == 0)
        {System.out.println("The slope is Undifined");}
        
        else 
        {System.out.println("The slope is " + dSlope);}
    }
}
