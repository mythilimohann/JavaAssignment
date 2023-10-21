package coreJavaAssignment.pragraAssignment.interfaces.animal;

public class Lion implements Animal{
    @Override
    public void feed() {
        System.out.println("Lion is fed with meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion is Roaring");
    }
}
