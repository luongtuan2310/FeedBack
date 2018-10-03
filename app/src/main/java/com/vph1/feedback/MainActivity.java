package com.vph1.feedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainlayout);
        Thread bamgio=new Thread(){
    public void run()
    {
        try {
            sleep(5000);
        } catch (Exception e) {

        }
        finally
        {
            Intent activitymoi=new Intent(MainActivity.this,login_activity.class);
            startActivity(activitymoi);
        }
    }
};
        bamgio.start();
                }
    protected void onPause(){
        super.onPause();
        finish();
    }

}
