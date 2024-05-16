package Sir;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {
        System.out.println("hii");

        int a=4,b=3;
        int e=0;
        float h=1.2f;
        
        int c=(a<b)?a:(b>a)?b:e;
        System.out.println(c);


        // Scanner sc=new Scanner(System.in);
        // String ac= sc.nextLine();// enter string consider
        // String bc=sc.next();   /// only one 

        // System.out.println(ac+bc);


        System.out.printf("%d",a);
        System.out.printf("%f",h);
        System.out.println();

        // System.out.println(new Date());

        SimpleDateFormat f = new SimpleDateFormat("dd-mm-yyyy");
        String str =f.format(new Date());
        System.out.println("Today's DATE: " +str);

        
    }

    
}

