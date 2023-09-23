package coreJavaAssignment.Assign1;

import java.util.Scanner;

public class IVRTelecomService {
    public static void main(String[] args) {
        System.out.println("Welcome to the ABC Telecom Services");
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");
        System.out.println("Select the language: ");
        Scanner scan = new Scanner(System.in);
        int opt = scan.nextInt();
        char cont;
        int prod;
        int serv;

        do {
        switch (opt) {
            case 1:
                System.out.println("Language selected is ENGLISH");
                System.out.println("Press 1 for Internet");
                System.out.println("Press 2 for Mobile");
                System.out.println("Press 3 for TV");
                System.out.println("Select the product: ");
                prod = scan.nextInt();
                switch (prod) {
                    case 1:
                        System.out.println("INTERNET");
                        System.out.println("Press 1 for new connection");
                        System.out.println("Press 2 for existing connection");
                        System.out.println("Press 3 for bill payment");
                        System.out.println("Press 4 for technical support");
                        System.out.println("Select the service: ");
                        serv = scan.nextInt();
                        if (serv == 1) {
                            System.out.println("Requested for new internet connection");
                        } else if (serv == 2) {
                            System.out.println("Plan changes");
                        } else if (serv == 3) {
                            System.out.println("Paid the internet bill");
                        } else if (serv == 4) {
                            System.out.println("Technical support needed as internet is not working." +
                                    " A complaint is raised");
                        } else {
                            System.out.println("Invalid option selected");
                        }
                        break;
                    case 2:
                        System.out.println("MOBILE");
                        System.out.println("Press 1 for new connection");
                        System.out.println("Press 2 upgrade plan");
                        System.out.println("Press 3 for bill payment");
                        System.out.println("Select the service: ");
                        serv = scan.nextInt();
                        if (serv == 1) {
                            System.out.println("Requested for new mobile connection");
                        } else if (serv == 2) {
                            System.out.println("Plan upgraded");
                        } else if (serv == 3) {
                            System.out.println("Paid the mobile bill");
                        } else {
                            System.out.println("Invalid option selected");
                        }
                        break;
                    case 3:
                        System.out.println("TV");
                        System.out.println("Press 1 for new connection");
                        System.out.println("Press 2 for existing connection");
                        System.out.println("Press 3 to activate a channel");
                        System.out.println("Select the service: ");
                        serv = scan.nextInt();
                        if (serv == 1) {
                            System.out.println("Requested for new TV connection");
                        } else if (serv == 2) {
                            System.out.println("Existing connection - Changed plan to sports premium");
                        } else if (serv == 3) {
                            System.out.println("Activated the channel");
                        } else {
                            System.out.println("Invalid option selected");
                        }
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
                break;
            case 2:
                System.out.println("Language selected is French");
                System.out.println("Press 1 for Internet");
                System.out.println("Press 2 for Mobile");
                System.out.println("Press 3 for TV");
                System.out.println("Select the product: ");
                prod = scan.nextInt();
                switch (prod) {
                    case 1:
                        System.out.println("INTERNET");
                        System.out.println("Press 1 for new connection");
                        System.out.println("Press 2 for existing connection");
                        System.out.println("Press 3 for bill payment");
                        System.out.println("Press 4 for technical support");
                        System.out.println("Select the service: ");
                        serv = scan.nextInt();
                        if (serv == 1) {
                            System.out.println("Requested for new internet connection");
                        } else if (serv == 2) {
                            System.out.println("Plan changes");
                        } else if (serv == 3) {
                            System.out.println("Paid the internet bill");
                        } else if (serv == 4) {
                            System.out.println("Technical support needed as internet is not working." +
                                    " A complaint is raised");
                        } else {
                            System.out.println("Invalid option selected");
                        }
                        break;
                    case 2:
                        System.out.println("MOBILE");
                        System.out.println("Press 1 for new connection");
                        System.out.println("Press 2 upgrade plan");
                        System.out.println("Press 3 for bill payment");
                        System.out.println("Select the service: ");
                        serv = scan.nextInt();
                        if (serv == 1) {
                            System.out.println("Requested for new mobile connection");
                        } else if (serv == 2) {
                            System.out.println("Plan upgraded");
                        } else if (serv == 3) {
                            System.out.println("Paid the mobile bill");
                        } else {
                            System.out.println("Invalid option selected");
                        }
                        break;
                    case 3:
                        System.out.println("TV");
                        System.out.println("Press 1 for new connection");
                        System.out.println("Press 2 for existing connection");
                        System.out.println("Press 3 to activate a channel");
                        System.out.println("Select the service: ");
                        serv = scan.nextInt();
                        if (serv == 1) {
                            System.out.println("Requested for new TV connection");
                        } else if (serv == 2) {
                            System.out.println("Existing connection - Changed plan to sports premium");
                        } else if (serv == 3) {
                            System.out.println("Activated the channel");
                        } else {
                            System.out.println("Invalid option selected");
                        }
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        System.out.println("Do you want to continue?(Y/N)");
        cont = scan.next().charAt(0);
    } while(cont =='Y' || cont == 'y');
    }
}
