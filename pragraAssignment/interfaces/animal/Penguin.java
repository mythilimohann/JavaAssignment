package coreJavaAssignment.pragraAssignment.interfaces.animal;

public class Penguin implements Swimmable{
    @Override
    public void feed() {
        System.out.println("Penguin is fed with fishes");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin is squawking");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
