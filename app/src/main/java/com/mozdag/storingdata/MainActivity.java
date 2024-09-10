package com.mozdag.storingdata;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editText = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.textView);

        sharedPreferences = this.getSharedPreferences("com.mozdag.storingdata", Context.MODE_PRIVATE);



        int storedAge = sharedPreferences.getInt("storedAge",0);

        if (storedAge == 0){
            textView.setText("Your Age: ");
        }else {
            textView.setText("Your Age: " + storedAge);
        }


    }

    public void save(View view){
        if (!editText.getText().toString().matches("")){
            int userage = Integer.parseInt(editText.getText().toString());
            textView.setText("Your age: " + userage);

            sharedPreferences.edit().putInt("storedAge",userage).apply();

        }
        else {

        }
    }

    public void delete(View view){
        int storedDate = sharedPreferences.getInt("storedAge",0);

        if (storedDate != 0) {
           sharedPreferences.edit().remove("storedAge").apply();
           textView.setText("Your Age: ");
        }



    }
}