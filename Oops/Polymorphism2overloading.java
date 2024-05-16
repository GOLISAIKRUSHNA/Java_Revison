
class Last {
    
    void hii(int a,int b){
        System.out.println("values of a and b"+a+" "+b);
    }

    void hii(int a,int b,int c){
        System.out.println("values of a and b"+a+" "+b+" "+c);
    }

    void bye(int a,String b){
        System.out.println("values of Number and String :"+a+" "+b);
    }

    void bye(String a,int c){
        System.out.println("values of String and Number :"+a+" "+ c);
    }

    
}
public class Polymorphism2overloading {
    public static void main(String[] args) {
        Last o =new Last();

        o.hii(2,3);
        o.hii(1,2,3);

     

        o.bye(1,"Goli");
        o.bye("Saikrushna",2);
        
        
    }

    
}
