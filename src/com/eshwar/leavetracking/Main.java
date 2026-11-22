package com.eshwar.leavetracking;

public class Main {
	public static void main(String[] args) {

		Employee emp = new Employee("E101", "Eshwar", "eshwar@example.com", 27);

		LeaveRequest request = new LeaveRequest("LR001", emp, 3, "Family function");

		System.out.println(emp.getLeaveBalance()); // 20

		request.approve();

		System.out.println(request.getStatus()); // APPROVED
		System.out.println(emp.getLeaveBalance()); // 17
		
		Employee emp2 = new Employee("E102", "Jason", "lason@id.com", 2);
		LeaveRequest request2 = new LeaveRequest("LR002", emp2, 1, "To Play GTA 6");
		System.out.println(emp2.getLeaveBalance());
		request2.approve();
		System.out.println(request2.getStatus());
		System.out.println(emp2.getLeaveBalance());
		request2.approve();
	}
}