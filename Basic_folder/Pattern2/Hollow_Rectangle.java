package Basic_folder.Pattern2;

import java.util.Scanner;
        


public class Hollow_Rectangle {

    static void Hollow_Rectangle(int row,int col)
    {

        for(int i=1;i<=row;i++){
            for (int j=1;j<=col;j++){

                if( i==1 || i==row || j==1 || j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();

        }


            
    }
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        int row=sc.nextInt();
        int col=sc.nextInt();

        Hollow_Rectangle(row,col);


        
    }
}
