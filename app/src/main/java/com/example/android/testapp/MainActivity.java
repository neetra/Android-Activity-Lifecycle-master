package com.example.android.testapp;

import android.app.Dialog;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button openDialog;
    TextView activityACounter;

    private static int mainActivityCounter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("onCreate ------ ", "MainActivity: onCreate()");

        openDialog = findViewById(R.id.opendialog);
        activityACounter = (TextView)findViewById(R.id.counterActivityA);

        activityACounter.setText(String.format("Counter is %d", mainActivityCounter));
        openDialog.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
               switchDialogActivity(view);
                //showCustomDialog();
            }
        });

    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate if the process is
        // killed and restarted.
        Log.e("onSaveInstanc ------ ","MainActivity: onSaveInstanceState()");
        // etc.
    }
  /*  void showCustomDialog(){
        DialogActivity dialog = new DialogActivity(MainActivity.this);
        //dialog.setContentView(R.layout.activit_dialog);
        dialog.show();
    }*/
    @Override
    public void onStart() {
        super.onStart();
        Log.e("onStart ------ ","MainActivity: onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume ------ ","MainActivity: onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause ------ ","MainActivity: onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop ------ ","MainActivity: onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy ------ ","MainActivity: onDestroy()");
    }


    @Override
    protected void onRestart() {
        super.onRestart();


        mainActivityCounter ++;
        activityACounter.setText(String.format("Counter is %d",
                mainActivityCounter));
        Log.e("onRestart ------ ",String.format("MainActivity: Counter %d", mainActivityCounter));
        Log.e("onRestart ------ ","MainActivity: onRestart()");

    }

    public void switchActivity(View view){
        Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
        startActivity(intent);
    }

    public void switchDialogActivity(View view){
        Intent intent = new Intent(getApplicationContext(), DialogActivity.class);
        startActivity(intent);
    }
}
