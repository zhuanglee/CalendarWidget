package cn.benguo.calendar.utils;

import android.content.Context;

/**
 * Created by pyt on 2016/10/8 0008.
 */

public class DensityUtils {

    public static int dipToSp(Context context, float f) {
        return (int) ((context.getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    public static int spToDip(Context context, float f) {
        return (int) ((context.getResources().getDisplayMetrics().scaledDensity * f) + 0.5f);
    }


}
