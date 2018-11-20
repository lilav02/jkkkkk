
package edu.ilstu;

/**
 * Represents a Real Estate Listing
 *
 * @author Adrian
 *
 */
public class Listing
{
	House house = new House();
	
	Lot Lot = new Lot();
	
	private String propertyId;
	private double price;
	
	//private House house;
	
	//constructor that accepts one parameter.
	public Listing(String propertyId)
	{
		this.propertyId = propertyId; 
	}
	//constructor that accepts four parameter.

	public Listing(String propertyId, double price, Lot lot, House house){
	    this.propertyId= propertyId;
	    this.price = price;
	    this.Lot = lot;
	    this.house = house;
	}
	
	public Listing() {
		// TODO Auto-generated constructor stub
	}

	//toString method
	HousingInventory test = new HousingInventory();
	public String toString() {
		return (
				getPropertyId()+"    "+getPrice()+"    "+house.getYearBuilt()+"    "+
				+house.getBedrooms()+"    "+house.getBathrooms()+"    "+Lot.getLotSizeSqFt() + "    "+Lot.getConvert()+"\n");
		
	}
	
	//getters
		/**
	 * @return the propertyId
	 */
	public String getPropertyId() {
		return propertyId;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the lot
	 */
	public Lot getLot() {
		return Lot;
	}

	/**
	 * @return the house
	 */
	public House getHouse() {
		return house;
	}

	// Equals method
	public boolean equals(Listing otherListing) {
			if(getPropertyId().equals(otherListing.propertyId)) {
				return true;
			}
			else {
			return false;
			}
		
	}

	public int getyearBuilt() {

		return  house.getYearBuilt();
	}

	

	
}
