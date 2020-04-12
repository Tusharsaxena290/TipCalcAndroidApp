package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tipTotalView;
    TextView amountTotalView;
    EditText billTotalEditView;


    Button tenPercentButton;
    Button fifteenPercentButton;
    Button twentyPercentButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tipTotalView=(TextView)findViewById(R.id.textView3);
        tipTotalView.setText("");
        amountTotalView=(TextView)findViewById(R.id.textView5);
        amountTotalView.setText("");
        billTotalEditView=(EditText)findViewById(R.id.editText3);
        tenPercentButton=(Button)findViewById(R.id.BUTTON10);
        fifteenPercentButton=(Button)findViewById(R.id.button2);
        twentyPercentButton=(Button)findViewById(R.id.button3);
        tenPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double billTotal=Double.valueOf(billTotalEditView.getText().toString());
                Double tipTotal=billTotal*0.1;
                tipTotalView.setText("Tip-RS" + tipTotal.toString());
                Double total=billTotal+tipTotal;
                amountTotalView.setText("Amount-Rs" +total.toString());


            }
        });

        fifteenPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double billTotal=Double.valueOf(billTotalEditView.getText().toString());
                Double tipTotal=billTotal*0.15;
                tipTotalView.setText("Tip-RS" + tipTotal.toString());
                Double total=billTotal+tipTotal;
                amountTotalView.setText("Amount-Rs" +total.toString());


            }
        });

        twentyPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double billTotal=Double.valueOf(billTotalEditView.getText().toString());
                Double tipTotal=billTotal*0.2;
                tipTotalView.setText("Tip-RS" + tipTotal.toString());
                Double total=billTotal+tipTotal;
                amountTotalView.setText("Amount-Rs" +total.toString());



            }
        });
        




    }
}
