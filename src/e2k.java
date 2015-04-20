/*
 Luke Simpson
 */

import java.util.*;

public class e2k {

    public static void main(String[] args) {
        int nNum1, nNum2, nAns;
        Scanner sin = new Scanner(System.in);
        nNum1 = (int) (Math.random() * 1000) + 1;
        nNum2 = (int) (Math.random() * 1000) + 1;
        System.out.println(nNum1 + "+" + nNum2);
        System.out.println( "What is the answer?");
        nAns = sin.nextInt();
        
        if (nAns == nNum1+nNum2)
        {System.out.println("That is CORRECT!!!");}
        
        else 
        {System.out.println("That is Wrong :(");}
        

    }
}
