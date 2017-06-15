package com.android.duse.gold.introsliderexample;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Gold on 2017-06-15.
 */

public class PrefManager {

    SharedPreferences mSharedPreferences;
    SharedPreferences.Editor mEditor;
    Context mContext;

    int PRIVATE_MODE = 0;

    private static final String PREF_NAME = "android-welcome";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context) {
        this.mContext = context;
        mSharedPreferences = mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        mEditor = mSharedPreferences.edit();
    }

    public void setIsFirstTimeLaunch(boolean isFirstTimeLaunch) {
        mEditor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTimeLaunch);
        mEditor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return mSharedPreferences.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

}
