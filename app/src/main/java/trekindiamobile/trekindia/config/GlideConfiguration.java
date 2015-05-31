package trekindiamobile.trekindia.config;

/**
 * Created by rajesh on 25/5/15.
 */
import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.module.GlideModule;

/**
 * This allows global overriding of some default Glide configuration values.
 * For additional information see the Glide docs:
 * https://github.com/bumptech/glide/wiki/Configuration
 */
public class GlideConfiguration implements GlideModule {
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        // Set Glide decode format to the higher quality ARGB_8888 format
        builder.setDecodeFormat(DecodeFormat.PREFER_ARGB_8888);
    }

    @Override
    public void registerComponents(Context context, Glide glide) {

    }
}
