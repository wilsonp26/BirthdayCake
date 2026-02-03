package cs301.birthdaycake;


public class CakeController {
    private CakeView myView;
    private CakeModel cakeModel;
    public CakeController(CakeView view){
        myView = view;
        cakeModel = myView.getModel();
    }
}
