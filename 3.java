package com.example.sms_send;
import androidx.appcompat.app.AppCompatActivity; import android.app.PendingIntent;
import android.content.Intent;
import android.telephony.SmsManager; import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener; import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity { EditText mobileno,message;
    Button sendsms;
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main); mobileno=(EditText)findViewById(R.id.editText1); message=(EditText)findViewById(R.id.editText2); sendsms=(Button)findViewById(R.id.button1); sendsms.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View arg0) {
            String no=mobileno.getText().toString(); String msg=message.getText().toString(); Intent intent=new
                    Intent(getApplicationContext(),MainActivity.class); PendingIntent
                    pi=PendingIntent.getActivity(getApplicationContext(), 0, intent,0); SmsManager sms=SmsManager.getDefault();
            successfully!",
        }
    }); }
@Override
        sms.sendTextMessage(no, null, msg, pi,null); Toast.makeText(getApplicationContext(), "Message Sent
    Toast.LENGTH_LONG).show();
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main,menu);
        return true;
    } }