package com.example.ice.coursetable.botsdk;

import android.content.Context;

public class ContextUtil {

    private static Context mContext;

    public static void setContext(Context context) {
        mContext = context;
    }

    public static Context getContext() {
        return mContext;
    }
}
