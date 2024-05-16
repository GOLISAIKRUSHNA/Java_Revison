
/**
 * InnerSIngleinheritance
 */
 class Hii {

    String name;

    void hii(){
        System.out.println("single level inheritance");
    }

    
}
class Bye extends Hii {

    void chalo(){
        super.hii();
    }


    
}
public class lec1_SIngleinheritance3 {
    public static void main(String[] args) {
        Bye b= new Bye();
       b.chalo();
        b.hii();
    }
    
}
