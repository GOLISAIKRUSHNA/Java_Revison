
// single one class inheritance multiple subclass

// A class
// B class extends A 
// C class extends A
// D class extends A




// class A {

//     void Base(){
//         System.out.println("Base of A class");
//     }
// }
// class B extends A {

//     void SeparateB(){
//         System.out.println(" B class");
//     }

    
// }
// class C extends A {

//     void SeparateC(){
//         System.out.println(" C class");
//     }

    
// }


// public class lec3_Hierarchicalinherit {

//     public static void main(String[] args) {
//         System.out.println("A is giving to B separatly and C separatly");

//         B bObject = new B();
//         System.out.println("Methods from class B:");
//         bObject.Base(); // Inherited from class A
//         bObject.SeparateB();
        
//     }
// }

class Animal {
    void eat() {
        System.out.println("Base Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class lec3_Hierarchicalinherit {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.bark(); // Defined in Dog class

        // Cat cat = new Cat();
        // cat.eat();  // Inherited from Animal
        // cat.meow(); // Defined in Cat class
    }
}

