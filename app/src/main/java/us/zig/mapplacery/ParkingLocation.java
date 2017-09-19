package us.zig.mapplacery;
import java.lang.String;
/**
 * Created by bziegler on 9/18/17.
 */

public class ParkingLocation {
    private double mLongitude;
    private double mLatitude;
    private String mPrice;
    private String mName;

    public ParkingLocation() {

    }


    public ParkingLocation(double longtitude, double latitude, String price, String name)
    {
        mLatitude = latitude;
        mLongitude = longtitude;
        mPrice = price;
        mName = name;

    }

    public double getmLongitude()
    {
        return(mLongitude);
    }

    public double getmLatitude()
    {
        return(mLatitude);
    }
    public String getmPrice()
    {
        return(mPrice);
    }
    public String getmName()
    {
        return(mName);
    }
}
