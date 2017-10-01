package priyanka.kiddolearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity  {
    Button b1,b2,b3,b4,b5,b6;
    ImageButton ib1,ib2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        ib2=(ImageButton)findViewById(R.id.ib2);
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res7();

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res1();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              res2();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res3();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res4();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res5();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res6();
            }
        });
    }

     void res1()
     {
         Intent j= new Intent(this,Main9Activity.class);
         startActivity(j);
     }
    void res2()
    {
        Intent k=new Intent(this,Main10Activity.class);
        startActivity(k);
    }
    void res3()
    {
        Intent l=new Intent(this,Main11Activity.class);
        startActivity(l);
    }
    void res4()
    {
        Intent m=new Intent(this,Main12Activity.class);
        startActivity(m);
    }
    void res5()
    {
        Intent n=new Intent(this,Main13Activity.class);
        startActivity(n);
    }
    void res6()
    {
        Intent o= new Intent(this,Main14Activity.class);
        startActivity(o);
    }
    @Override
    public void onDestroy() {

        super.onDestroy();

    }
    public void res7()
    {
        Intent p= new Intent(this,MainActivity.class);
        startActivity(p);
    }
    @Override
    public void onBackPressed()
    {
        Intent m= new Intent(this,MainActivity.class);
        startActivity(m);
    }

}
