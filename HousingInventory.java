
package edu.ilstu;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Represents an inventory of real estate listings and the operations
 * to view, sort, and search the inventory.
 *
 * @author <  >
 *
 */
public class HousingInventory
{
	//constant for array size 
	private final static int ARRAY_SIZE = 100;
	private Listing[] inventory;
	private int size;
	/**
	 * Constructor - creates and empty inventory array of default size
	 */
	public HousingInventory()
	{
		this.inventory = new Listing[ARRAY_SIZE];
	}
	/**
	 * Constructor - creates an inventory array from an input file
	 * 
	 * @param fileInput A formated file of real estate listings
	 */
	public HousingInventory(ListingFileReader fileInput)
	{
		this();
	 	this.size = fileInput.readInventory(this.inventory);
	}
	/**
	 * @return The count of Listings that are in the housing inventory
	 * 
	 */
	public int getCount()
	{
		return this.size;
	}
	
	
	//i represents outer loop
	//listing count;
	
	public Listing[] getInventorySortedByYearBuilt() {
        // sortedListings contains Listing sorted by Year Built, and is gonna be returned by this method
        Listing[] sortedListings = Arrays.copyOfRange(inventory, 0, size);
        for(int i= 0; i <size-1;i++) {
            int min=i;
            for(int j = i +1; j<size;j++) {
                if(sortedListings[j].getyearBuilt() <sortedListings[min].getyearBuilt()) {
                    min=j;
                }
            }
             Listing temp =sortedListings[min];
            sortedListings[min]=sortedListings[i];
            sortedListings[i] = temp;
        }
        return sortedListings;
}
	//minBedrooms - The minimum number of bedrooms desired for a listing

	public Listing[] getInventoryByBedrooms(int minBedrooms) {
		
		int i=0;
		int j=0;
		int x=0;
		while(i < size) {
		    if(inventory[i].getHouse().bedrooms > minBedrooms) {
		        j++;
		}
		i++;
		}
		Listing[] sorted = new Listing[j];
		i = 0;
		while(i < size) {
		    if(inventory[i].getHouse().bedrooms >= minBedrooms)  {
		        sorted[x] = inventory[i];
		    x++; 
		}
		    i++;
		}
		return sorted;
		
		}


	public static int getArraySize() {
		return ARRAY_SIZE;
	}
	public Listing[] getInventory() {
		return inventory;
	}
	public int getSize() {
		return size;
	}
	public void setInventory(Listing[] inventory) {
		this.inventory = inventory;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	
	

	}

