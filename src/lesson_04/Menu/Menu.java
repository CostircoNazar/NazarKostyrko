package lesson_04.Menu;

import java.util.Scanner;

public class Menu {
    boolean exit = false;

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.runMenu();

    }

    public void createMenu() {
        System.out.println("|----------------------|");
        System.out.println("|     Main Menu        |");
        System.out.println("|----------------------|");
        System.out.println("|  1) Physical stage   |");
        System.out.println("|  2) My target        |");
        System.out.println("|  3) My trainings     |");
        System.out.println("|  4) My diet          |");
        System.out.println("|  5) My calendar      |");
        System.out.println("|  6) Personal Trainer |");
        System.out.println("|  7) Compared board   |");
        System.out.println("|  8) Feedback         |");
        System.out.println("|  0) Exit             |");
        System.out.println("|----------------------|");
    }
    private void runMenu() {
            while(!exit) {
                createMenu();
                int choice = getInput();
                options(choice);
        }
    }

    private int getInput() {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice < 0) {
            try {
                System.out.println("Please enter your number of choice :");
                choice = Integer.parseInt(input.nextLine());
                //check = input.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Invalid parameters. Try again");
            }
        }
        return choice;
    }
    private void options(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("Exit");
                break;
            case 1:
                System.out.println("Here to comment your physical stage");
                break;
            case 2:
                System.out.println("Dont be lazy!!! Create own targets to increase chances to bring ideas to life");
                break;
            case 3:
                System.out.println("Set up training schedule. For some reasons do it!");
                break;
            case 4:
                System.out.println("The most important thing in your life being");
                break;
            case 5:
                System.out.println("Do not forger important things and plan future!");
                break;
            case 6:
                System.out.println("Simple choice between personal trainers");
                break;
            case 7:
                System.out.println("Find the results here! This will lead you to be attentive to your self");
                break;
            case 8:
                System.out.println("Do not hesitate to make feedback! We are happy to get any of them");
                break;
            default:
                System.out.println("Out of range");
                break;
        }
    }


}
