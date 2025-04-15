package com.assignment4.question6;

import java.io.*;
import java.util.*;

class Employee {
    String id;
    String name;
    int age;
    String designation;

    public Employee(String id, String name, int age, String designation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Designation: " + designation;
    }
}

public class Question6 {
    List<Employee> employees = new ArrayList<>();
    String filename = "Employee.txt";

    public void addEmployee(String id, String name, int age, String designation) {
        Employee employee = new Employee(id, name, age, designation);
        employees.add(employee);
        saveEmployeesToFile();
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void deleteEmployee(String id) {
        employees.removeIf(employee -> employee.id.equals(id));
        saveEmployeesToFile();
    }

    public void searchEmployee(String id) {
        for (Employee employee : employees) {
            if (employee.id.equals(id)) {
                System.out.println(employee);
                return;
            }
        }
        System.out.println("Employee not found");
    }

    private void saveEmployeesToFile() {
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(employees);
        } catch (IOException e) {
            System.out.println("Error saving employees: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void loadEmployeesFromFile() {
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            employees = (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading employees: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Question6 ems = new Question6();
        ems.loadEmployeesFromFile();
        ems.addEmployee("1", "John Doe", 30, "Manager");
        ems.displayEmployees();
        ems.deleteEmployee("1");
        ems.searchEmployee("1");
    }
}













