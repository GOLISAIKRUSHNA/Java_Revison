

import java.util.Scanner;

public class array_input
 {

    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Length of array:");
        int size=sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
