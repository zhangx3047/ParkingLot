
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kerlin
 */
public enum ValidParkingObject
{
    Unknown, Auto, Bicycle;
    
    public static ValidParkingObject randomValidParkingObject()
    {
        ValidParkingObject[] myValidParkingObjects = ValidParkingObject.values();
        Random gen = new Random();
        int index = gen.nextInt((myValidParkingObjects.length -1)) + 1;
        return myValidParkingObjects[index];
    }
    
    public String toString()
    {
        String base = super.toString();
        String output = "";
        boolean firstChar = true;
        for (int index = 0; index < base.length(); index++)
        {
            //Check for uppercase
            if (Character.isUpperCase( base.charAt(index) ) && !firstChar)
            {
                output = output + " ";
            }
            output = output + base.charAt(index);
            firstChar = false;
        }
        return output;
        
    }
}
