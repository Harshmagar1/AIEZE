package com.igr.bean;

public class Location {
	
	public int index;
	public String locName;
	private int locId;
	private int locDist;
	private double locTime;
	public Location(int index, String locName, int locId, int locDist, double locTime) {
		super();
		this.index = index;
		this.locName = locName;
		this.locId = locId;
		this.locDist = locDist;
		this.locTime = locTime;
	}
	public Location() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Location [index=" + index + ", locName=" + locName + ", locId=" + locId + ", locDist=" + locDist
				+ ", locTime=" + locTime + "]";
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getLocName() {
		return locName;
	}
	public void setLocName(String locName) {
		this.locName = locName;
	}
	public int getLocId() {
		return locId;
	}
	public void setLocId(int locId) {
		this.locId = locId;
	}
	public int getLocDist() {
		return locDist;
	}
	public void setLocDist(int locDist) {
		this.locDist = locDist;
	}
	public double getLocTime() {
		return locTime;
	}
	public void setLocTime(double locTime) {
		this.locTime = locTime;
	}
	
	

}
