package Sir;

import java.util.Random;

public class Static_non_static {
     static int number;
     static int hii;

     static void hii(){
        System.out.println("hii is called");
     }
     

    public static void main(String[] args) {

        Static_non_static t1 = new Static_non_static();
        t1.number=new Random().nextInt();

        Static_non_static t2 = new Static_non_static();
        t2.number=new Random().nextInt();

        System.out.println(t1.number);
        System.out.println(t2.number);
        System.out.println(Static_non_static.number);

        System.out.println(hii);
        hii();
        // System.out.println(Static_non_static.number);






        
    }
}
