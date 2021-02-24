package cs301.birthdaycake;

import android.graphics.Canvas;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    private CakeView view;
    private CakeModel model;
    private int clickCount = 0;

    public CakeController(CakeView cakeView){
        view = cakeView;
        model = view.getModel();
    }

    @Override
    public void onClick(View v) {
        clickCount = clickCount + 1;
        if(clickCount % 2 != 0) {
            Log.d("extinguished", "Poof!");
            v.setTag(R.id.button, "Re-Light");
            ((Button) v).setText("Re-Light");
            model.litCandles = false;
            view.invalidate();
        } else{
            Log.d("Re-Light", "Candles re-lit");
            v.setTag(R.id.button, "extinguished");
            ((Button) v).setText("Extinguish");
            model.litCandles = true;
            view.invalidate();
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(buttonView.getId() == R.id.switch2){
            model.hasCandles = isChecked;
        }
        else if(buttonView.getId() == R.id.switch1){
            model.frosting = isChecked;
        }
        view.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        model.numCandles = progress;
        view.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {}

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {}

}
