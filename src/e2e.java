/*
 Luke Simpson
 */
import java.util.*;
public class e2e {

    public static void main(String[] args) {
         int nNum;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the Number ");
        nNum = sin.nextInt();
        
        if(nNum > 0)
        { System.out.println("The absolute value is " + nNum);}
        
        else if (nNum < 0)
        { System.out.println("The Absolute value is " + -nNum);}
    }
}
