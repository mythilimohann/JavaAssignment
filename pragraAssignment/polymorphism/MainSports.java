package coreJavaAssignment.pragraAssignment.polymorphism;

public class MainSports {
    public static void main(String[] args) {

        Sports sport = new Sports();
        System.out.println(sport.getName());
        sport.getNumberOfTeamMembers();

        Sports soccer = new Soccer();
        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();
    }
}
