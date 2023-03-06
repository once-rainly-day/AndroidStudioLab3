package com.example.androidstudiolab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.EditText;
import android.widget.ArrayAdapter;
import android.text.TextUtils;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_variant);

        editText = findViewById(R.id.edit);
        Spinner spinner = findViewById(R.id.spin);
        Button button = findViewById(R.id.button1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

        button.setOnClickListener(view -> {
            String text = editText.getText().toString();
            if (!TextUtils.isEmpty(text)) {
                adapter.add(text);
                adapter.notifyDataSetChanged();
                editText.setText("");
            }
        });
    }
    public void onClick(View view) {
        CheckBox checkbox = findViewById(R.id.checkbox);
        checkbox.setChecked(!checkbox.isChecked());
        if(checkbox.isChecked()) {
            checkbox.setText("Не клац");
        }
        else {
            checkbox.setText("Клац");
        }
    }
    public void onCheckboxClicked(View view) {
        CheckBox checkBox = (CheckBox) view;
        if(checkBox.isChecked()) {
            checkBox.setText("Не клац");
        }
        else {
            checkBox.setText("Клац");
        }
    }
}