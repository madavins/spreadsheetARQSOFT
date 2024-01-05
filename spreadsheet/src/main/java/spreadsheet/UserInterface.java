package spreadsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInterface {
    
    private SpreadsheetController controller;
    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void displayOptions() {
        while (true) {
            System.out.println("Please enter a command:");
            System.out.println("1. Read commands from File (RF)");
            System.out.println("2. Create a New Spreadsheet (C)");
            System.out.println("3. Edit a cell (E)");
            System.out.println("4. Load a Spreadsheet from a file (L)");
            System.out.println("5. Save the Spreadsheet to a file (S)");

            String input = scanner.nextLine();
            String[] parts = input.split(" ", 2);
            String command = parts[0];
            String argument = parts.length > 1 ? parts[1] : null;

            switch (command) {
                case "RF":
                    readCommandsFromFile(argument);
                    break;
                case "C":
                    controller.createSpreadsheet(20, 20, 1);
                    break;
                case "E":
                    String[] cellParts = argument.split(" ", 2);
                    String cellCoordinate = cellParts[0];
                    String newContent = cellParts.length > 1 ? cellParts[1] : null;
                    controller.editCell(cellCoordinate, newContent);
                    break;
                case "L":
                    controller.loadSpreadsheet(argument);
                    break;
                case "S":
                    controller.saveSpreadsheet(argument);
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
                    break;
            }
            displaySpreadsheet();
        }
    }

    public void displaySpreadsheet() {
        System.out.println("Spreadsheet:");
        for (int i = 0; i < controller.getSpreadsheet().getRowNum(); i++) {
            for (int j = 0; j < controller.getSpreadsheet().getColNum(); j++) {
                System.out.print(controller.getSpreadsheet().getCell(i, j).getContent().getValue() + " ");
            }
            System.out.println();
        }
    }

    public void readCommandsFromFile(String path) {
    try {
        Scanner fileScanner = new Scanner(new FileInputStream(path));

        while (fileScanner.hasNextLine()) {
            String input = fileScanner.nextLine();
            String[] parts = input.split(" ", 2);
            String command = parts[0];
            String argument = parts.length > 1 ? parts[1] : null;

            switch (command) {
                case "RF":
                    readCommandsFromFile(argument);
                    break;
                case "C":
                    controller.createSpreadsheet(20, 20, 1);
                    break;
                case "E":
                    String[] cellParts = argument.split(" ", 2);
                    String cellCoordinate = cellParts[0];
                    String newContent = cellParts.length > 1 ? cellParts[1] : null;
                    controller.editCell(cellCoordinate, newContent);
                    break;
                case "L":
                    controller.loadSpreadsheet(argument);
                    break;
                case "S":
                    controller.saveSpreadsheet(argument);
                    break;
                default:
                    System.out.println("Invalid command in file. Please check the file.");
                    break;
            }
            displaySpreadsheet();
        }

        fileScanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("File not found. Please check the file path.");
    }
}
}