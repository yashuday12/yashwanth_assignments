package com.flight;

public class Flight {
	private int fid;
	private String fname;
	private Double fprice;
	public Flight() {
			super();
}
	
	public Flight(int fid, String fname, Double fprice) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fprice = fprice;
	}
	

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Double getFprice() {
		return fprice;
	}

	public void setFprice(Double fprice) {
		this.fprice = fprice;
	}

	@Override
	public String toString() {
		return "Flight [fid=" + fid + ", fname=" + fname + ", fprice=" + fprice + "]";
	}
	
}