package com.qa.resource;

public enum APIResources {
	
	//collections of constants and methods 
	
	AddPlaceAPI("maps/api/place/add/json"), 
	DeletePlaceAPI("maps/api/place/Delete/json");
	
	private String resource;
	
	 APIResources(String resource ) {
		this.resource=resource;
		
	}
	 
	 public String getResource() {
		 return resource;
	 }
}
