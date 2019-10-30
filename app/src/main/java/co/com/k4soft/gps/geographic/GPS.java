package co.com.k4soft.gps.geographic;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationManager;

import androidx.core.app.ActivityCompat;


/**
 * Created by diegogarcia on 25/01/18.
 */

public class GPS {
    Activity activity;
    GeographicLocationListener mlocListener;


    public GPS(Activity activity) {
        this.activity = activity;
        mlocListener = new GeographicLocationListener(activity);
        enableGPS();
    }


    public boolean isEnable(String latitud, String longitud) {
        enableGPS();
        boolean isLatitudValid = latitud != null && !"0".equals(latitud) && !"".equals(latitud);
        boolean isLongitudValid = longitud != null && !"0".equals(longitud) && !"".equals(longitud);
        return isLatitudValid && isLongitudValid;
    }

    private void enableGPS() {
        LocationManager mlocManager = (LocationManager) activity.getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            //aplica para versiones 6.0 o superior
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 225);

        } else {
            mlocManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, mlocListener);
        }
    }

    //https://stackoverflow.com/questions/3145089/what-is-the-simplest-and-most-robust-way-to-get-the-users-current-location-on-a/3145655#3145655
}
