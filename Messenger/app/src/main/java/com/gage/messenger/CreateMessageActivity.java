package com.gage.messenger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);

    }

    public void onSendMessage(View view) {

        EditText editText = (EditText)findViewById(R.id.message) ;
        String messageText = editText.getText().toString() ;

        Intent intent = new Intent(this, ReceiveMessageActivity.class) ;
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText) ;
        startActivity(intent);
    }


}
