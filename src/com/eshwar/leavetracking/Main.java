package com.eshwar.leavetracking;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		Employee emp = new Employee("E101", "Eshwar", "eshwar@example.com", 27);

		LeaveRequest request = new LeaveRequest("LR001", emp, 3, "Family function");

//		System.out.println("Employee 1: LeaveBalanace before appling to leave = "+emp.getLeaveBalance()); // 20
//
//		request.approve();
//		System.out.println("Employee 1:Request status is "+request.getStatus()); // APPROVED
//		System.out.println("Employee 1: LeaveBalanace after appling to leave = "+emp.getLeaveBalance()); // 17
//
		Employee emp2 = new Employee("E102", "Jason", "lason@id.com", 2);
		LeaveRequest request2 = new LeaveRequest("LR002", emp2, 1, "To Play GTA 6");

//		System.out.println("Employee 2: LeaveBalanace before appling to leave = "+emp2.getLeaveBalance());
//		try {
//			request2.approve();
//        }catch (Exception e){
//			System.out.println(e.getMessage());
//		}
//		System.out.println("Employee 2:Request status is "+request2.getStatus());
//		System.out.println("Employee 2: LeaveBalanace after appling to leave = "+emp2.getLeaveBalance());
//		try {
//			request2.approve();
//		}catch (Exception e){
//			System.out.println(e.getMessage());
//		}

		Employee emp3 = new Employee("E103", "Lucia", "kucia@id.com", 9);
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(emp);
		employees.add(emp2);
		employees.add(emp3);

		System.out.println(employees.size());
		for(Employee e:employees){
			System.out.println(e.getEid());
			System.out.println(e.getName());
			System.out.println(e.getLeaveBalance());
			System.out.println();
		}
		Employee e = employees.get(1);
		System.out.println(e.getEid());
		System.out.println(e.getName());
		System.out.println(e.getLeaveBalance());

		String id = "E101";
		boolean found = false;
		for(Employee ee:employees){
			if(ee.getEid().equals(id)){
				found = true;
			}
		}
		if(found){
			System.out.println("Employee found");
		}else {
			System.out.println("Employee not found");
		}
	}
}