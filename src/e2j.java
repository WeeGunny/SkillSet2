/*
 Luke Simpson
 */

import java.util.*;
public class e2j {

    public static void main(String[] args) {
        int nX1,nY1;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter a point's X and Y coordinate  ");
        nX1 = sin.nextInt();
        nY1 = sin.nextInt();
        
        if(nX1>0 && nY1>0)
        {System.out.println(" Your are in the NE quadrent");}
        
        else if(nX1>0 && nY1<0)
        {System.out.println(" Your are in the SE quadrent");}
        else if(nX1<0 && nY1>0)
        {System.out.println(" Your are in the NW quadrent");}
        else if(nX1<0 && nY1<0)
        {System.out.println(" Your are in the SW quadrent");}
        
        else
        {System.out.println(" Your are on an axis");}
        
    }
}
