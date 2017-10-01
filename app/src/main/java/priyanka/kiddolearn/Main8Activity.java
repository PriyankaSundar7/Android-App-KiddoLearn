package priyanka.kiddolearn;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main8Activity extends AppCompatActivity implements View.OnClickListener {
    TypedArray images;
    ImageView itemimages6;
    String[] loo,tn,f,h,b,cc;
    TextView t4,t6,t8,t10,ts;
    Button b1;
    ImageButton ii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        ts=(TextView)findViewById(R.id.ts);
        ts.setTextColor(Color.parseColor("#37474F"));
       //ii=(ImageButton)findViewById(R.id.ii);
        //cc=new String[]{"#2E7D32","#689F38","#64DD17","#388E3C","#76FF03","#43A047","#33691E"};
        tn=new String[]{"southernFlorida,Islands,America,Paraguay","subcontinent,Himalaya,Nepal,India","Indomalaya and Australia","Nepal,India","India","South India","India,westBengal"};
        f=new String[]{"strangler fig","Shorea robusta","Banana"," are small, green ripening to purple","Neem Fruit","Mango","woody fibrous fruit Gulmohar fruit"};
        h=new String[]{" tropical region","Dense forests,slopes,flat grounds,soil is deep"," tropical regions ,high temperatures and rainfall","sunlight,suitable temperature for growth"," tropical and subtropical countries"," tropical and subtropical countries","tropical region"};
        b=new String[]{"provide shadow","wood is mainlly for furniture making","all part of tree is edible","the leaf, bark, shoot, seeds, as well as the fruit, has several medicinal benefits","all part of tree is medicinal use","fruit is very tasteful"," several medicinal uses like it is used to treat constipation, inflammations, arthritis and hemiphlagia"};
        t4=(TextView)findViewById(R.id.t4);
        t6=(TextView)findViewById(R.id.t6);
        t8=(TextView)findViewById(R.id.t8);
        t10=(TextView)findViewById(R.id.t10);

        images=getResources().obtainTypedArray(R.array.tree_image);
        loo=getResources().getStringArray(R.array.tree_image);
        itemimages6=(ImageView)findViewById(R.id.iv6);
        final Spinner s6=(Spinner)findViewById(R.id.s6);
        ArrayAdapter<String> sa=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,loo);
        sa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s6.setAdapter(sa);
        List<String> tree=new ArrayList<String>();
         tree.add("BanyanTree");
        tree.add("SalTree");
        tree.add("BananaTree");
        tree.add("PeepalTree");
        tree.add("NeemTree");
        tree.add("MangoTree");
        tree.add("Gulmohar");
        ArrayAdapter<String> da=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,tree);
        da.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s6.setAdapter(da);
        s6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemimages6.setImageResource(images.getResourceId(s6.getSelectedItemPosition(),-1));
                int z=s6.getSelectedItemPosition();
                t4.setText(tn[z]);
                t6.setText(f[z]);
                t8.setText(h[z]);
                t10.setText(b[z]);
                t4.setTextColor(Color.parseColor("#1B5E20"));
                t8.setTextColor(Color.parseColor("#1B5E20"));
                t6.setTextColor(Color.parseColor("#1B5E20"));
                t10.setTextColor(Color.parseColor("#1B5E20"));



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
