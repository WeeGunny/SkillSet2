/*
 Luke Simpson
 */
import java.util.*;
public class e2i {

   
    public static void main(String[] args) {
       int nX1,nY1,nX2,nY2,nLength,nWidth ;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the first point's X and Y coordinate  ");
        nX1 = sin.nextInt();
        nY1 = sin.nextInt();
        System.out.println("Enter the second point's X and Y coordinate ");
        nX2 = sin.nextInt();
        nY2 = sin.nextInt();
        
        nLength = nY1-nY2;
        nWidth = nX2-nX1;
        
        if (nLength == nWidth )
        {System.out.println( "It’s a square!!!" );}
        
        else
         {System.out.println( "It’s a Rectangle!!!" );}   

    }
}
