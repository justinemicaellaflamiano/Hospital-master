package alexandria.chan.com.hospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        Thread myThread = new Thread(){

            @Override
            public void run(){
                try{
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(),MainMenu.class);
                    startActivity(intent);
                    finish();
                }catch(InterruptedException e){
                    e.printStackTrace();

                }
            }
        };
        myThread.start();
    }
}
