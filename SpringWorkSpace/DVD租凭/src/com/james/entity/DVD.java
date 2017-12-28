package com.james.entity;

import java.util.Date;

public class DVD {

	private Integer id;
	private String name;
	private int lendCount;
	private Date lendDate;
	private String status;

	public DVD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DVD(Integer id, String name, int lendCount, Date lendDate, String status) {
		super();
		this.id = id;
		this.name = name;
		this.lendCount = lendCount;
		this.lendDate = lendDate;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLendCount() {
		return lendCount;
	}

	public void setLendCount(int lendCount) {
		this.lendCount = lendCount;
	}

	public Date getLendDate() {
		return lendDate;
	}

	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "DVD [id=" + id + ", name=" + name + ", lendCount=" + lendCount + ", lendDate=" + lendDate + ", status="
				+ status + "]";
	}

}
