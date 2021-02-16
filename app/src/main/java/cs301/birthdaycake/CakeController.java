package cs301.birthdaycake;

public class CakeController {
    private CakeView view;
    private CakeModel model;

    public CakeController(CakeView cakeView){
        view = cakeView;
        model = view.getModel();
    }
}
