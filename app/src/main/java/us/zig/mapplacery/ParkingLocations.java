package us.zig.mapplacery;

import java.util.ArrayList;

/**
 * Created by bziegler on 9/18/17.
 */

public class ParkingLocations {

    private ParkingLocation mParkingLocation = new ParkingLocation(40.0056380,-75.3824000, "25¢ per 30 Min 2 Hour Limit", "Parking Lot");

    public ParkingLocations()
    {

    }

    public ParkingLocation getParkingLocation()
    {
        return (mParkingLocation);
    }


}
