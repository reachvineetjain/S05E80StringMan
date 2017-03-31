package com.nehvin.s05e80stringman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String mississipi = "mississippimississippi";
        String[] splitString = mississipi.split("s");
        Log.i("info", Arrays.toString(splitString));
        String subs = mississipi.substring(4,8);
        Log.i("info", subs);

        Pattern p = Pattern.compile("mi(.*?)pi");
        Matcher m = p.matcher(mississipi);
        while(m.find())
            Log.i("info regex",m.group(1));

        //http://www.autocarbrands.com/car-logos/
    }
}
