

interface First {

    void hii(); //only methods
}

interface Second  {

    void Bye(); //only methods
}

interface Third {

    void Sai(); 
}

 class Normal implements First,Second,Third {//extract and add functionality to individuals


    public void hii(){
        System.out.println("First interface");

    }

    public void Bye(){
        System.out.println("Second interface");

    }

    public void Sai(){
        System.out.println("Third interface");
    }

    
}
public class lec4_Multiple_interface {
    public static void main(String[] args) {
        Normal n =new Normal();
        n.hii();
        n.Bye();
        n.Sai();
        

    }
}
