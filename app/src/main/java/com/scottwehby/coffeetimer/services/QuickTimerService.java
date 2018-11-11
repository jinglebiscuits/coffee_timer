package com.scottwehby.coffeetimer.services;

import android.content.Intent;
import android.os.IBinder;
import android.provider.AlarmClock;
import android.service.quicksettings.TileService;
import android.util.Log;

/**
 Created by scottwehby on 9/10/17.
 */

public class QuickTimerService extends TileService {

    private final String LOG_TAG = getClass().getSimpleName();

    public QuickTimerService() {
        super();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onTileAdded() {
        super.onTileAdded();
    }

    @Override
    public void onTileRemoved() {
        super.onTileRemoved();
    }

    @Override
    public void onStartListening() {
        super.onStartListening();
    }

    @Override
    public void onStopListening() {
        super.onStopListening();
    }

    @Override
    public void onClick() {
        Log.d(LOG_TAG, "Start the timer");
        super.onClick();
        Intent intent = new Intent(AlarmClock.ACTION_SET_TIMER)
          .putExtra(AlarmClock.EXTRA_LENGTH, 240)
          .putExtra(AlarmClock.EXTRA_SKIP_UI, true)
          .putExtra(AlarmClock.EXTRA_MESSAGE, "Coffee Time");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }
}
