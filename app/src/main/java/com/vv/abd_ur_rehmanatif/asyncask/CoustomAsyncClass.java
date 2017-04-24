package com.vv.abd_ur_rehmanatif.asyncask;


import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.io.IOException;
import java.nio.channels.AsynchronousCloseException;

/**
 * Created by abd-ur-rehmanatif on 24/04/2017.
 */

public class CoustomAsyncClass  extends AsyncTask<Void,Integer,Boolean>{



        public static final String Tag = "MTAG";
        public static Context ca = null;
        public static String Email;
        public static String Password;

        public CoustomAsyncClass(Context c ,  String Email, String Password) {

            ca = c;

            this.Email = Email;
            this.Password = Password;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            MainActivity.progressBar.setVisibility(View.VISIBLE);


        }

        @Override
        protected Boolean doInBackground(Void... params) {




        if (Email.matches("uol@yahoo.com") && Password.matches("123")){


            try {

                Thread.sleep(1000);
                publishProgress();
            return true;

            }catch (InterruptedException e){

            }


        }else
        {

            try {

                Thread.sleep(1000);
                publishProgress();
                return false;

            }catch (InterruptedException e){

            }

        }


            return false;
        }



        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);


            MainActivity.progressBar.setVisibility(View.GONE);
           // Toast.makeText(ca , "HighestValue & length , Toast.LENGTH_LONG).show();

        }

        @Override
        protected void onPostExecute(Boolean cheak) {
            super.onPostExecute(cheak);

            if (cheak == true){

                Toast.makeText(ca , "Email and Password match" , Toast.LENGTH_LONG).show();

            }else
            {
                Toast.makeText(ca , "Email and Password Doesn't match" , Toast.LENGTH_LONG).show();
            }



        }
    }

