/*
Luke Simpson
 */

import java.util.*;

public class e2h {

    public static void main(String[] args) {
        int nNum1, nNum2;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter a Number ");
        nNum1 = sin.nextInt();
        System.out.println("Enter another Number ");
        nNum2 = sin.nextInt();
        
        if (nNum2 % nNum1 == 0)
        {System.out.println( nNum2 + " is a multiple of " + nNum1);}
        
        else
        {System.out.println( nNum2 + " is NOT a multiple of " + nNum1);}
            
    }
}
