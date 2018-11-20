
package edu.ilstu;

/**
 * @author 
 *
 */
public class House {

	/**
	 * private instance variables used for house class
	 *
	 */
	//instance variables 
	private String architecture;
	private String exteriorMaterial;
	private int finishedSqFt;
	private int numRooms;
	int bedrooms;
	private double bathrooms;
	private String parkingType;
	private int coveredParkingSpaces;
	private int yearBuilt;
	
	//constructor 
	public House(int yearBuilt,int bedrooms,double bathrooms) {
		
		this.yearBuilt=yearBuilt;
		this.bedrooms=bedrooms;
		this.bathrooms=bathrooms;
		
		
	}


	public House() {
		// TODO Auto-generated constructor stub
	}
	
	//methods
	/**
	 * @return the architecture
	 */
	public String getArchitecture() {
		return architecture;
	}
	/**
	 * @return the exteriorMaterial
	 */
	public String getExteriorMaterial() {
		return exteriorMaterial;
	}
	/**
	 * @return the finishedSqFt
	 */
	public int getFinishedSqFt() {
		return finishedSqFt;
	}
	/**
	 * @return the numRooms
	 */
	public int getNumRooms() {
		return numRooms;
	}
	/**
	 * @return the bedrooms
	 */
	public int getBedrooms() {
		return bedrooms;
	}
	/**
	 * @return the bathrooms
	 */
	public double getBathrooms() {
		return bathrooms;
	}
	/**
	 * @return the parkingType
	 */
	public String getParkingType() {
		return parkingType;
	}
	/**
	 * @return the coveredParkingSpaces
	 */
	public int getCoveredParkingSpaces() {
		return coveredParkingSpaces;
	}

	public int getYearBuilt() {
		// TODO Auto-generated method stub
		return yearBuilt;
	}
	
	
	
	
	
	
	
	
	
	
}
