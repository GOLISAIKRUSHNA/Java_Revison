package Basic_folder.Pattern2;

import javax.xml.crypto.Data;

public class Diamond {
    static void Diamond(int n){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=((2*i)-3);j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Diamond(4);
    }
}
