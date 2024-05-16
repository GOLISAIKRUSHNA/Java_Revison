class A{
    void sai(){
        System.out.println("hii bro in class A");
    }

}
class B extends A{

    @Override
    void sai(){
        System.out.println("update hii bro in class B");
    }

}

class C extends B{

    @Override
    void sai(){
        System.out.println("update hii bro in class C");
    }

}
public class Polymorphism1overriding {
    public static void main(String[] args) {
        System.out.println("Polymorphism object in many forms");

        // A o =new A();
        // o.sai();  // it is override to class A

        A b =new B();
        b.sai();  // it is override to class B

        A a =new C();
        a.sai();  // it is override to class C

    }
    
    
    
}
