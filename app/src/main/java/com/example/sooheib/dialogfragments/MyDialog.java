package com.example.sooheib.dialogfragments;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by sooheib on 6/3/16.
 */
public class MyDialog extends DialogFragment implements View.OnClickListener {

    Button yes,no;
    Messaging messagin;
    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.button2){

            messagin.onDialogMessage("yes was clicked");
        }
        else{
            messagin.onDialogMessage("no wasnt clicked");

        }
        dismiss();
    }

    public interface Messaging{
        public void onDialogMessage(String message );

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        messagin= (Messaging) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.mydialog,null);
        yes= (Button) view.findViewById(R.id.button2);
        no= (Button) view.findViewById(R.id.button3);
        no.setOnClickListener(this);
        setCancelable(false);
        getDialog().setTitle("My Dialog Title");
        return view;
    }
}
