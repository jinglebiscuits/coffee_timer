package com.scottwehby.coffeetimer;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceDialogFragmentCompat;

public class TimePickerDialog extends PreferenceDialogFragmentCompat {

    private int minutes;
    private int seconds;

//    protected TimePickerDialog(@NonNull Context context, int minutes, int seconds) {
//        super(context);
//        this.minutes = minutes;
//        this.seconds = seconds;
//
//        setDialogLayoutResource(R.layout.timer_length_preference);
//    }
//
//    public TimePickerDialog(Context context, AttributeSet attrs) {
//        super(context, attrs);
////        setDialogLayoutResource(R.layout.timer_length_preference);
//    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }

    @Override
    public void onDialogClosed(boolean positiveResult) {

    }

    @Override
    protected void onBindDialogView(View view) {
        super.onBindDialogView(view);
    }


}
