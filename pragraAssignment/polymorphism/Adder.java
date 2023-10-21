package coreJavaAssignment.pragraAssignment.polymorphism;

class Adder extends Arithmetic {
    Adder() {
        System.out.println("My superclass is "+this.getClass().getSuperclass().getSimpleName());
    }
}
