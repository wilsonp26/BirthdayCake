package cs301.birthdaycake;


import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener{
    private CakeView myView;
    private CakeModel cakeModel;
    public CakeController(CakeView view){
        myView = view;
        cakeModel = myView.getModel();
    }

    public void onClick(View view){
        Log.d("cake", "click!");
        cakeModel.setCandleLit();
    }

}
