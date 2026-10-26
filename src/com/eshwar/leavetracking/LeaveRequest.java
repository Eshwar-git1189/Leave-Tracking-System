package com.eshwar.leavetracking;

public class LeaveRequest {
	private String reqId;
	private Employee employee;
	private int days;
	private String reason;
	private String status; // Pending, Approved, Rejected

	public LeaveRequest(String reqId, Employee employee, int days, String reason) {
		if (reqId == null || reqId.isBlank()) {
			throw new IllegalArgumentException("Request ID is required");
		}

		if (employee == null) {
			throw new IllegalArgumentException("Employee is required");
		}

		if (days <= 0) {
			throw new IllegalArgumentException("Days must be positive");
		}

		if (reason == null || reason.isBlank()) {
			throw new IllegalArgumentException("Reason is required");
		}
		this.reqId = reqId;
		this.employee = employee;
		this.days = days;
		this.reason = reason;
		this.status = "PENDING";
	}

	public String getReqID() {
		return reqId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public int getDays() {
		return days;
	}

	public String getReason() {
		return reason;
	}

	public String getStatus() {
		return status;
	}

	public void approve() {
		if (!"PENDING".equals(status)) {
			throw new IllegalStateException("Request has already been processed");
		}
		employee.applyLeave(days);
		status = "APPROVED";
	}

	public void reject() {
		if (!"PENDING".equals(status)) {
			throw new IllegalStateException("Request has already been processed");
		}
		status = "REJECTED";
	}
}
