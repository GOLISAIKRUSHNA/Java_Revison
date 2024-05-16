
package Sir;
// import java.util.StringTokenizer;

// import javax.print.DocFlavor.STRING;

public class String {
    public static void main(String[] args) {

        char arr[]={'a','b','c'};
        System.out.println(arr);

        // String str[]={"abc","goli"};
        // System.out.print(str[1]);
        // System.out.println();

        // for(String s:str){
        //     System.out.print(s+" ");
        // }

        // String str="abc";
        // System.out.println(str.charAt(0));


        // int arr1[]={1,2,3};
        // System.out.println(arr1);



        

        //string pool ..using optimatic no copy to var--> that why String are immutable in java
       // 5 ways to create string

        String str1="abc";
        String str2="abc";  //string pool using the memory optimistic to value --->immutable
        String str3=new String("abc");
        // str1="pqr";// string are immutable in java

        System.out.println(str1==str2);// instance ko compare kartha hai str1==str2. Not for content str1.equals() 
                                        //because instances are different in number in string pool
        System.out.println(str1.equals(str3));  // content

        StringBuilder str4=new StringBuilder("abc");
        StringBuffer str5=new StringBuffer("abc");

        //Thats why we are using string buffer and string builder for memory in string

        //string builder  and string buffer

        StringBuffer sb=new StringBuffer("goli");
        System.out.println(sb);
        sb.append("saikrushna");
        System.out.println(sb);
        sb.insert(0,"Krishna");
        System.out.println(sb);

        sb.delete(7, 9);
        sb.length();
       
        System.out.println( sb.capacity());
        System.out.println(sb);  //string buffer string builder both act same  to solve immutable string's 
                                 //but diff is one both not support multithreading 

    

        //string method



    }


}
