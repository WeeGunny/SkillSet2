/*
 Luke Simpson
 */

import java.util.*;

public class e2f {

    public static void main(String[] args) {
        int nNum1, nNum2;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter a Number ");
        nNum1 = sin.nextInt();
        System.out.println("Enter another Number ");
        nNum2 = sin.nextInt();

        if (nNum1 == nNum2) 
        {
            System.out.println("The numbers are equal.");
        } 
        else if (nNum1 < nNum2) 
        {
            System.out.println(nNum1 + " is Less than " + nNum2);
        }
        else if (nNum1 > nNum2) 
        {
            System.out.println(nNum1 + " is greater than " + nNum2);
        }
    }
}
