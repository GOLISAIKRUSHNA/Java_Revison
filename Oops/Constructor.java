class Animal {
    String type;

    Animal(String type) {
        this.type = type;
    }
}

class Dog extends Animal  {
    String breed;

    Dog(String type, String breed) {
        super(type);         // **Invokes the constructor of the superclass very imp example
        this.breed = breed;
        System.out.println(type);

        System.out.println(breed);
        System.out.println(super.type);  //invoking instance variable with super keyword
    }

}


 class Simple {
    int c;
    int d;

    Simple(int a,int b){
        this.c=a;
        this.d=b;

        System.out.println(c);
        System.out.println(d);
    }
    


    
}

class Maja  extends Simple{

    Maja(int a,int b,int c,int d){
        super(a,b);
        System.out.println(this.c);
        System.out.println(this.d);

        System.out.println(c);
        System.out.println(d);

    }

    
}
    
public class Constructor {
    public static void main(String[] args) {
        Dog d=new Dog("First", "second");

        // Maja s=new Maja(1,2,3,4);
        

        
    }
    
}
