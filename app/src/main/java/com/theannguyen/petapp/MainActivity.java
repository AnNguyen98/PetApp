package com.theannguyen.petapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    Button btnCalculate;
    EditText edtAge;
    ImageView imgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int []myNumbers = {2,3,4,5,6,7};
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<String,String> hashMap = new HashMap<>();
        HashMap hashMap1 = new HashMap();
        ArrayList arrayList1 = new ArrayList();

        for(Integer i: arrayList){
 
        }

        findID();
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                if(edtAge.getText().toString() != "") {
                    int age = year - Integer.parseInt(edtAge.getText().toString());
                    edtAge.setText(age + "");
                }
            }
        });
    }

    private void findID() {
        btnCalculate = findViewById(R.id.btnCalculate);
        edtAge       = findViewById(R.id.edtBorn);
        imgPet       = findViewById(R.id.imgPet);
    }
}
