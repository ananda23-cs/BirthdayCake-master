package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener{
    private CakeView view;
    private CakeModel model;

    public CakeController(CakeView cakeView){
        view = cakeView;
        model = view.getModel();
    }

    @Override
    public void onClick(View v) {
        Log.d("blowOut", "Poof!");
        model.litCandles = false;
        view.invalidate();
    }
}
