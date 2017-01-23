package us.zig.mapplacery;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering;

/**
 * Created by bugzigus on 1/23/2017.
 */

public class MyItem implements ClusterItem {

    private final LatLng mPosition;

    public MyItem(double lat, double lng) {
        mPosition = new LatLng(lat, lng);
    }

    @Override
    public LatLng getPosition() {
        return mPosition;
    }
}
