package alexandria.chan.com.hospital;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);
    }

    public void goToMaps (View view){
        Intent intent = new Intent (this, MapsActivity.class);
        startActivity(intent);
    }

    public void goToTips (View view){
        Intent intent = new Intent (this, EmTips.class);
        startActivity(intent);
    }
}
