package us.zig.mapplacery;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

/**
 * Created by Dad on 2/12/2017.
 */

public class MapItem implements ClusterItem {
    private final LatLng mPosition;
    private String mTitle="unknown";
    private String mSnippet="unknown";

    public MapItem(double lat, double lng) {
        mPosition = new LatLng(lat, lng);
    }

    public MapItem(double lat, double lng, String title, String snippet) {
        mPosition = new LatLng(lat, lng);
        mTitle = title;
        mSnippet = snippet;
    }

    @Override
    public LatLng getPosition() {
        return mPosition;
    }


    public String getTitle() {
        return mTitle;
    }


    public String getSnippet() {
        return mSnippet;
    }
}
