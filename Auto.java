/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * An Automobile
 * @author kerlin
 */
public class Auto
{


    private String plate;
    private Color color;
    private boolean hasPermit;

    /**
     * Default Auto
     */
    public Auto()
    {
        plate = "N/A";
        color = Color.Unknown;
        hasPermit = false;
        
    }

    /**
     * Full parameter Constructor
     * @param inPlate String with Plate Data
     * @param inColor String with Color Data
     * @param inHasPermit boolean: True for has permit, False for not having permit
     */
    public Auto(String inPlate, String inColor, boolean inHasPermit)
    {
        setPlate(inPlate);
        setColor(inColor);
        hasPermit = inHasPermit;
    }

    /**
     * Describes the Auto
     * @return a String with the Auto's data
     */
    @Override
    public String toString()
    {
        return "Auto{" + "plate=" + plate + ", color=" + color + ", hasPermit=" + hasPermit + '}';
    }
    
    
    /**
     * Get the Auto's license plate data
     * @return a String with License Plate data
     */
    public String getPlate()
    {
        return plate;
    }

    /**
     * Set the Auto's license plate data
     * @param inPlate a String to use for the Auto's License Plate data
     */
    public void setPlate(String inPlate)
    {
        if (inPlate.length() > 0 && inPlate.length() < 9)
            plate = inPlate;
        else
            System.out.println("Attempted to set plate to a String too long or too short!");
    }

    /**
     * Get the color of the Auto
     * @return a String containing the color information for the Auto
     */
    public Color getColor()
    {
        return color;
    }

    /**
     * Set the color of the Auto
     * @param inColor a String denoting the color of the Auto
     */
    public void setColor(String inColor)
    {
        Color[] validColors = Color.values();
        boolean foundMatch = false;
        
        //Check the elements/values in the array
        for (int index = 0;  index < validColors.length; index++)
        {
            if (inColor.equals( validColors[index].toString() ))
            {
                foundMatch = true; //We found a match!!!
            }
        }
        
        inColor = inColor.replaceAll(" ", "");//Removing Spaces!
        
        //foundMatch is true ONLY IF we found a matching enum value
        if (foundMatch)
        {
            color = Color.valueOf(inColor);
        }
        else
        {
            color = Color.Unknown;
        }

    }

    /**
     * Check if the Auto has a permit
     * @return a true if Auto has a permit and a false if Auto does NOT have a permit
     */
    public boolean isHasPermit()
    {
        return hasPermit;
    }

    /**
     * Sets the Auto's Permit status
     * @param inPermit a boolean denoting if the Auto should (true) or should not (false) have a permit
     */
    public void setHasPermit(boolean inPermit)
    {
        hasPermit = inPermit;
    }
    
    public boolean equals(Object otherObject)
    {

//Check if the other object is even an Auto
        if (!(otherObject instanceof Auto))
        {
            return false; //Since it's not even a Auto!
        }
        else
        {
// Your logic for figuring out if the objects should match goes here!
            if (((Auto) otherObject).getPlate().equals(getPlate()) && ((Auto) otherObject).getColor().equals(getColor()) && ((Auto) otherObject).isHasPermit() == (isHasPermit()))
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
