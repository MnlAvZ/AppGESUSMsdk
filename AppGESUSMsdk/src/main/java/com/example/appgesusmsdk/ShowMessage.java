package com.example.appgesusmsdk;

import android.content.Context;
import android.widget.Toast;

public class ShowMessage {

    Context ctx;

    public  ShowMessage(Context ctx){
        this.ctx = ctx;
    }

    public void ViewMessage(String message){
        Toast.makeText(ctx, message, Toast.LENGTH_LONG).show();
    }
}
