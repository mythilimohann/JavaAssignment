package coreJavaAssignment.pragraAssignment.interfaces.animal;

public class Monkey implements Climbable{
    @Override
    public void feed() {
        System.out.println("Monkey is fed with bananas");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey is whooping");
    }

    @Override
    public void climb() {
        System.out.println("Monkey is climbing the tree");
    }
}
