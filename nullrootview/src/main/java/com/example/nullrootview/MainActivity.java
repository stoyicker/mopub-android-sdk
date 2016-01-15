package com.example.nullrootview;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import com.mopub.mobileads.MoPubInterstitial;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends Activity {

  private static final String INTERSTITIAL_ID = "YOUR_ID_WITH_MRAIDS_HERE";
  private MoPubInterstitial mMoPubInterstitial;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(new LinearLayout(this));

    addInterstitial();
    loadAd();
    showAd();
  }

  private void addInterstitial() {
    mMoPubInterstitial = new MoPubInterstitial(this, INTERSTITIAL_ID);
    final Map<String, Object> extras = new HashMap<>();
    DisplayMetrics metrics = new DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics(metrics);
    extras.put("screenWidth", String.valueOf(metrics.widthPixels));
    extras.put("screenHeight", String.valueOf(metrics.heightPixels));
    mMoPubInterstitial.setLocalExtras(extras);
  }

  private void loadAd() {
    mMoPubInterstitial.load();
  }

  private void showAd() {
    mMoPubInterstitial.show();
  }
}
