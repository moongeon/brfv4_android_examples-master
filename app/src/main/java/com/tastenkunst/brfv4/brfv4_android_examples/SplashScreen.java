package com.tastenkunst.brfv4.brfv4_android_examples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by LOTTE on 2018-01-31.
 */

public class SplashScreen extends Activity {
@Override
protected  void onCreate(Bundle saveInstanceState){
    super.onCreate(saveInstanceState);
    try{
        Thread.sleep(1000);

    }catch (InterruptedException e){
        e.printStackTrace();

    }
    Intent intent = new Intent(this,BRFv4ExampleActivity.class);
    startActivity(intent);
    finish();
}
}
