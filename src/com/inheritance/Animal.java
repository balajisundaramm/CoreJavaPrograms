package com.inheritance;

/**
 * Created by Balaji on 21/10/17.
 */
public class Animal {
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("I am an animal with name "+getName()+" eating...");
    }
    public void sleep(){
        System.out.println("I am an animal with name "+getName()+" sleeping.. zz zz z z");
    }
    public void dance(){
        System.out.println("I am an animal with name "+getName()+" dancing...");
    }
}
class Hippo extends Animal{
    public void smoke(){
        System.out.println("I am a Hippo with name "+getName()+" smoking...");
    }
}
class Croc extends Animal{
    public void swim(){
        System.out.println("I am a Croc with name "+getName()+" swimming...");
    }
}
class Tiger extends Animal{

}
class Vet{
    public void treat(Animal animal){
        animal.eat();
        animal.sleep();
        animal.dance();
        if (animal instanceof Hippo){
            Hippo hippo=(Hippo) animal;
            hippo.smoke();
        }
        if (animal instanceof Croc){
            Croc croc=(Croc) animal;
            croc.swim();
        }
    }
}
class TestAnimal{
    public static void main(String[] args) {
        Vet vet=new Vet();
        Animal animal=new Hippo();
        animal.setName("Zizan");
        Animal animal1=new Croc();
        animal1.setName("Lithi");
        Animal animal2=new Tiger();
        animal2.setName("Ramu");
        vet.treat(animal);
        vet.treat(animal1);
        vet.treat(animal2);
    }
}