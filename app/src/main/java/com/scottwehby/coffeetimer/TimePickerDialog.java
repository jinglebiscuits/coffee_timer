package com.scottwehby.coffeetimer;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

public class TimePickerDialog extends AlertDialog {

    private int minutes;
    private int seconds;

    protected TimePickerDialog(@NonNull Context context, int minutes, int seconds) {
        super(context);
        this.minutes = minutes;
        this.seconds = seconds;

        setView(View.inflate(context, R.layout.timer_length_preference, null));
    }


}
