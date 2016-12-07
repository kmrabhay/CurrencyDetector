package Common;

/**
 * Created by Abhay on 03-12-2016.
 */

import android.os.Build;

public class Helper {

    public static boolean isAndroidM() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.M;
    }
}
