package priyanka.kiddolearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main10Activity extends AppCompatActivity {
    ImageButton ib1,ib2,ii;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        ib1=(ImageButton)findViewById(R.id.ib1);
        ib2=(ImageButton)findViewById(R.id.ib2);
       // ii=(ImageButton)findViewById(R.id.ii);
       // t1=(TextView)findViewById(R.id.textView5);
        //t1.setBackgroundColor(-7829368);
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
        /*ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resh();
            }
        });*/
    }
    public void res1()
    {
        Intent i= new Intent(this,Main4Activity.class);
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
        Intent m= new Intent(this,Main2Activity.class);
        startActivity(m);
    }
}
