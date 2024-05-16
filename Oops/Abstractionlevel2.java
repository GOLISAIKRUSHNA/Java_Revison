

 interface Main { // 100% abstraction ---->before java 7 only is content is there 
                                                            //after java 8 abstract class came
    void A();  // 100 percent abstraction
    void B();
    void C();
    void D();
    void E();
}

abstract class abstract1 implements Main {  //partial abstraction
    @Override
    public void A() {
        System.out.println("A in Abstract1");
        
    }

    @Override
    public void B() {  //No 100% abstraction is achieve
        System.out.println("A in Abstract1");
        
    }

    @Override
    public void C() {
        System.out.println("A in Abstract1");
        
    }

    void abstract1own(){
        System.out.println("own abstract1 method");

    }
    public abstract void D();
    public abstract void E();
}

 class Last  extends abstract1{  /// no abstraction 

    @Override
    public void D() {

        System.out.println("D in last class");
    }

    @Override
    public void E() {
        System.out.println("E in last class");

        
    }

    
}



class Abstractionlevel2 {

    public static void main(String[] args) {
    System.out.println("interface + abstract class");

    Main l= new Last();  // 100% abstraction in java
    l.A();   
    l.B();


    Last l1= new Last();  // No abstract
    l1.D();     // no abst 
    l1.E();

    abstract1 l2= new Last();  // partial abstraction
    l2.A();   
    l2.B();

        
    }
    
}
