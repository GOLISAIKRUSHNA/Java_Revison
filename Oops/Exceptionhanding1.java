// nullpoit


public class Exceptionhanding1 {

    public static void main(String[] args) {
        
        String str="sai";
        try {
        System.out.println(str.toUpperCase());
            
        } catch (NullPointerException e) {
            System.out.println("null cannot cast to uppercase");
        }
    }
    
}
