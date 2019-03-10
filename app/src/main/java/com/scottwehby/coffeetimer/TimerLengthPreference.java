package com.scottwehby.coffeetimer;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;

public class TimerLengthPreference extends DialogPreference {

    private int time = 0;

    public TimerLengthPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TimerLengthPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected Object onGetDefaultValue(TypedArray a, int index) {
        return a.getInt(index, 0);
    }

    @Override
    protected void onSetInitialValue(@Nullable Object defaultValue) {
        if (shouldPersist()) {
            time = getPersistedInt(time);
        }
        setDefaultValue(shouldPersist() ? getPersistedInt(time) : (int) defaultValue);
    }

    @Override
    public int getDialogLayoutResource() {
        return R.layout.timer_length_preference;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
        persistInt(time);
        SharedPreferences sharedPreferences = getSharedPreferences();
        Log.d("coffeetime", "key: " + sharedPreferences.getAll().keySet().toString());
    }

}
