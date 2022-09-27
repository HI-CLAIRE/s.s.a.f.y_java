package com.ssafy.phone.model.dto;

public class Phone {
	private String serialNum;
	private String modelName;
	private Short yearOfManufacture;
	private int viewCnt;
	private int price;
	private int manufacturerCode;
	private String companyName;

	public Phone() {
	}

	public Phone(String serialNum, String modelName, Short yearOfManufacture, int price, int manufacturerCode) {
		this.serialNum = serialNum;
		this.modelName = modelName;
		this.yearOfManufacture = yearOfManufacture;
		this.price = price;
		this.manufacturerCode = manufacturerCode;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Short getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(Short yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getManufacturerCode() {
		return manufacturerCode;
	}

	public void setManufacturerCode(int manufacturerCode) {
		this.manufacturerCode = manufacturerCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Notebook [serialNum=" + serialNum + ", modelName=" + modelName + ", yearOfManufacture="
				+ yearOfManufacture + ", viewCnt=" + viewCnt + ", price=" + price + ", manufacturerCode="
				+ manufacturerCode + ", companyName=" + companyName + "]";
	}

}
