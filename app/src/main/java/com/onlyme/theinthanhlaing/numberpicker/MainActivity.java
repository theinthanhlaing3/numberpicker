package com.onlyme.theinthanhlaing.numberpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.onlyme.theinthanhlaing.library.Enums.ActionEnum;
import com.onlyme.theinthanhlaing.library.Interface.ValueChangedListener;
import com.onlyme.theinthanhlaing.library.NumberPicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberPicker numberPicker = findViewById(R.id.number_picker);
        numberPicker.setMax(15);
        numberPicker.setMin(0);
        numberPicker.setUnit(1);
        numberPicker.setValue(15);

        numberPicker.setValueChangedListener(new ValueChangedListener() {
            @Override
            public void valueChanged(int value, ActionEnum action) {
                Toast.makeText(getApplicationContext(),"chnge value",Toast.LENGTH_SHORT).show();
            }
        });
    }
}