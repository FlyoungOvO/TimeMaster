package com.example.yzbkaka.things.jieba;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.example.yzbkaka.things.R;

public class JiebaActivity extends AppCompatActivity {
    private Button back;
    private Button divideButton;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jieba);

        back = findViewById(R.id.back);
        divideButton = findViewById(R.id.divideButton);
        editText = (EditText)findViewById(R.id.edit_text);
    }
}
