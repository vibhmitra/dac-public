package com.assignment4.question6temp;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PersonManager {

  private static final String FILE_NAME = "people.txt";
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    while (true) {
      System.out.println("\nPerson Management System:");
      System.out.println("1. Add Person");
      System.out.println("2. Delete Person");
      System.out.println("3. Search Person");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          addPerson();
          break;
        case 2:
          deletePerson();
          break;
        case 3:
          searchPerson();
          break;
        case 4:
          System.out.println("Exiting Person Management System. Goodbye!");
          scanner.close();
          System.exit(0);
        default:
          System.out.println("Invalid choice! Please enter a number between 1 and 4.");
      }
    }
  }

  private static void addPerson() throws IOException {
    System.out.print("Enter Person Name: ");
    String name = scanner.next();
    scanner.nextLine(); // Consume extra newline

    System.out.print("Enter Person Age: ");
    int age = scanner.nextInt();
    scanner.nextLine(); // Consume extra newline

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
      writer.write(name + "," + age + "\n");
      System.out.println("Person added successfully!");
    }
  }

  private static void deletePerson() throws IOException {
    System.out.print("Enter Name of Person to delete: ");
    String nameToDelete = scanner.next();

    String tempFileName = "temp.txt";
    BufferedWriter tempWriter = null;
    boolean deleted = false;
    
    try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
      tempWriter = new BufferedWriter(new FileWriter(tempFileName));
      String line;
      deleted = false;

      while ((line = reader.readLine()) != null) {
        String[] parts = line.split(",");
        String name = parts[0];
        if (!name.equals(nameToDelete)) {
          tempWriter.write(line + "\n");
        } else {
          deleted = true;
        }
      }

      if (deleted) {
        System.out.println("Person deleted successfully!");
      } else {
        System.out.println("Person with name " + nameToDelete + " not found.");
      }
    } finally {
      if (tempWriter != null) {
        tempWriter.close();
      }
      // Delete original file and rename temporary file if deletion happened
      if (deleted) {
        new java.io.File(FILE_NAME).delete();
        new java.io.File(tempFileName).renameTo(new java.io.File(FILE_NAME));
      }
    }
  }

  private static void searchPerson() throws IOException {
    System.out.print("Enter Name of Person to search: ");
    String nameToSearch = scanner.next();

    try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
      String line;
      boolean found = false;

      while ((line = reader.readLine()) != null) {
        String[] parts = line.split(",");
        String name = parts[0];
        if (name.equals(nameToSearch)) {
          found = true;
          System.out.println("Person Found:");
          System.out.println("Name: " + name + ", Age: " + parts[1]);
          break;
        }
      }

      if (!found) {
        System.out.println("Person with name " + nameToSearch + " not found.");
      }
    }
  }
}

