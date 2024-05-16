public class Exceptionhandling2 {
    public static void main(String[] args) {
        String str="sai";

        try {
        int b=Integer.parseInt(str);

        // System.out.println(b);
            
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("string cannot be casted into integer");
        }

    }
}
