/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This code tests Auto (and eventually you should test Bicycle and ParkingSpace)
 * @author kerlin
 */
public class Driver
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
//        //Create variables for Auto attributes
//        String color = "Red";
//        String plate = "123 ABC";
//        boolean permitStatus = true;
//
//        //Create an Auto Object
//        Auto myAuto = new Auto(plate, color, permitStatus);
//
//        //Test Gets
//        System.out.println("Auto color was set to: " + color);
//        System.out.println("The color stored in/by the Auto is: " + myAuto.getColor());
//
//        System.out.println("Auto plate was set to: " + plate);
//        System.out.println("The plate info stored in/by the Auto is: " + myAuto.getPlate());
//
//        System.out.println("Auto permit status was set to: " + permitStatus);
//        System.out.println("The permit status stored in/by the Auto is: " + myAuto.isHasPermit());
//
//
//        //Create variables for Bicycle attributes
//        String serial = "BMX123";
//        String brand = "Schwinn";
//        boolean lockStatus = true;
//
//        //Create an Bicycle Object
//        Bicycle myBicycle = new Bicycle(serial, brand, lockStatus);
//
//        //Test Gets
//        System.out.println("Bicycle serial number was set to: " + serial);
//        System.out.println("The serial stored in/by the Bicycle is: " + myBicycle.getSerialNumber());
//
//        System.out.println("Bicycle brand was set to: " + brand);
//        System.out.println("The brand info stored in/by the Bicycle is: " + myBicycle.getBrand());
//
//        System.out.println("Bicycle lock status was set to: " + lockStatus);
//        System.out.println("The lock status stored in/by the Bicycle is: " + myBicycle.isLocked());
//
//
//        //Create variables for ParkingSpace attributes
//        String vehicleType = "Auto";
//        boolean occupied = false;
//        int number = 24;
//
//        //Create an ParkingSpace Object
//        ParkingSpace myParkingSpace = new ParkingSpace(occupied, number, vehicleType);
//
//        //Test Gets
//        System.out.println("This Parking Space should hold: " + vehicleType + " objects.");
//        System.out.println("The Parking Space holds: " + myParkingSpace.getType());
//
//        System.out.println("This Parking Space should be occupied: " + occupied);
//        System.out.println("The Parking Space is: " + myParkingSpace.isOccupied());
//
//        System.out.println("This Parking Space should be number: " + number);
//        System.out.println("The Parking Space number is: " + myParkingSpace.getNumber());

        // TODO code application logic here
        ParkingLot newParkingLot = new ParkingLot(5,3);


        for (int i=0; i<4; i++){
            String color = "Red";
            String plate = "123 ABC";
            boolean permitStatus = true;

            Auto myAuto = new Auto(plate, color, permitStatus);
            newParkingLot.park(myAuto);
        }


        for (int i=0; i<3; i++){
            String color = "Blue";
            String plate = "123 ABC";
            boolean permitStatus = true;

            Bicycle myBike = new Bicycle("123adsf", "Schwinn", true);
            newParkingLot.park(myBike);
        }


        String color = "Black";
        String plate = "666 BMW";
        boolean permitStatus = true;
        Auto newAuto = new Auto(plate,color,permitStatus);
        newParkingLot.park(newAuto);

        Object parkedVehicle = newParkingLot.find("666 BMW");
        System.out.println("parked vehicle is " + parkedVehicle);

//        String vehicleType = "Auto";
//        boolean occupied = false;
//        int number = 24;





//        System.out.println(myAuto);
//
//        ParkingSpace newPS = new ParkingSpace(false, 0, "Auto");
//        System.out.println("before parking" + newPS);
//
//        newPS.parkAuto(myAuto);
//
//        System.out.println("after parking" +newPS);
//
//        Object somecar = newPS.unpark();
//        System.out.println("The parked car is "+ somecar);




        //newParkingLot.park(myAuto);

        System.out.println(newParkingLot);


}
    
}
