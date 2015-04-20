/*
 Luke Simpson
 */

import java.util.*;

public class e2c {

    public static void main(String[] args) {
        double dRad, dCircum, dArea;
        String sResponse;
        Scanner sin = new Scanner(System.in);
        System.out.println("Do you want the area or circumference?");
        sResponse = sin.next();
        
        if (sResponse.equals ("circumference"))
        {System.out.println("what is the Radius?");
        dRad = sin.nextInt();
        dCircum = 2 * dRad * Math.PI;
        System.out.println(" The Circumfrance is " + dCircum);}
        
        else if(sResponse.equals ("area"))
        {System.out.println("what is the Radius?");
        dRad = sin.nextInt();
        dArea = Math.pow((Math.PI * dRad), 2);
        System.out.println("The Area is " + dArea);}
    }
}
