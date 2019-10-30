package co.com.k4soft.gps.geographic;

import android.app.Activity;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/**
 * Created by diegogarcia on 24/01/18.
 */

public class GeographicLocationListener implements LocationListener {

    private Activity activity;
    private DelegateLocation delegateLocation;


    public GeographicLocationListener(Activity activity) {
        this.activity = activity;
        delegateLocation = new DelegateLocation(activity);
    }


    @Override
    public void onLocationChanged(Location location) {
        delegateLocation.setLocator(location);
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {


    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }


}
