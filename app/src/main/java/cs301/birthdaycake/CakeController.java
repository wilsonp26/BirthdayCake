package cs301.birthdaycake;


import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

//View.OnClickListener
public class CakeController implements CompoundButton.OnCheckedChangeListener,
        View.OnClickListener, SeekBar.OnSeekBarChangeListener {
    private CakeView myView;
    private CakeModel cakeModel;
    public CakeController(CakeView view){
        myView = view;
        cakeModel = myView.getModel();
    }

    @Override
    public void onClick(View view){
        Log.d("cake", "click!");
        cakeModel.setCandleLit();
        myView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        cakeModel.candles = b;
        myView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        cakeModel.numCandles = i;
        myView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
