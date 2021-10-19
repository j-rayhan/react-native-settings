package io.rumors.reactnativesettings.handlers;

import android.provider.Settings;
import android.content.Context;

import io.rumors.reactnativesettings.Constants;

public class DevelopmentModeSettingsHandler implements SettingsHandler<String> {
  private Context mContext;

  public DevelopmentModeSettingsHandler(Context context) {
    this.mContext = context;
  }

  public String getSetting() {
    boolean isDevelopmentModeOn = Settings.Global.getInt(
      mContext.getContentResolver(), Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0) != 0;

    if (isDevelopmentModeOn) {
      return Constants.ENABLED;
    }

    return Constants.DISABLED;
  }
}
