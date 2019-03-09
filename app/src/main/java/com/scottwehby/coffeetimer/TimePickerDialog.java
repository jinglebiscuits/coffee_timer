package com.scottwehby.coffeetimer;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.preference.PreferenceDialogFragmentCompat;

public class TimePickerDialog extends PreferenceDialogFragmentCompat {

    private EditText minuteDigit1, minuteDigit2, secondDigit1, secondDigit2;
    private int minutes;
    private int seconds;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }

    @Override
    public void onDialogClosed(boolean positiveResult) {
        Log.d("CoffeeTime", "jedi");
        minutes = Integer.valueOf(minuteDigit2.getText().toString() + minuteDigit1.getText().toString());
        seconds = Integer.valueOf(secondDigit2.getText().toString() + secondDigit1.getText().toString());
        Log.d("CoffeeTime", "Coffee Time is set to " + minutes + ":" + seconds);
    }

    @Override
    protected void onBindDialogView(View view) {
        super.onBindDialogView(view);
        minuteDigit1 = view.findViewById(R.id.minute_digit_1);
        minuteDigit2 = view.findViewById(R.id.minute_digit_2);
        secondDigit1 = view.findViewById(R.id.second_digit_1);
        secondDigit2 = view.findViewById(R.id.second_digit_2);
    }

}
