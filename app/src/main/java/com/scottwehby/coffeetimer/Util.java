package com.scottwehby.coffeetimer;

import android.content.Context;
import android.content.Intent;
import android.provider.AlarmClock;

import androidx.preference.PreferenceManager;

public class Util {
    public static void startTimer(Context context) {
        int timerLength = PreferenceManager.getDefaultSharedPreferences(context).getInt("timer_length", 240);
        Intent intent = new Intent(AlarmClock.ACTION_SET_TIMER)
          .putExtra(AlarmClock.EXTRA_LENGTH, timerLength)
          .putExtra(AlarmClock.EXTRA_SKIP_UI, true)
          .putExtra(AlarmClock.EXTRA_MESSAGE, "Coffee Time")
          .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }
}
