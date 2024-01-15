package com.example.netclan;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class refine_page extends AppCompatActivity {

    private Button button1;
    private Button button2;


    private boolean isFilled = false;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine_page2);

        EditText editText = findViewById(R.id.editTextTextMultiLine2);
        editText.setText("  Hi community ! \uD83D\uDE0A");

        getSupportActionBar().setTitle("Refine Page");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        button1 = findViewById(R.id.bussiness);
        button2 = findViewById(R.id.friendship);

        setButtonUnselected(button1);
        setButtonUnselected(button2);

        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);
        seekBar.setProgress(50);
        final TextView seekBarValue = (TextView)findViewById(R.id.seekbarvalue);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });
    }
    public void onButtonClick(View view) {
        Button clickedButton = (Button) view;

        // Toggle the button state between selected and unselected
        if (clickedButton.isSelected()) {
            setButtonUnselected(clickedButton);
        } else {
            setButtonSelected(clickedButton);
        }

        showToast(clickedButton.getText().toString() + " selected");
    }
    private void setButtonSelected(Button button) {
        button.setSelected(true);
        button.setBackgroundResource(R.drawable.button_background_filled);
    }

    private void setButtonUnselected(Button button) {
        button.setSelected(false);
        button.setBackgroundResource(R.drawable.button_background_unfilled);
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}