package com.example.sooheib.dialogfragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
implements MyDialog.Messaging{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowDialog(View view) {
        android.app.FragmentManager manager=getFragmentManager();
        MyDialog myDialog=new MyDialog();
        myDialog.show(manager,"MyDialog");




    }

    @Override
    public void onDialogMessage(String message) {

        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

}

