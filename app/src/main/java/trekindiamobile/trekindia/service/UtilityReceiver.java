package trekindiamobile.trekindia.service;

/**
 * Created by rajesh on 26/5/15.
 */
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

/**
 * A simply utility receiver used to ensure the device stays awake for the
 * duration of the work being done by
 * {@link trekindiamobile.trekindia.service.UtilityService}.
 */
public class UtilityReceiver extends WakefulBroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // Pass right over to UtilityService class, the wakeful receiver is
        // just needed in case the geofence is triggered while the device
        // is asleep otherwise the service may not have time to trigger the
        // notification.
        intent.setClass(context, UtilityService.class);
        intent.setAction(UtilityService.ACTION_GEOFENCE_TRIGGERED);
        startWakefulService(context, intent);
    }

}
