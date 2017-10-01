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

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Main6Activity extends AppCompatActivity implements View.OnClickListener {
    TypedArray images;
    ImageView itemimages4;
    String[] loo,f,c,p,h,n,v,g,t,cc;
    TextView t4,t6,t8,t10,t12,t14,t16,ts;
    ImageButton ii;


//ctrl +alt +3(f3)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        ts=(TextView)findViewById(R.id.ts);
        ts.setTextColor(Color.parseColor("#37474F"));
        //ii=(ImageButton)findViewById(R.id.ii);
        cc=new String[]{"#D50000","#F44336","#388E3C","#9E9D24","#455A64","#D32F2F","#EF5350","#4CAF50","#757575","#558B2F","#D81B60","#E53935"};
        c=new String[]{"Red,green","Orange ,green","yellow,red,green","light green,sometimes pale yellow","voilet,black","Red,marune,green","white with red spoted,and red","Green with pink inside,green with white inside,green,pale green","indigo","green","dark pink,light pink,violet,black","green with pink inside","pink with yellow ,pulps are in pink and pale white color"};//colo
        p=new String[]{"tree","tree","plantain tree","Creeper","creepers","tree","shrubs(tree)","tree","shrub(tree)","Climbers","creeper","creeper","tree"};
        h=new String[]{" all temperate zones","all temperate zone","sunny and wind-protected area","meadows,pastures,lawns,roadsides,gardens","tropical and subtropical climates","tropical and subtropical climates","winter temperatures not sever,temperatures-moderate","woodlands and meadows to sand dunes and beaches","tropical and subtropicsl","woodlands and meadows to sand dunes and beaches","forest(italy,china,south africa,chile) ,tolerate sunny region","woodlands and meadows to sand dunes and beaches","temperate,subtropical region","north indian region(ph should be neutral"};
        n=new String[]{"NorthAmerica,Europe","Australia","Indomalaya ,Australia","NorthAmerica","NorthAmerica","United Kingdom","Northern Hemisphere,southern brazil","Australia","Australia,New zealans,South America","North,Central,Eastern china","Western North America","North and Western Africa","NorthIndia"};
        v=new String[]{"A","C","vit-B6,manganese,v-C,potassium,fiber,potassium,copper","K,B-6","K,B-6","fiber,vitamin C,A,potassium,copper","v-C,manganese,fiber,iodine,copper,potassium,phosphorus,v-B6,omega-3 fats","protein,fiber,folate,vitamin C","vitamin K, vitamin C and manganese,fiber and copper","vitamin A,K,E,B,potassium,copper,folate,fiber,20 vital nutrients","vitamin C, manganese and Vitamin B2 and B6"," v-C,pantothenicAcid,copper,biotin,potassium,v-A,v-B1,B6,magnesium"," fibre, B vitamins, vitamin C, vitamin K and potassium"};
        g=new String[]{"eye power","Strength  for hair and give antioxident","musule,digestion,strength","heart &skin,blood vessels","heart & skin ,blood vessels","health promoting,preventing cancer","health,skin","regular vessels,eye improvement,lower-cancer risk,diabetes,stress","decrease heart disease risk,low cholestrol","skin,low diabetes,clean digestive system","skin","reduce cancer risk,increase blood water level","good for heomoglobin,reduce risk from Alzheimer"};
        t=new String[]{"juiciness, sweetness, crispness and crunch","sweet to sour","soft, sweet","sour to sweet","sour to sweet","sour-sweet","rind, flesh and seeds,sweet","sweeter","striking garnish,sour with sweet"," sweet, floral ","oft yet crunchy unlike soft, creamy texture ,sweet","sour & sweeter"};
        t4=(TextView)findViewById(R.id.t4);
        t6=(TextView)findViewById(R.id.t6);
        t8=(TextView)findViewById(R.id.t8);
        t10=(TextView)findViewById(R.id.t10);
        ts=(TextView)findViewById(R.id.ts);
        ts.setTextColor(Color.parseColor("#37474F"));
        t12=(TextView)findViewById(R.id.t12);
        t14=(TextView)findViewById(R.id.t14);
        t16=(TextView)findViewById(R.id.t16);
        images=getResources().obtainTypedArray(R.array.fru_image);
        loo=getResources().getStringArray(R.array.fru_image);
        itemimages4=(ImageView)findViewById(R.id.iv4);
        final Spinner s4=(Spinner)findViewById(R.id.s4);
        ArrayAdapter<String> sa=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,loo);
        sa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s4.setAdapter(sa);
        List<String> fru=new ArrayList<String>();
        fru.add("Apple");
        fru.add("Orange");
        fru.add("Banana");
        fru.add("GreenGrapes");
        fru.add("BlackGrapes");
        fru.add("Cherry");
        fru.add("Strawberry");
        fru.add("Gova");
        fru.add("BlueBerry");
        fru.add("Kiwi");
        fru.add("LoganBerry");
        fru.add("WaterMelon");
        ArrayAdapter<String> da=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,fru);
        da.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s4.setAdapter(da);
        s4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemimages4.setImageResource(images.getResourceId(s4.getSelectedItemPosition(),-1));
                int z=s4.getSelectedItemPosition();
                t4.setText(c[z]);
                t6.setText(p[z]);
                t8.setText(h[z]);
                t10.setText(n[z]);
                t12.setText(v[z]);
                t14.setText(g[z]);
                t16.setText(t[z]);
                t4.setTextColor(Color.parseColor(cc[z]));
                t6.setTextColor(Color.parseColor(cc[z]));
                t8.setTextColor(Color.parseColor(cc[z]));
                t10.setTextColor(Color.parseColor(cc[z]));
                t12.setTextColor(Color.parseColor(cc[z]));
                t14.setTextColor(Color.parseColor(cc[z]));
                t16.setTextColor(Color.parseColor(cc[z]));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
       // ii.setOnClickListener(this);
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
