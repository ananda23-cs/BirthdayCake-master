package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
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

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(buttonView.getId() == R.id.switch2){
            if(isChecked == true){
                model.hasCandles = true;
            } else{
                model.hasCandles = false;
            }
            view.invalidate();
        }
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
