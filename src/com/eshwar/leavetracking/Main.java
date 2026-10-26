package com.eshwar.leavetracking;

public class Main {
	public static void main(String[] args) {

		Employee emp = new Employee("E101", "Eshwar", "eshwar@example.com", 27);

		LeaveRequest request = new LeaveRequest("LR001", emp, 3, "Family function");

		System.out.println(emp.getLeaveBalance()); // 20

		request.approve();

		System.out.println(request.getStatus()); // APPROVED
		System.out.println(emp.getLeaveBalance()); // 17
		request.approve();
	}
}