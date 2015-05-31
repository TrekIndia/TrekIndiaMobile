package trekindiamobile.trekindia.common;
/**
 * Created by rajesh on 26/5/15.
 */
import android.graphics.Bitmap;
import android.net.Uri;

import com.google.android.gms.maps.model.LatLng;

/**
 * A simple shared tourist attraction class to easily pass data around. Used
 * in both the mobile app and wearable app.
 */
public class Attraction {
    public String name;
    public String description;
    public String longDescription;
    public Uri imageUrl;
    public Uri secondaryImageUrl;
    public LatLng location;
    public String city;

    public Bitmap image;
    public Bitmap secondaryImage;
    public String distance;

    public Attraction() {}

    public Attraction(String name, String description, String longDescription, Uri imageUrl,
                      Uri secondaryImageUrl, LatLng location, String city) {
        this.name = name;
        this.description = description;
        this.longDescription = longDescription;
        this.imageUrl = imageUrl;
        this.secondaryImageUrl = secondaryImageUrl;
        this.location = location;
        this.city = city;
    }
}