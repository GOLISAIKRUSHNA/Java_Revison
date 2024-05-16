public class Exceptionhandling3 {
    public static void main(String[] args) {
        

        try {

        //    int a=10,b=0,c; 
        //     c=a/b;
        //     System.out.println(c);

            // int arr[]={10,20,30,40};
            // System.out.println(arr[5]);

            //  String str="Goli";
            //  str.toUpperCase();
            // System.out.println(str);

            String d="sai";
            int f;
            f=Integer.parseInt(d);

            System.out.println(f);





            
        } 
        catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
        catch ( ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
