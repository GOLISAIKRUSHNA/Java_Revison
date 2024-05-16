/**
 * Thread2
 */
public class Thread1 {

    public static void main(String[] args) {
        
        System.out.println("starting with threading");
        Emp e  = new Emp();
        e.start();

        System.out.println(Thread.activeCount());

    }

}



class Emp  extends Thread{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();

        System.out.println("Employer class calling");
    }
}

    
