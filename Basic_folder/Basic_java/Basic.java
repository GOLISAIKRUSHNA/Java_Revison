import java.util.ArrayList;

class Basic {
public static void main(String[] args){
    int a=5;
    int b=13;
    int sum;
    float num=3.41f;
    int alpha='a';
    char bet='A';
    String name="My self saikrushna Goli i am It engineer";
    String surname="goli";
    int[] sai=new int[5];
    int goli[]=new int[2];
    goli[0]=32;

    sai[0]=10;
    sai[1]=20;
    sai[2]=30;
    // sai[3]=40;
    // sai[4]=50;


//     for (int i=0;i<5;i++)
//     {
//         System.out.println(i);
//     }
//     for (int i=0;i<5;i++)
//     {
//         System.out.println(sai[i]);
//     }
  
// System.out.println("*******End********");
// System.out.println("using while loop");
// int j=0;
// while (j<5) {
//     System.out.println(sai[j]);
//     j++;
// }

    System.out.println(sai[1]+" "+goli[0]);

    sum =a+b;

    // System.out.println(sum);
    System.out.println("integer number: "+sum);
    System.out.println("floating number : "+num);
    System.out.println("alphabet to number "+alpha);
    System.out.println("tcharacter alphabet "+bet);
    System.out.println("Single word "+surname);
    System.out.println("Sentence of word "+name);


 //collection library
  ArrayList<Integer> myList=new ArrayList<Integer>();
myList.add(5);
myList.add(10);
myList.add(15);
myList.add(20);
myList.add(25);
System.out.println(myList);


if(sai[1]>100){
    System.out.println("yes it is greater");

}
else{
    System.out.println("No it is not a greater");
}


}
};