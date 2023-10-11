package coreJavaAssignment.pragraAssignment.inheritance;

class Samsung extends Mobile{
    String os;
    String model;

    Samsung(String color, /*int memory,*/ int simSlotCount, String os, String model) {
        super(color,/* memory,*/ simSlotCount);
        this.os = os;
        this.model = model;
    }

    void printData() {
        this.memory=20;
        super.printData();
        System.out.println("OS: "+os);
        System.out.println("Model: "+model);
        System.out.println("Samsung memory: "+super.memory);
    }

}
