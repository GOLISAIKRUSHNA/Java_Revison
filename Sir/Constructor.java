package Sir;

public class Constructor {

    public Constructor(){  //explicit constructor
        System.out.println("hii");
       }

       public Constructor(int hii){  //explicit constructor
        System.out.println("parameter"+hii);
       }
    public static void main(String[] args) {
        
      Constructor c = new Constructor();
      Constructor b = new Constructor(12);

        // Constructor c=new Constructor();

      
    }
}
