
// due to limitation of single class, the  combination of single,multiple through interfaces


interface A {
    void A();

}

interface B {
    void B();

}

 class One implements A,B{  //single level inheritance
    public void A(){
        System.out.println("Form One Interface A");
    }

    public void B(){
        System.out.println("From One Interface A");
    }
 }


 class Two implements A,B{
    public void A(){
        System.out.println("From Two Interface A");
    }

    public void B(){
        System.out.println("From Two Interface A");
    }
 }





public class lec5_Hybrid {

    public static void main(String[] args) {
        System.out.println("combination of Multiple inherit + Single level inherit");
        One o = new One();
        o.A();
        o.B();
        

        // Two b = new Two();
        // b.A();
        // b.B();
    }
}