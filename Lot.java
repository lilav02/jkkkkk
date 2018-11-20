/**
 * 
 */
package edu.ilstu;

/**
 * @author Adrian 
 *
 */
public class Lot {


	//There are 43,560 square feet in 1 acre.
	//Constant Value that 1 acre equals 43560 square feet.
	private static final double FEET_TO_ACRES=1/43560;
	
	//Instance variables 
	private String street;
	private String city;
	private String state;
	private String zipcode;
	private int lotSizeSqFt;
	

	private double convert=(lotSizeSqFt*FEET_TO_ACRES);
	;
	//lot two different constructors
	public Lot() {
		this.street="";
		this.city="";
		this.street = "";
		this.city = "";
		this.state = "";
		this.zipcode = "";
		this.lotSizeSqFt = 0;
	
	}
	
	//constructor for instance variables 
	public Lot(String street,String city, String state, String zipcode,int lotSizeSqFt){
		this.street=street;
		this.city=city;
		this.state=state;
		this.zipcode=zipcode;
		this.lotSizeSqFt=lotSizeSqFt;
		
	}
	
	//getters for instance variables that I need.

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param lotSizeSqFt the lotSizeSqFt to set
	 */
	public void setLotSizeSqFt(int lotSizeSqFt) {
		this.lotSizeSqFt = lotSizeSqFt;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @return the lotSizeSqFt
	 */
	public int getLotSizeSqFt() {
		return lotSizeSqFt;
	}

	//toString method that will print the info for the address and acreage.
	
	public static double getFeetToAcres() {
		return FEET_TO_ACRES;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	//public String toString() {
	//	return "Street: "+getStreet() +"\nCity/State/Zip: "+getCity()+"  "+getState()+"  "+getZipcode()
	//	+"\nAcreage: "+ getConvert();
		//	}

	/**
	 * @return the convert
	 */
	public double getConvert() {
		return convert;
	}
	
	
}
