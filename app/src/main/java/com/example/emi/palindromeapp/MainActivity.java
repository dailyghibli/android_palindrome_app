package com.example.emi.palindromeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editInputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Resources.id.editInputText

        editInputText = findViewById(R.id.editInputText);
    }

    public void buttonCheckOnClick(View view) {
        String text = editInputText.getText().toString();

        if(text.length() == 0)
            Toast.makeText(this, "You must enter some text!", Toast.LENGTH_SHORT).show();
        else if(text.length() < 5)
            Toast.makeText(this, "You must enter text at least 5 characters long!", Toast.LENGTH_SHORT).show();
        else
        {
            if(StringUtility.isPalindrome(text))
                Toast.makeText(this, "Input '" + text + "' is a palindrome!", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Input '" + text + "' is not a palindrome!", Toast.LENGTH_SHORT).show();
        }
    }
}
