package com.ssafy.board.model.dto;


public class Board {
	// 차대번호, 모델명, 출시연도, 조회수, 제조사
	private String vin;
	private String modelname;
	private int yearOfManufacture;
	private int viewCnt;
	private String manufacturer;
	public Board() {
		super();
	}
	public Board(String vin, String modelname, int yearOfManufacture, int viewCnt, String manufacturer) {
		super();
		this.vin = vin;
		this.modelname = modelname;
		this.yearOfManufacture = yearOfManufacture;
		this.viewCnt = viewCnt;
		this.manufacturer = manufacturer;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "Board [vin=" + vin + ", modelname=" + modelname + ", yearOfManufacture=" + yearOfManufacture
				+ ", viewCnt=" + viewCnt + ", manufacturer=" + manufacturer + "]";
	}
	
	

}