package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView view = (CakeView) findViewById(R.id.cakeview);
        CakeController controller = new CakeController(view);

        //Button to blow out candles
        Button blowOut = (Button)findViewById(R.id.button);
        blowOut.setOnClickListener(controller);

        //Switch to enable/disable candles
        Switch candle = (Switch)findViewById(R.id.switch2);
        candle.setOnCheckedChangeListener(controller);

        //Switch to change the frosting of the cake
        Switch frosting = (Switch)findViewById(R.id.switch1);
        frosting.setOnCheckedChangeListener(controller);

        //Seekbar to change the number of candles in the cake
        SeekBar numCandle = (SeekBar)findViewById(R.id.seekBar);
        numCandle.setOnSeekBarChangeListener(controller);
    }

    public void goodbye(View button){
        Log.i("button", "Goodbye");
        finishAffinity();
    }
}
