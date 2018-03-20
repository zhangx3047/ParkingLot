/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A Parking Space object
 * @author kerlin
 */
public class ParkingSpace
{
    public boolean occupied;
    public int number;
    public ValidParkingObject type;

    public Auto parkedAuto;
    public Bicycle parkedBike;

    public Auto getParkedAuto() {
        return parkedAuto;
    }
    public Bicycle getParkedBike() {
        return parkedBike;
}

    public Auto unparkAuto() {
        Auto temp = getParkedAuto();
        this.occupied = false;
        this.type = ValidParkingObject.Unknown;
        return temp;
    }

    public Bicycle unparkBike() {
        Bicycle temp = getParkedBike();
        this.occupied = false;
        this.type = ValidParkingObject.Unknown;
        return temp;
    }


    /**
     * Default Parking Space 
     */
    public ParkingSpace()
    {
        occupied = false;
        number = -13;
        type = ValidParkingObject.Unknown;
    }

    /**
     * Full parameter ParkingSpace constructor
     * @param inOccupied boolean: True if occupied, False if not occupied
     * @param inNumber int with the Parking Space's number
     * @param inType String noting the type of object which can park in this Parking Space
     */
    public ParkingSpace(boolean inOccupied, int inNumber, String inType)
    {
        occupied = inOccupied;
        number = inNumber;
        setType(inType);
    }



//    public void parkAuto(Auto auto) {
//        parked = auto;
//    }
//
//    public void parkBicycle(Bicycle bicycle) {
//        parked = bicycle;
//    }
//
//    public boolean isParked(Object object) {
//        return object == parked;
//    }

    /**
     * Describes the Parking Space
     * @return a String with the Parking Space's data
     */
    @Override
    public String toString()
    {
        return "ParkingSpace{" + "occupied=" + occupied + ", number=" + number + ", type=" + type + '}';
    }

    /**
     * Try to park an Auto in this Parking Space
     * @param inAuto the Auto try to park here
     * @return a boolean noting if the Auto was able to park (true) or not (false)
     */
    public boolean parkAuto(Auto inAuto)
    {
        boolean answer =false;
        if (isOccupied())
        {
            return answer;
        }
        else if (getType().equals(ValidParkingObject.Auto))
        {
            occupied = true;
            parkedAuto = inAuto;
            System.out.println(parkedAuto);
            answer = true;
        }
        return true;
    }
    
    /**
     * Try to park a Bicycle in this Parking Space
     * @param inBike the Bicycle to try parking here
     * @return a boolean noting if the Bicycle was able to park (true) or not (false)
     */
    public boolean parkBicycle (Bicycle inBike)
    {
        boolean answer =false;
        if (isOccupied())
        {
            return answer;
        }
        else if (getType().equals(ValidParkingObject.Bicycle))
        {
            occupied = true;
            parkedBike = inBike;
            answer = true;
        }
        return true;
    }

    /**
     * Check if the Parking Space is occupied or not
     * @return a boolean which is true if the Parking Space is in use and false if the Parking Space is not in use
     */
    public boolean isOccupied()
    {
        return occupied;
    }

    /**
     * Get the ParkingSpace number
     * @return an int with the ParkingSpace's number
     */
    public int getNumber()
    {
        return number;
    }

    /**
     * Get the type of ParkingSpace
     * @return a String denoting what type of Object is allowed to park in this ParkingSpace
     */
    public ValidParkingObject getType()
    {
        return type;
    }

    /**
     * Set the type of Parking Space
     * @param inType a String to note what type of Object is allowed to park in this Parking Space
     */
    public void setType(String inType)
    {

        ValidParkingObject[] validTypes = ValidParkingObject.values();
        boolean foundMatch = false;

        //Check the elements/values in the array
        for (int index = 0;  index < validTypes.length; index++)
        {
            if (inType.equals( validTypes[index].toString() ))
            {
                foundMatch = true; //We found a match!!!
            }
        }

        inType = inType.replaceAll(" ", "");//Removing Spaces!

        //foundMatch is true ONLY IF we found a matching enum value
        if (foundMatch)
        {
            type = ValidParkingObject.valueOf(inType);
        }
        else
        {
            type = ValidParkingObject.Unknown;
        }

    }

    public boolean equals(Object otherObject)
    {
        if (!(otherObject instanceof ParkingSpace))
        {
            return false; //Since it's not even a ParkingSpace!
        }
        else
        {
            if (((ParkingSpace) otherObject).getNumber() == (getNumber()) && ((ParkingSpace) otherObject).getType().equals(getType()) && ((ParkingSpace) otherObject).isOccupied() == (isOccupied()))
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
