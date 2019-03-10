package com.scottwehby.coffeetimer;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceDialogFragmentCompat;

public class TimePickerDialog extends PreferenceDialogFragmentCompat {

    private EditText minuteDigit, secondDigit;
    private int minutes;
    private int seconds;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }

    @Override
    public void onDialogClosed(boolean positiveResult) {
        if (!minuteDigit.getText().toString().isEmpty()) {
            minutes = Integer.valueOf(minuteDigit.getText().toString());
        }
        if (!secondDigit.getText().toString().isEmpty()) {
            seconds = Integer.valueOf(secondDigit.getText().toString());
        }
        DialogPreference dialogPreference = getPreference();
        if (dialogPreference instanceof TimerLengthPreference) {
            if (positiveResult) {
                ((TimerLengthPreference)dialogPreference).setTime(minutes * 60 + seconds);
            }
        }
    }

    @Override
    protected void onBindDialogView(View view) {
        super.onBindDialogView(view);
        DialogPreference dialogPreference = getPreference();
        if (dialogPreference instanceof TimerLengthPreference) {
            int time = ((TimerLengthPreference)dialogPreference).getTime();
            minuteDigit = view.findViewById(R.id.minute_digit);
            secondDigit = view.findViewById(R.id.second_digit);
            minuteDigit.setText(String.valueOf(time / 60));
            secondDigit.setText(String.valueOf(time % 60));
        }
    }
}
