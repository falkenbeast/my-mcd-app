package com.falkenbeast.mymcd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CardView cdstart;
    CardView cdmainc;

    Button rebutton;

    TextView contactid;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cdstart = findViewById(R.id.cdstart);
        cdmainc = findViewById(R.id.cdmainc);


        cdstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sai = new Intent(MainActivity.this, StartersActivity.class);
                startActivity(sai);


            }
        });


        cdmainc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mai = new Intent(MainActivity.this, MainCourseActivity.class);
                startActivity(mai);
            }
        });

        rebutton = findViewById(R.id.rebutton);

        rebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // **Update this with the actual YouTube app package name**
                String packageName = "com.mcdonalds.mobileapp";

                // Try to open YouTube app
                Intent intent = getPackageManager().getLaunchIntentForPackage(packageName);
                if (intent != null) {
                    // App is installed, launch it
                    startActivity(intent);
                } else {
                    // App not installed, open Play Store
                    Intent playStoreIntent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=" + packageName));
                    startActivity(playStoreIntent);
                }
            }
        });

        contactid = findViewById(R.id.contactid);
        contactid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:arshayush21@gmail.com"));
                startActivity(emailIntent);
            }
        });

    }
}