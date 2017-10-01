package priyanka.kiddolearn;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {
    TypedArray images;
    ImageView itemimages2;
    String[] loo;
    String[] b,c,f,h,d,p,l,p1;
    TextView t4,t6,t8,t10,t12,t14,t16,ts;
    ImageView ii;
    MediaPlayer mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Toast.makeText(this,"plug-in with Audio jack",Toast.LENGTH_LONG).show();

        ts=(TextView)findViewById(R.id.ts);
        ts.setTextColor(Color.parseColor("#37474F"));
        final String[] colr = new String[]{"#388E3C","#F06292","#64DD17","#424242","#00796B","#D32F2F","#263238","#FF8F00","#FF8F00","#455A64","#757575","#F06292","#795548","#BF360C","#795548"};
        c=new String[]{"red,blue,green","light gray,white,blue,brown","green","black,brown","green,blue,white","black,brown,sandle,red","black","brown,white","white,brown,sandle,red","balck,brown,red,indigo","balck and white","navy,gold,white,red","white,black,light brown","Black, White, Grey, Tan, Brown, Red, Green","white,black"};
        f=new String[]{"Differnt colors of paletes","some time spotted with white or black","Red color nose","white from neck towards face","long feathers","special feather,large comb,","fully black"," Red-tailed, streaked belly,dark bar between shoulder and wrist","small comb","barless,bar or checked velvet patterns","have feathers, but can not fly","have throat pouch","long legs and a long neck that protrudes from a round body","Long, hard beak and striking coloured feathers","head&neck,varying skin,yellow,blue,purple,red,ruff,flight,tail"};
        h=new String[]{"Rainforest & tropical jungle","grassland, and lightly wooded areas,formsteads","tropical & subtropical continents","seacoast,lakes,rivers,marshals","forest & rain forest","domesticted fowls & some times in forest","grassland and urban areas too","desert and fields","domesticted fowls & some times in forest","adaptable,mostly in cities","ocean water,cold region","island & freshwaterlands","savannas,woodlands,desert,plains,semidesert,scrubs(Africa)","forest& during winter they migrate","south America and United States"};
        d=new String[]{"omnivore","omnivore","omnivore","carnivore","omnivore","omnivore","omnivore","carnivore","omnivore","omnivore","carnivore","hypercarnivore","omnivore","omnivore","carnivore"};
        p=new String[]{"Fruits,nuts,seeds,insects","cereals,wheat,corn,fruit&green","nuts,fruits,flowers,seeds,insects","meats only, small birds","seeds,nuts,fruits,small insects","seeds and cereals and everything","fruits,seeds and small animals & everything","snakes, lizards, fish, mice, rabbits, squirrels, birds","seeds and cereals and everything","seeds,insects,fruits,occassionally insects but not flesh","krill, fish, and squid","meat & meat only mostly fishes","roots, leaves, and seeds, insects, snakes, lizards, and rodents","acorns, nuts, fruit, sap, berries and pine seeds,insects","dead animals, food waste,small animals,eggs of birds"};
        l=new String[]{"30-35 years & rarely upto 50,120","10 years","Range from 10-60 years","14-20 years","10-25 years","10-15 years","10-22 years","12-25 years","10-13 years","5 years","6-20 years","12-25 years","40-45 years","4-11 years","10-30 years"};
        p1=new String[]{"toucon","falcans and hawks","monkey,snack,large birds","bobcats,blackbear,raccons & others birds during nesting","wilddog,raccons,tigers","dog,bobcat,owl,human","hawks & owls","great-horned owls, raccoons and red foxes","dog,coyote,fox,bobcat,hawk, owl","natural predators (eg:peregrine falcon)","killer whales, leopard seals and sharks"," skunks, sea gulls and wild cats,human","cheetahs, lions, leopards, African hunting dogs, and spotted hyenas","hawks,rat,house cat,owls,snakes"," horned owls, red-tailed hawks,eagles,raccons and opossums"};
        t4=(TextView)findViewById(R.id.t4);
        t6=(TextView)findViewById(R.id.t6);
        t8=(TextView)findViewById(R.id.t8);
        t10=(TextView)findViewById(R.id.t10);
        t12=(TextView)findViewById(R.id.t12);
        t14=(TextView)findViewById(R.id.t14);
        t16=(TextView)findViewById(R.id.t16);
       // ii=(ImageView)findViewById(R.id.ii);
        images=getResources().obtainTypedArray(R.array.birds_image);
        loo=getResources().getStringArray(R.array.birds_image);
        itemimages2=(ImageView)findViewById(R.id.iv2);
        final Spinner s2=(Spinner)findViewById(R.id.s2);
        ArrayAdapter<String> sa=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,loo);
        sa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(sa);
        List<String> bird=new ArrayList<String>();
        bird.add("Macaw");
        bird.add("Dove");
        bird.add("Parrot");
        bird.add("Eagle");
        bird.add("Peacock");
        bird.add("Rooster(Cock)");
        bird.add("Crow");
        bird.add("Hawks");
        bird.add("Hen");
        bird.add("Pegion");
        bird.add("Penguin");
        bird.add("Pelican");
        bird.add("Ostrich");
        bird.add("WoodPecker");
        bird.add("vulture");


        ArrayAdapter<String> da=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,bird);
        da.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(da);
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemimages2.setImageResource(images.getResourceId(s2.getSelectedItemPosition(),-1));
                int z=s2.getSelectedItemPosition();
                if(z==0)
                {
                    mv=MediaPlayer.create(getApplicationContext(),R.raw.macaw1);
                    mv.start();
                }
                if(z==1)
                {
                    mv.stop();
                    mv=MediaPlayer.create(getApplicationContext(),R.raw.dove);
                    mv.start();
                }
                if(z==2)
                {
                    mv.stop();
                    mv=MediaPlayer.create(getApplicationContext(),R.raw.parrot);
                    mv.start();
                }
                if(z==3)
                {
                    mv.stop();
                    mv=MediaPlayer.create(getApplicationContext(),R.raw.eagle);
                    mv.start();
                }if(z==4)
                {
                    mv.stop();
                    mv=MediaPlayer.create(getApplicationContext(),R.raw.peacock);
                    mv.start();
                }if(z==5)
                {
                    mv.stop();
                    mv=MediaPlayer.create(getApplicationContext(),R.raw.rooster);
                    mv.start();
                }if(z==6)
                {
                    mv.stop();
                    mv=MediaPlayer.create(getApplicationContext(),R.raw.crow);
                    mv.start();
                }if(z==7)
                {
                    mv.stop();
                    mv=MediaPlayer.create(getApplicationContext(),R.raw.hawk);
                    mv.start();
                }if(z==8)
                {
                    mv.stop();
                    mv=MediaPlayer.create(getApplicationContext(),R.raw.chick);
                    mv.start();
                }if(z==9)
                {
                    mv.stop();
                    mv=MediaPlayer.create(getApplicationContext(),R.raw.pegion);
                    mv.start();
                }if(z==10)
                {
                    mv.stop();
                    mv=MediaPlayer.create(getApplicationContext(),R.raw.penquine);
                    mv.start();
                }if(z==11)
                {
                    mv.stop();
                    mv=MediaPlayer.create(getApplicationContext(),R.raw.pelican);
                    mv.start();
                }
                if(z==12)
                {
                    mv.stop();
                    mv=MediaPlayer.create(getApplicationContext(),R.raw.ostrich);
                    mv.start();
                }
                if(z==13)
                {
                    mv.stop();
                    mv=MediaPlayer.create(getApplicationContext(),R.raw.woodpexkr);
                    mv.start();
                }
                if(z==14)
                {
                    mv.stop();
                    mv=MediaPlayer.create(getApplicationContext(),R.raw.vulture);
                    mv.start();
                }








                t4.setText(c[z]);
                t6.setText(f[z]);
                t8.setText(h[z]);
                t10.setText(d[z]);
                t12.setText(p[z]);
                t14.setText(l[z]);
                t16.setText(p1[z]);t4.setTextColor(Color.parseColor(colr[z]));
                t6.setTextColor(Color.parseColor(colr[z]));
                t8.setTextColor(Color.parseColor(colr[z]));
                t10.setTextColor(Color.parseColor(colr[z]));
                t12.setTextColor(Color.parseColor(colr[z]));
                t14.setTextColor(Color.parseColor(colr[z]));t16.setTextColor(Color.parseColor(colr[z]));






            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //ii.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
    }
    @Override
    public void onDestroy() {
        mv.stop();
        mv.release();

        super.onDestroy();

    }
    @Override
    public void onBackPressed()
    {   mv.stop();
        Intent m= new Intent(this,Main2Activity.class);
        startActivity(m);
    }

}
