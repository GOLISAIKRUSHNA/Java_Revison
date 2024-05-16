/**
 * Thread2
 */
public class Thread2 {

    public static void main(String[] args) {
        
        System.out.println("starting with threading");
        Emp e  = new Emp();
        e.start();


        Comp c = new Comp();
        c.start();

        System.out.println("Total count of thread is : 4");

        System.out.println("These thing are very important for interview");

    }

}



class Emp  extends Thread{

    @Override
    public void run() {
        super.run();

        System.out.println("Employer class Thread");
    }
}
class Comp  extends Thread{ 
    @Override
    public void run() {
        super.run();
        System.out.println("Computer class thread");
    }

    
}

    
