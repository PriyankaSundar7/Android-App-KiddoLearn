package priyanka.kiddolearn;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    ImageButton b2;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //b1=(Button)findViewById(R.id.b1);
        //b1.setOnClickListener(this);
        b2=(ImageButton)findViewById(R.id.b2);
      //  b2.setBackgroundColor(Color.parseColor("#00B0FF"));
        b2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
      // mp=MediaPlayer.create(getApplicationContext(),R.raw.polasoo);
        //mp.start();
        Intent i= new Intent(this,Main2Activity.class);
        startActivity(i);

    }
   /* @Override
    public void onDestroy() {
        //mp.stop();
        //mp.release();

        super.onDestroy();

    }*/
    @Override
    public void onBackPressed()
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);

    }





}
