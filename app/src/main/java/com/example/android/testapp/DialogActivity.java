package com.example.android.testapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class DialogActivity extends Activity {

    public Activity c;
    public Dialog d;
    public Button yes, no;
   /* public DialogActivity(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
    }*/




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("onCreate---- ", String.format("DialogActivity: onCreate() "));

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activit_dialog);
        yes = (Button) findViewById(R.id.btn_yes);
       // no = (Button) findViewById(R.id.btn_no);
       // yes.setOnClickListener((View.OnClickListener) this);
       // no.setOnClickListener((View.OnClickListener) this);

        Log.e("onCreate---- ", String.format("DialogActivity: onCreate() "));

    }

    public void onClickSwitchActivityA(View view){

        Log.e("SwitchActivityA---- ", String.format("DialogActivity: onClickSwitchActivityA() "));
        this.finish();
        //Intent intent = new Intent(getApplicationContext(), MainActivity.class);
       // startActivity (intent);
    }
    /*@Override
    public void onClick(View v) {

        Log.e("onClick------ ", String.format("DialogActivity: onClick() : %d", v.getId()));
        switch (v.getId()) {
            case R.id.btn_yes:
                c.onBackPressed();
                break;
            case R.id.btn_no:
                dismiss();
                break;
            default:
                break;
        }
        dismiss();*/
    }
   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activit_dialog);
        Log.e("onCreate ------ ", "DialogActivity: onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart ------ ", "DialogActivity: onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume ------ ", "DialogActivity: onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause ------ ", "DialogActivity: onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop ------ ", "DialogActivity: onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy ------ ", "DialogActivity: onDestroy()");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart ------ ", "DialogActivity: onRestart()");

    }

    public void switchActivityAFromDialog(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity (intent);
    }
*/

