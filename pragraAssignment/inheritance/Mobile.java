package coreJavaAssignment.pragraAssignment.inheritance;

class Mobile {
    String color;
    int memory = 120;
    int simSlotCount;

    Mobile(String color, /*int memory, */int simSlotCount) {
        this.color = color;
        //this.memory = memory;
        this.simSlotCount = simSlotCount;
    }

    void printData() {
        System.out.println("Color: "+color);
        System.out.println("Memory: "+memory); //20
        System.out.println("No of slots for the sim: "+simSlotCount);
    }
}
