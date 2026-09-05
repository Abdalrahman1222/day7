package day7;

public class Zoo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();
        Dog rocky = new Dog();
        rocky.makeSound();
        rocky.bite();
        feed(rocky);
//        Animal animal = new Animal();
        Animal animal = new Dog();
        animal.makeSound();
        ((Dog)animal).bite();
        feed(animal);
        animal = new Cat();
        animal.makeSound();
        ((Cat)animal).scratch();
        feed(animal);

    }
    public static void feed(Animal rocky){
        if(rocky instanceof Dog){
            System.out.println("Here is your dog food");
        }
        else if(rocky instanceof Cat){
            System.out.println("Here is your cat food");
        }
    }
}
