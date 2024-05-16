
public class Exception1 {

    public static void main(String[] args) {
        
        int a=10;
        int b=0;

        try{
        int res=a/b;

        }
        catch(Exception e){
            throw e;
        }
        finally{
            System.out.println("last");
        }
    }
}