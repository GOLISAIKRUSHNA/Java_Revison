
class A  extends Thread{
    
    @Override
   public void run() {
        
        try {
            for(int i=1;i<=5;i++){
                System.out.println(i+"first");
                Thread.sleep(1000);
            
                
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    
}
public class Multithreading1 {

    
    public static void main(String[] args) throws InterruptedException {
        A t=new A();
        t.start();

        for(int i=1;i<=5;i++){
            System.out.println(i +"second");
            Thread.sleep(1000);
        
            
        }
        
    }
}