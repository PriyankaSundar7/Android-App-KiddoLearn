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

public class Main7Activity extends AppCompatActivity implements View.OnClickListener {
    TypedArray images;
    ImageView itemimages5;
    String[] loo,vc,p,h,n,v,g,cc;
    TextView t4,t6,t8,t10,t12,t14,t16,ts;
    ImageButton ii;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        ts=(TextView)findViewById(R.id.ts);
        ts.setTextColor(Color.parseColor("#37474F"));
        cc=new String[]{"#F44336","#43A047","#AD1457","#880E4F","#795548","#388E3C","#F44336","#795548","#558B2F","#FF5252"};
        vc=new String[]{"orange","green","red,purple,white","bluish red","brown","pale white with green leaves","red","light brown","green","yellow,red,white"};
        p=new String[]{"(ground plant)root is edible part","climnbers","(ground plant)root is edible part","(ground plant)root is edible part","(ground plant)root is edible part","flower is a edible part","small plant(fruit is edible part)","grounded plant(root is edible part)","small plant","grounded plant(root is edible part)"};
        h=new String[]{"limited temperate zone","fringe of lakes or slowly flowing rivers","terrestrial; wetlands"," full sun and well-drained soil","wetlands","wild on hills","temperte climate","cool temperate land,warm wet tropicals","Shady places in forests and scrub, on sandy soil","terristrial"};
        n=new String[]{"Europe and southwestern Asia","north America","Europe,china","Europe& Asia","India and SouthAsia","Asia,Europe,NorthAmerica","SouthAmerica","SouthAmerica","Africa","Asia"};
        v=new String[]{" v-A,v-K,potassium,v-B6","Protein,Riboflavin,V-B6,A,C,K,Ca,fe,Mg,Fiber","fiber,k,cu,v-B6,mg,mn,ca","Mn,k,cu,fiber,mg,v-C,iron,v-B6","V-A,B1","v-C,K,protein,mg,fiber,v-B6,potassium,mn","v-C,v-K,cu,mn,fiber,v-B6,v-E","v-B6,cu,v-C,mn,fiber","V-C,A,K,cu,ca,potassium,iron,Mn,Ma,zinc","fiber,ca,iron"};
        g=new String[]{"healthy skin & digestion","reduce weight,heart disease","for diabetic patient","low blood pressure,boost stamina","supply essenyial minerals","supply in-depth  nutrients","give taste to our food","for improving intelligence","rich with minerals& digestive women","numerous health benefits"};
        t4=(TextView)findViewById(R.id.t4);
       // ii=(ImageButton)findViewById(R.id.ii);
        t6=(TextView)findViewById(R.id.t6);
        t8=(TextView)findViewById(R.id.t8);
        t10=(TextView)findViewById(R.id.t10);
        t12=(TextView)findViewById(R.id.t12);
        t14=(TextView)findViewById(R.id.t14);
        t16=(TextView)findViewById(R.id.t16);

        images=getResources().obtainTypedArray(R.array.veg_image);
        loo=getResources().getStringArray(R.array.veg_image);
        itemimages5=(ImageView)findViewById(R.id.iv5);
        final Spinner s5=(Spinner)findViewById(R.id.s5);
        ArrayAdapter<String> sa=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,loo);
        sa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s5.setAdapter(sa);
        List<String> veg=new ArrayList<String>();
        veg.add("Carrot");
        veg.add("Beans");
        veg.add("Radish");
        veg.add("Beetroot");
        veg.add("Gabbie");
        veg.add("Calliflower");
        veg.add("Tomato");
        veg.add("Potato");
        veg.add("LadiesFinger");
        veg.add("onion");

        ArrayAdapter<String> da=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,veg);
        da.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s5.setAdapter(da);
        s5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemimages5.setImageResource(images.getResourceId(s5.getSelectedItemPosition(),-1));
                int z=s5.getSelectedItemPosition();
                t4.setText(vc[z]);
                t6.setText(p[z]);
                t8.setText(h[z]);
                t10.setText(v[z]);
                t12.setText(g[z]);
                t14.setText(n[z]);
                t4.setTextColor(Color.parseColor(cc[z]));
                t6.setTextColor(Color.parseColor(cc[z]));
                t8.setTextColor(Color.parseColor(cc[z]));
                t10.setTextColor(Color.parseColor(cc[z]));
                t12.setTextColor(Color.parseColor(cc[z]));
                t14.setTextColor(Color.parseColor(cc[z]));






            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
     //   ii.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
    }
    @Override
    public void onBackPressed()
    {
        Intent m= new Intent(this,Main2Activity.class);
        startActivity(m);
    }

}
