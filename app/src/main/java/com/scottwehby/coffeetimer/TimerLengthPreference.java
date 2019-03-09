package com.scottwehby.coffeetimer;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;

public class TimerLengthPreference extends DialogPreference {

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
        super.onSetInitialValue(defaultValue);
    }

    @Override
    public int getDialogLayoutResource() {
        return R.layout.timer_length_preference;
    }
}
