package com.example.myytimepickre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker.is24HourView();
        button=findViewById(R.id.buttonID);
        textView=findViewById(R.id.textviewID);
        timePicker=findViewById(R.id.timePickerID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String time=timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();

                textView.setText(time);

            }
        });

    }
}