public class Dynamicresolution {

    public static void main(String[] args) {
        Animal an=new Animal();
        Animal d=new Dog();
        Animal c=new Cat();
        an.show();
        d.show();
        c.show();
    }
}
class Animal{
    void show(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void show(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal {
    void show(){
        System.out.println("Cat Meows");
    }  
}