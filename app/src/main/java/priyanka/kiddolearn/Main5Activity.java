package priyanka.kiddolearn;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static priyanka.kiddolearn.R.id.t4;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {
    TypedArray images;
    ImageView itemimages3;
    String[] loo,f,p,h,n,u,cc;
    TextView t4,t6,t8,t10,t12,t14,ts;
     ImageButton ii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        //cc=new String[]{"#9CCC65","#F06292","#42A5F5","#6D4C41","#FF4081","#FFC400","#FFB300","#FF7043"};
        f=new String[]{"white,light yellow"," maroon, black ,purple,pure white, cream , palest","red, purple,blue,white,pink","White,orange ,yellow","dark pink, yellow or green ,light pink,white","verity of color(so many colors)" ,"yellow, orange, ruby red, white","sandle,orange","light green"};
        p=new String[]{"10-15 feet tall shrubs","4-8 inches","acuatic plant floats in water","2-6 feet plants","upto some normal range of trees(10 inches)","2-3 feet tall,1-2 feet","12-13 inches height","range upto 160 feet"};
        h=new String[]{"partial sun exposure,annual rainfall 10-12 inches","Mountainous area with temperate climates","shallow and murky waters","northern hemisphere,temperate and tropical areas","tropical and sub-tropical regions","grasslands,meadows,gardens,urban areas&roadsides","sunny,moist,or disturbed areas","Indomalaysia,China,WesternGhats-South,Sahyadris"} ;
        n= new String[]{"tropical,temperate region(Himalayas in china)","Central Asia"," southern parts of Asia and Australia","Turkey and Spain,Asia","south korea","south africa","north america,russia","southeast asia"};
        u=new String[]{"Gardening,fragnance,divotional present","gardening,decorative purpose","To workship","fragnance,use widely in festivel season","decorative perpose","dercorative purpose","oil extraction","fragnance"};
        t4=(TextView)findViewById(R.id.t4);
        t6=(TextView)findViewById(R.id.t6);
        t8=(TextView)findViewById(R.id.t8);
        t10=(TextView)findViewById(R.id.t10);
        t12=(TextView)findViewById(R.id.t12);
        ts=(TextView)findViewById(R.id.ts);
        ts.setTextColor(Color.parseColor("#37474F"));
      //  ii=(ImageButton)findViewById(R.id.ii);
        images=getResources().obtainTypedArray(R.array.flo_image);
        loo=getResources().getStringArray(R.array.flo_image);
        itemimages3=(ImageView)findViewById(R.id.iv3);
        final Spinner s3=(Spinner)findViewById(R.id.s3);
        ArrayAdapter<String> sa=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,loo);
        sa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s3.setAdapter(sa);
        List<String> flo=new ArrayList<String>();
        flo.add("Jasmin");
        flo.add("Tulip");
        flo.add("Lotus");
        flo.add("lilly");
        flo.add("Blossom");
        flo.add("Daisy");
        flo.add("Sunflower");
        flo.add("Shenbagam");
        ArrayAdapter<String> da=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,flo);
        da.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s3.setAdapter(da);
        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemimages3.setImageResource(images.getResourceId(s3.getSelectedItemPosition(),-1));
                int z=s3.getSelectedItemPosition();
                t4.setText(f[z]);
                t6.setText(p[z]);
                t8.setText(h[z]);
                t10.setText(n[z]);
                t12.setText(u[z]);
                t4.setTextColor(Color.parseColor("#E91E63"));
                t6.setTextColor(Color.parseColor("#E91E63"));
                t8.setTextColor(Color.parseColor("#E91E63"));
                t10.setTextColor(Color.parseColor("#E91E63"));
                t12.setTextColor(Color.parseColor("#E91E63"));
                //#F06292
              /*  t4.setTextColor(Color.parseColor(cc[z]));
                t6.setTextColor(Color.parseColor(cc[z]));
                t8.setTextColor(Color.parseColor(cc[z]));
                t10.setTextColor(Color.parseColor(cc[z]));
                t12.setTextColor(Color.parseColor(cc[z]));*/
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //ii.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i= new Intent(this,Main2Activity.class);
        startActivity(i);

    }
    @Override
    public void onBackPressed()
    {
        Intent m= new Intent(this,Main2Activity.class);
        startActivity(m);
    }

}
