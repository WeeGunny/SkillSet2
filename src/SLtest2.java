/*
 Luke Simpson
 */

import java.util.*;
import java.text.*;

public class SLtest2 {

    public static void main(String[] args) {
        double dA, dB, dC, dDiscrim, dAns, dAns2;
        DecimalFormat twoDec = new DecimalFormat("#0.00");
        Scanner sin = new Scanner(System.in);
        System.out.println("enter a value for a");
        dA = sin.nextInt();
        System.out.println("enter a value for b");
        dB = sin.nextInt();
        System.out.println("enter a value for c");
        dC = sin.nextInt();

        dDiscrim = Math.pow(dB, 2) - (4 * dA * dC);

        if (dA == 0) {
            System.out.println("a can not have a value of 0, the calculation could not be done.");
        } else if (dDiscrim < 0) {
            System.out.println(" The discriminant is negative, the calculation can not be done.");
        } else {
            dAns = (-dB + (Math.sqrt(dDiscrim)) / (2 * dA));
            String sAns = twoDec.format(dAns);
            System.out.println(sAns);
            dAns2 = (-dB - (Math.sqrt(dDiscrim)) / (2 * dA));
            String sAns2 = twoDec.format(dAns2);
            System.out.println(sAns2);
        }

    }
}
