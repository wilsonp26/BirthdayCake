package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CakeController myCtrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        myCtrl = new CakeController(findViewById(R.id.cakeview));

        //register the controller as blowOut button listener
        Button blowOut = findViewById(R.id.button);
        blowOut.setOnClickListener(myCtrl);
    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
        finishAffinity();
    }
}
