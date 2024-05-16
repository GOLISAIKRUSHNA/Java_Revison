
package Sir;
import java.util.Scanner;



public class array {
    public static void main(String[] args) {
        int size=5;
        int row=3;
        int arr[]={1,2,3,4,5};
        int arr1[][]=new int[row][size];
        int arr2[][][]={{{1,2},{12,23},{4,5}}};

        System.out.println(arr[2]);
        System.out.println(arr1[1][1]);
        System.out.println(arr2);

        Scanner sc= new Scanner(System.in);
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }

        // for(int i:arr){
        //     System.out.print(i+" ");
        // }
        // System.out.println();


        // System.out.println("2 D array");
        // for(int i=0;i<arr1.length;i++){
        //     for(int j=0;j<arr1.length;j++){
        //         arr1[i][j]=sc.nextInt();
        //     }   
        // }


        // for(int i[]:arr1){
        //     for(int j:i){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // for(int i[]:arr1){
        //     for(int j:i){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        //jagged arr
        //rows are fixed

        int jag[][]=new int[2][];

        jag[0]=new int []{1,2,3};
        jag[1]=new int []{1,2};
        // jag[2]=new int []{1,2};

        for(int i[]:jag){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();

        }



    }
}
