/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A Bicycle Object
 * @author kerlin
 */
public class Bicycle
{
    private String serialNumber;
    private Brand brand;
    private boolean locked;

    /**
     * Default Bicycle
     */
    public Bicycle()
    {
        serialNumber = "N/A";
        brand = Brand.Unknown;
        locked = false;
    }

    /**
     * Full parameter Bicycle constructor
     * @param inSerialNumber String with Serial Number Data
     * @param inBrand String with Brand Data
     * @param inLocked boolean: True if bike is locked, False if bike is not locked
     */
    public Bicycle(String inSerialNumber, String inBrand, boolean inLocked)
    {
        setSerialNumber(inSerialNumber);
        setBrand(inBrand);
        locked = inLocked;
    }

    /**
     * Describes the Bicycle
     * @return a String with the Bicycle's data
     */
    @Override
    public String toString()
    {
        return "Bicycle{" + "serialNumber=" + serialNumber + ", brand=" + brand + ", locked=" + locked + '}';
    }

    /**
     * The Bicycle's serial number
     * @return a String containing the Bicycle's serial number
     */
    public String getSerialNumber()
    {
        return serialNumber;
    }

    /**
     * Change the Bicycle's serial number
     * @param inSerialNumber a String to set as the Bicycle's serial number
     */
    public void setSerialNumber(String inSerialNumber)
    {
        if ( inSerialNumber.length() > 2 && inSerialNumber.length() < 14)
            serialNumber = inSerialNumber;
        else
            System.out.println("Attempted to set serial number to something too small or too large");
    }

    /**
     * Get the type of Bicycle
     * @return a String with the brand of the Bicycle
     */
    public Brand getBrand()
    {
        return brand;
    }

    /**
     * Set the type of Bicycle
     * @param inBrand a String with the brand info for the Bicycle
     */
    public void setBrand(String inBrand)
    {
        Brand[] validBrands = Brand.values();
        boolean foundMatch = false;
        
        //Check the elements/values in the array
        for (int index = 0;  index < validBrands.length; index++)
        {
            if (inBrand.equals( validBrands[index].toString() ))
            {
                foundMatch = true; //We found a match!!!
            }
        }
        
        inBrand = inBrand.replaceAll(" ", "");//Removing Spaces!
        
        //foundMatch is true ONLY IF we found a matching enum value
        if (foundMatch)
        {
            brand = Brand.valueOf(inBrand);
        }
        else
        {
            brand = Brand.Unknown;
        }

    }

    /**
     * Check if the Bicycle is locked or not
     * @return a boolean with data on if the Bicycle is locked (true) or not (false)
     */
    public boolean isLocked()
    {
        return locked;
    }

    /**
     * Set the locked status of the Bicycle
     * @param lock a boolean which locks (true) or unlocks (false) a Bicycle
     */
    public void setLocked(boolean lock)
    {
        locked = lock;
    }
    
    
    public boolean equals(Object otherObject)
    {
        if (!(otherObject instanceof Bicycle))
        {
            return false; //Since it's not even a Bicycle!
        }
        else
        {
            if (((Bicycle) otherObject).getSerialNumber().equals(getSerialNumber()) && ((Bicycle) otherObject).getBrand().equals(getBrand()) && ((Bicycle) otherObject).isLocked() == (isLocked()))
            {
                return true;
            }
            else
            {
                return false; // At least 1 attribute is different
            }
        }
    }
    
}
