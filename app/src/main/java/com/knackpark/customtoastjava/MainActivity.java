package com.knackpark.customtoastjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast = new Toast(getApplicationContext());
                View view = getLayoutInflater().inflate(R.layout.custom_toast_layout ,findViewById(R.id.toastLayout));
                toast.setView(view);

                TextView txt = view.findViewById(R.id.textView);
                txt.setText("You have succesfully created a custom Toast");

                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP  , 0 ,10);
                toast.show();



            }
        });



    }
}