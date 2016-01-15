package com.example.nullrootview;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    final ViewGroup viewGroup;
    setContentView(viewGroup = new LinearLayout(this));

    //See how it is not true, but is assumed to be always true by the SDK
    Log.d("Assertion", "Does the set view get android.R.id.content as id? " + (viewGroup.getId()
        == android.R.id.content));
  }
}
