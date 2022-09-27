package com.ssafy.phone.model.dto;

public class Manufacturer {
	private int code;
	private String companyName;
	private String nation;

	public Manufacturer() {
	}
	
	public Manufacturer(int code, String companyName, String nation) {
		this.code = code;
		this.companyName = companyName;
		this.nation = nation;
	}

	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	@Override
	public String toString() {
		return "Manufacturer [code=" + code + ", companyName=" + companyName + ", nation=" + nation + "]";
	}
	
	
	
}