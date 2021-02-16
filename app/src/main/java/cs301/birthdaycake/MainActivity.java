package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

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
    }

    public void goodbye(View button){
        Log.i("button", "Goodbye");
        finishAffinity();
    }
}
