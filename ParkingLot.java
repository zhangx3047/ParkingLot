public class ParkingLot {

    private ParkingSpace [] spaces;

    private int autoCount = 0, bicycleCount = 0, autoMax, bicycleMax;

    //private double percentage = (double)((autoCount+bicycleCount)/spaces.length);


    public double getAutoCount() {
        return (double)autoCount;
    }

    public double getBicycleCount() {
        return (double)bicycleCount;
    }


    public double percentageFull(){

        return ((getAutoCount() + getBicycleCount())/(double)spaces.length);

    }

    public ParkingLot(int auto, int bi) {
        spaces = new ParkingSpace[auto+bi];
        for (int i=0; i< auto; i++) {
            spaces[i] = new ParkingSpace(false, i, "Auto" );
        }
        for (int i=auto; i< auto+bi; i++) {
            spaces[i] = new ParkingSpace(false, i, "Bicycle" );
        }

        autoMax = auto;
        bicycleMax = bi;
        //bicycleCount = autoMax;
    }


    public boolean park (Auto auto) {
        if (autoCount >= autoMax) {
            return false;
        }
        //space[autoCount]
        //System.out.println(spaces[autoCount]);
        spaces[autoCount].parkAuto(auto);
        autoCount++;

        return true;
    }

    public boolean park(Bicycle bicycle) {
        if (bicycleCount >= bicycleMax) {
            return false;
        }
        spaces[bicycleCount+autoMax].parkBicycle(bicycle);
        bicycleCount++;
        return true;
    }

    public Object find(String id) {
        Object parked = null;
        for (ParkingSpace entry : spaces) {
            if (entry.getType() == ValidParkingObject.Auto && entry.occupied == true) {
                Auto parkedAuto = entry.getParkedAuto();
                if (parkedAuto.getPlate().equals(id)) {
                     parked = entry.unparkAuto();
                     autoCount--;
                }
            } else if (entry.getType() == ValidParkingObject.Bicycle && entry.occupied == true) {
                Bicycle parkedBike = entry.getParkedBike();
                if (parkedBike.getSerialNumber().equals(id)) {
                     parked =  entry.unparkBike();
                     bicycleCount--;
                }
            }
        }
        return parked;
    }

    @Override
    public String toString() {
        return String.format("There are %d total parking spaces and it's %.2f%% full", spaces.length, percentageFull()*100.0);
    }
}