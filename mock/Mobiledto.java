package com.program.mock;

public class Mobiledto {
	private  long mobileid;
	 private String modelname;
	 private int price;
      private String memory;
	 private String brandname;
	 private byte serialno;
	 private byte noofcamera;
	public long getMobileid() {
		return mobileid;
	}
	public void setMobileid(long mobileid) {
		this.mobileid = mobileid;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public byte getSerialno() {
		return serialno;
	}
	public void setSerialno(byte serialno) {
		this.serialno = serialno;
	}
	public byte getNoofcamera() {
		return noofcamera;
	}
	public void setNoofcamera(byte noofcamera) {
		this.noofcamera = noofcamera;
	}
}