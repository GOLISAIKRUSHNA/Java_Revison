package Basic_folder.Loop.Continue;

import java.util.Scanner;

public class Question_continue {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
    
        while (true) {
            System.out.println("Enter the input:");
            int val=sc.nextInt();
            if(val%10==0){
                continue;
            }
            System.out.println(val);
        }

    }
}
