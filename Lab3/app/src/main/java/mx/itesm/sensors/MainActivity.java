package mx.itesm.sensors;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MainActivity extends AppCompatActivity {


    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();

        Button vibButton=(Button)findViewById(R.id.button_vib);
        vibButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                Intent i = new Intent(context, vibration.class);
                startActivity(i);
            }
        });

        Button proButton=(Button)findViewById(R.id.button_pro);
        proButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                Intent i = new Intent(context, proximity.class);
                startActivity(i);
            }
        });

        @Override
        public void onTokenRefresh(){
            // Get updated InstanceID token.
            String refreshedToken = FirebaseInstanceId.getInstance().getToken();
            Log.d(TAG, "Refreshed token: " + refreshedToken);

            // If you want to send messages to this application instance or
            // manage this apps subscriptions on the server side, send the
            // Instance ID token to your app server.
            sendRegistrationToServer(refreshedToken);
        }

    }
}


