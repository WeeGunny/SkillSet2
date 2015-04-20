
import java.util.Scanner;

/*
 Luke Simpson 
 */
public class e2b {
    
    public static void main(String[] args) {
         String sName;
         int nAge;
        Scanner sin = new Scanner(System.in);
        System.out.println("What's Your Name");
        sName = sin.next();
        System.out.println("Hello " + sName);
        System.out.println("How old are you?");
        nAge = sin.nextInt();
        
        
        if (nAge >= 18)
        {System.out.println("Step right up " + sName);
        System.out.println(" and Vote!!!");}
        
        else if (nAge <18) 
        {System.out.println("Sorry " + sName);
        System.out.println("Maybe next time ");}
    }
}
