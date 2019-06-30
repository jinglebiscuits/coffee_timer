package com.scottwehby.coffeetimer.services;

import android.content.Intent;
import android.os.IBinder;
import android.provider.AlarmClock;
import android.service.quicksettings.TileService;
import android.util.Log;

import com.scottwehby.coffeetimer.Util;

import androidx.preference.PreferenceManager;

/**
 * Created by scottwehby on 9/10/17.
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
        super.onClick();
        Util.startTimer(this);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }
}
