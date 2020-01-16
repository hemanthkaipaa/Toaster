package com.hemanthkaipa.toaster;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void shortToaster(Context context,String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
    public static void longToaster(Context context,String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
