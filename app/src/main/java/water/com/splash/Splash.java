package water.com.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(50);
            } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        };
        thread.start();
    }

   @Override
   protected void onPause() {
       super.onPause();
       finish();
   }
    }

