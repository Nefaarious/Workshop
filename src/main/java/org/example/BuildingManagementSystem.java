package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BuildingManagementSystem {
    private final ArrayList<String> buildings = new ArrayList<>();
    boolean run = true;
    Scanner callMethod = new Scanner(System.in);

    public static void main(String[] args) {
        BuildingManagementSystem buildingManagementSystem = new BuildingManagementSystem();
        buildingManagementSystem.start();
    }

    public void start() {
        while (run) {
            System.out.println("Enter 'add' to add a building, 'remove' to remove a building, list to see a list of your added buildings, or 'exit' to quit:");
            String userInput = callMethod.nextLine();

            switch (userInput.toLowerCase()) {
                case "add":
                    addBuilding(buildings);
                    break;
                case "remove":
                    removeBuilding(buildings);
                    break;
                case "exit":
                    System.out.println("Exiting the program.");
                    run = false;
                    break;
                case "list":
                    System.out.println("Here is a list of  your buildings"+buildings);
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'add', 'remove', 'list' or 'exit'.");
            }
        }
    }

    public void getBuildings() {
        System.out.println("Buildings:" + buildings);
    }

    public void addBuilding(ArrayList<String> buildings) {
        System.out.print("Enter name of building to add: ");
        String element = callMethod.nextLine();
        this.buildings.add(element);
    }

    public void removeBuilding(ArrayList<String> buildings) {
        System.out.print("Enter the name of building to remove: ");
        String elementToRemove = callMethod.nextLine();

        if (this.buildings.contains(elementToRemove)) {
            this.buildings.remove(elementToRemove);
            System.out.println("That building has been removed.");
        } else {
            System.out.println("Building not found.");
        }
    }
}
