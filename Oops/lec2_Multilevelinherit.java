 class A {
    void Hii(){
        System.out.println("A class");
    }
}

class B extends A {
    void Bye(){
        System.out.println("B class");
    }
}

class C extends B {
    void sai(){
        System.out.println("C class");
    }
}

public class lec2_Multilevelinherit {

    public static void main(String[] args) {
        C o =new C();
        o.Hii();
        o.Bye();
        o.sai();
        
    }
}
