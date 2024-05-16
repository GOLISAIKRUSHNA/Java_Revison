
// hiding implementation and showing the essentials things 


interface First {  // 100% abstraction  by interface
    
    void First();
    void Second();
    void Third();
    void Fourth();

}


abstract class SecondC implements First{ // only 60% abstraction is giving

    public void First(){
        System.out.println("First interface method");
    }

    public void Second(){
        System.out.println("Second interface method");
    }

    public abstract void Third();
    public abstract void Fourth();
    public abstract void meraSecondC();//creating method in merasecondc

}

 class Last extends SecondC {


    @Override
    public void Third() {
        System.out.println("Implementing in final class Third");
    }
    
    @Override
    public void Fourth() {
        System.out.println("implementing in final class Fourth");
    }

    @Override
    public void meraSecondC() {
        System.out.println("implementing in final class MeraSecondc");
    }

    void Lastclass(){
        System.out.println("Last last function");
    }


    
}

public class AbstractClass {
    public static void main(String[] args) {

        Last l =new Last();
        l.First();
        l.Second();
        l.Third();
        l.Fourth();
        l.meraSecondC();
        l.Lastclass();


        
    }
    
}
