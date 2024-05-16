



 class A implements Runnable {

   public void run(){

    for(int i=1;i<=5;i++){
        System.out.println(i+"child Thread");
    }

    }

    
}


public class Multithreading2 {

    public static void main(String[] args) {

        A r =new A();

        Thread t=new Thread(r);

        t.start();

        for(int i=1;i<=5;i++){
            System.out.println(i+"Main Thread");
        }
    




    
        
    }
}