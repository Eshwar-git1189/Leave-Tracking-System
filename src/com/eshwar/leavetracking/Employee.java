package com.eshwar.leavetracking;

public class Employee {
	private String name;
	private String eid;
	private String email;
	private int leaveBalance;

	public Employee(String eid, String name, String email, int leaveBalance) {
		if (leaveBalance < 0) {
			throw new IllegalArgumentException("Negative leave!!");
		}
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.leaveBalance = leaveBalance;
	}

	public String getName() {
		return name;
	}

	public String getEid() {
		return eid;
	}

	public String getEmail() {
		return email;
	}

	public int getLeaveBalance() {
		return leaveBalance;
	}
	
	public void applyLeave(int days) {
		if(this.leaveBalance == 0) {
			throw new IllegalArgumentException("No leaves remaining");
		}
		if(days>leaveBalance) {
			throw new IllegalArgumentException("You cannot get more leave than y0ur balance leaves");
		}
		if(days<=0) {
			throw new IllegalArgumentException("You cannot ask such leaves");
		}
		leaveBalance-=days;
	}

}
