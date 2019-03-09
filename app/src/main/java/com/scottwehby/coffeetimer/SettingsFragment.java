package com.scottwehby.coffeetimer;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.preferences);
        Preference timerLength = findPreference(getString(R.string.timer_length_settings_key));
    }

    @Override
    public void onDisplayPreferenceDialog(Preference preference) {
        if (preference instanceof TimerLengthPreference) {
            DialogFragment fragment = null;
            fragment = new TimePickerDialog();
            Bundle bundle = new Bundle();
            bundle.putString("key", preference.getKey());
            fragment.setArguments(bundle);
            fragment.setTargetFragment(this, 0);
            fragment.show(requireFragmentManager(), "jedi");
        }
    }
}
