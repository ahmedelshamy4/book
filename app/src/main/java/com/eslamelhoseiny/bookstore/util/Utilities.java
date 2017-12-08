package com.eslamelhoseiny.bookstore.util;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;

import com.eslamelhoseiny.bookstore.R;


public class Utilities {

    private static final String TAG = "Utilities";

    static Dialog progressDialog;


    public static void showLoadingDialog(Context context, int color) {
        try {
            if (progressDialog != null && progressDialog.isShowing())
                progressDialog.dismiss();
            progressDialog = new Dialog(context);
            progressDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            progressDialog.setCancelable(true);
            progressDialog.setContentView(R.layout.dialog_loading);
            ProgressBar progressBar = progressDialog.findViewById(R.id.progress_loading);
            progressBar.getIndeterminateDrawable().setColorFilter(color, PorterDuff.Mode.MULTIPLY);
            Window window = progressDialog.getWindow();
            if (window != null)
                progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
            progressDialog.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void dismissLoadingDialog() {
        try {
            if (progressDialog != null && progressDialog.isShowing())
                progressDialog.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

}
