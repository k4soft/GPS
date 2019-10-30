package co.com.k4soft.gps.geographic;

import android.app.Activity;
import android.location.Location;
import co.com.k4soft.gps.MainActivity;

/**
 * Created by diegogarcia on 25/01/18.
 */

class DelegateLocation {

    private Activity activity;
    private boolean hidePopup;


    public DelegateLocation(Activity activity) {
        this.activity = activity;
        hidePopup = true;
    }

    public void setLocator(Location location) {

        String latitud = location.getLatitude() + "";
        String longitud = location.getLongitude() + "";


        if (activity instanceof MainActivity) {
            ((MainActivity) activity).getTxtLatitud().setText(latitud);
            ((MainActivity) activity).getTxtLongitud().setText(longitud);
        }



    }



}
