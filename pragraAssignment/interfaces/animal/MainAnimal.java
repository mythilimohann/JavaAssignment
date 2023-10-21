package coreJavaAssignment.pragraAssignment.interfaces.animal;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Lion();
        animal.feed();
        animal.makeSound();
        System.out.println();

        Swimmable aquaticAnimal = new Penguin();
        aquaticAnimal.feed();
        aquaticAnimal.makeSound();
        aquaticAnimal.swim();
        System.out.println();

        Climbable climbingAnimal = new Monkey();
        climbingAnimal.feed();
        climbingAnimal.makeSound();
        climbingAnimal.climb();
    }
}
