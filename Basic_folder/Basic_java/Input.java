import java.util.Scanner;
// import java.util.*;

public class Input {
    public static void main(String args[]){

//        System.out.println("Simple without inputs");

//        Scanner n =new Scanner(System.in);

//        String Name = n.nextLine();
//     //    int roll = n.nextInt();
//        String surname =n.next();
//     //    int Room =n.nextInt();


//     //    Float no = n.nextFloat();
//             System.out.println(Name);
//             System.out.println(surname);


    //    System.out.println(Name);
    //    System.out.println(roll);
    //    System.out.println(surname);
            //   System.out.println(Room);
    // System.out.println(no);
    // System.out.println(Name);
    




    Scanner s= new Scanner(System.in);

    // String word= s.next();
    // System.out.println(word);

    // String sentence= s.nextLine();
    // System.out.println(sentence);

    byte Simple= s.nextByte();
    System.out.println(Simple);

    int num= s.nextInt();
    System.out.println(num);

    Short small= s.nextShort();
    System.out.println(small);

    Long n= s.nextLong();
    System.out.println(n);


    double bigdigit= s.nextDouble();
    System.out.println(bigdigit);

    float deci= s.nextFloat();
    System.out.println(deci);
    
    Boolean val= s.nextBoolean();
    System.out.println(val);



  










    }
}
