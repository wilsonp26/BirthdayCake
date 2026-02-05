package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

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

        //register controller as Candle switch listener
        Switch candles = findViewById(R.id.switch2);
        candles.setOnCheckedChangeListener(myCtrl);

        //register controller as Seekbar listener
        SeekBar numCandles = findViewById(R.id.seekBar2);
        numCandles.setOnSeekBarChangeListener(myCtrl);
    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
        finishAffinity();
    }
}
