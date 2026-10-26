package com.eshwar.leavetracking;

/**
 * 
 */
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(
            "E101",
            "Eshwar",
            "eshwar@example.com",
            29
        );

        System.out.println("Employee ID: " + emp.getEid());
        System.out.println("Name: " + emp.getName());
        System.out.println("Email: " + emp.getEmail());
        System.out.println("Leave Balance: " + emp.getLeaveBalance());
    }
}