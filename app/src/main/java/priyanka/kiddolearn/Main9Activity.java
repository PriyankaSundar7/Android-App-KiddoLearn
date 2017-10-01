package priyanka.kiddolearn;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main9Activity extends AppCompatActivity {
    ImageButton ib1,ib2;
    TextView t1;
    ImageButton ii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        ib1=(ImageButton)findViewById(R.id.ib1);
        ib2=(ImageButton)findViewById(R.id.ib2);
        //ii=(ImageButton)findViewById(R.id.ii);
       // ii.setOnClickListener(new View.OnClickListener() {
           // @Override
          //  public void onClick(View v) {
         //      resh();
        //    }
       // });
      //  t1=(TextView)findViewById(R.id.textView5);

        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               res1();

            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2();

            }
        });
    }
    public void res1()
    {

        Intent i=new Intent(this,Main3Activity.class);
        startActivity(i);
    }
    public void res2()
    {
        Intent j=new Intent(this,Main2Activity.class);
        startActivity(j);
    }
    public void resh()
    {
        Intent h= new Intent(this,Main2Activity.class);
        startActivity(h);
    }
    @Override
    public void onBackPressed()
    {
        Intent n= new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(n);
    }
}
