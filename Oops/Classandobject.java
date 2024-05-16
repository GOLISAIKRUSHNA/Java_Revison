

 class Demo {
    String color;  //instance variable
    int x;         //properties variable


    void color(String c){
        System.out.println(c);
    }

    void val(int x){
        System.out.println(x);
    }

    void taking(int y){
        this.x=y;
        System.out.println(x);
    }

    void supernew(){
        System.out.println("new method using super keyword");
    }

    /**
     * Sai
     */
    public class Sai extends Demo {
        
        void supernew() {  //must be in function only
            super.supernew();
            System.out.println("new method using update supernew");
            this.color="goli";
            System.out.println(color);

        }

    }


    
}
public class Classandobject {

    public static void main(String[] args) {
        Demo d=new Demo();
        d.color("red");
        d.val(1);
        d.taking(3);
        
    }
}