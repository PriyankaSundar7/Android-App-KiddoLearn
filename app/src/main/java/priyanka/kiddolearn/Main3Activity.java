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
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {
    TypedArray images;
    ImageView itemimages;
    String[] loo,loo1;
    EditText e1;
    TypedArray b;
    TextView tv,t4,tx4,t6,t8,t10,t12,t14,t1;
    String a[];
    String h[],cc[];
    String d[],n[],p[],l[],f[],ad[];
    TextView t3,tx5,tx7,tx9,tx11,tx13,txxx;
    MediaPlayer mb;
   ImageButton ii;
    int z;
    
   // Resources res=getResources();




    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t1=(TextView)findViewById(R.id.t1);
        Toast.makeText(this,"plug-in with Audio jack",Toast.LENGTH_LONG).show();
        t1.setTextColor(Color.parseColor("#37474F"));
        t3=(TextView)findViewById(R.id.t3);
        tx5=(TextView)findViewById(R.id.tx5);
        tx7=(TextView)findViewById(R.id.tx7);
        tx9=(TextView)findViewById(R.id.tx9);
        tx11=(TextView)findViewById(R.id.tx11);
        tx13=(TextView)findViewById(R.id.tx13);
        txxx=(TextView)findViewById(R.id.txxx);
       // ii=(ImageButton)findViewById(R.id.ii);

        //loo1=getResources().getStringArray(R.array.object_adi);

      //  mb=MediaPlayer.create(null,R.raw.);
        // a = getResources().getStringArray(R.array.object_image1);
       // cc=new String[]{"#607D8B","#795548","#FFAB40","#EF9A9A","#FF9800","#607D8B","#EF6C00","#FF6D00","#FFB74D","#9E9D24","#FFD600","#8D6E63"};
        //viewPage
        ad=new String[]{"R.raw.jaguar","R.raw.cat","R.raw.dog","R.raw.lion","R.raw.tiger","R.raw.goat","R.raw.cow","R.raw.monkey","r.raw.fox","R.raw.wolf","R.raw.elephant","R.raw.bear"};

       a= new String[]{"black,yellow","Black,brown,white","white,gray,calico,murmalade,buff","White,brown,black","Black,Cream,Fawn,grey,golden,brown","Grey","Sandle","Tan,brown,grey,yellow,White","Golden,tawny,brown,Blonde","tan,brown,black,red","brown,tan,black,white","Ash,black,brown,grey,white"};
        f= new String[]{"Golden or black spots","fur","tabbies,pointed,Stripes","leathery skin","bicolor,Tricolor","leathery skin type","fur skin","fur skin","mane of hair encircling the neck and head","hairs,spend most their lives in trees","striped fur and powerful body","Fur Skin with Smooth hairs"};
        h=new String[]{"GrassLands,Mountains","Adapt to varity of environments","as like human(domestic)","wooden land,scrub,grassland","Dense tropical forest","dry woodland, mountainranges(domestic)","Forest and grassland(domestic)","tropical forest,grassland and mountainous plains","wooden areas & urban parks","10grassplains and woodland","11forest and flood plain","12forest and mountain regions"};
        d=new String[]{"Carnivores","omnivore","omnivore","herbivore","carnivore","herbivore","carnivore","herbivore","carnivore","omnivores","carnivore","carnivore"};
        n=new String[]{"Cub","cub","Kitten","calf","puppy,pup","calf","kid,cub,pup","kid,billy","cub","infant","cub","pups"};
        p=new String[]{"wildeBeest,hare","fish,insects,wildcat","small birds","grass,seeds,flowers","pray drive:cat,squrills","11grass, fruit, root","9rabbit,birds,lizard","6grass,fruit,leaves","4antelope,zebra","8fruits,seeds,insects","5deer,cattle,wildboar","10Deer,Elk,Moose"};
        l=new String[]{"10-12 years","15-13 years","15 years","15-20 years","15 years","55-70 years","3-11 years","10-15 years","8-15 years","10-30 years","18-25 years","10-12 years"};
        images=getResources().obtainTypedArray(R.array.object_image);
        loo=getResources().getStringArray(R.array.object_image);
        itemimages=(ImageView)findViewById(R.id.iv1);
        final Spinner s1=(Spinner)findViewById(R.id.s1);
        t4=(TextView)findViewById(R.id.t4);
        tx4=(TextView)findViewById(R.id.tx44);
        t6=(TextView)findViewById(R.id.t6);
        t8=(TextView)findViewById(R.id.t8);
        t10=(TextView)findViewById(R.id.t10);
        t12=(TextView)findViewById(R.id.t12);
        t14=(TextView)findViewById(R.id.t14);
        tv=(TextView)findViewById(R.id.textView3);
        b = getResources().obtainTypedArray(R.array.object_image1);
        ArrayAdapter<String> sa=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,loo);
        sa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(sa);
        List<String> an=new ArrayList<String>();
        an.add("Black Cheetah");
        an.add("bear");
        an.add("Cat");
        an.add("cow");
        an.add("Dog");
        an.add("elephant");
        an.add("fox");
        an.add("Goat");
        an.add("Lion");
        an.add("Monkey");
        an.add("Tiger");
        an.add("wolf");
        ArrayAdapter<String> da=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,an);
        da.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(da);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemimages.setImageResource(images.getResourceId(s1.getSelectedItemPosition(),-1));
                 z=s1.getSelectedItemPosition();
                if(z==0)
                {
                    mb=MediaPlayer.create(getApplicationContext(),R.raw.jaguar);
                    mb.start();
                }
                if(z==1)
                {
                    mb.stop();
                    mb=MediaPlayer.create(getApplicationContext(),R.raw.bear);
                    mb.start();
                }
                if(z==2)
                {
                    mb.stop();
                    mb=MediaPlayer.create(getApplicationContext(),R.raw.cat);
                    mb.start();
                }
                if(z==3)
                {
                    mb.stop();
                    mb=MediaPlayer.create(getApplicationContext(),R.raw.cow);
                    mb.start();
                }
                if(z==4)
                {
                    mb.stop();
                    mb=MediaPlayer.create(getApplicationContext(),R.raw.dog);
                    mb.start();
                }
                if(z==5)
                {
                    mb.stop();
                    mb=MediaPlayer.create(getApplicationContext(),R.raw.elephant);
                    mb.start();
                }
                if(z==6)
                {
                    mb.stop();
                    mb=MediaPlayer.create(getApplicationContext(),R.raw.fox);
                    mb.start();
                }
                if(z==7)
                {
                    mb.stop();
                    mb=MediaPlayer.create(getApplicationContext(),R.raw.goat);
                    mb.start();
                }
                if(z==8)
                {
                    mb.stop();
                    mb=MediaPlayer.create(getApplicationContext(),R.raw.lion);
                    mb.start();

                }
                if(z==9)
                {
                    mb.stop();
                    mb=MediaPlayer.create(getApplicationContext(),R.raw.monkey);
                    mb.start();
                }
                if(z==10)
                {
                    mb.stop();
                    mb=MediaPlayer.create(getApplicationContext(),R.raw.tiger);
                    mb.start();
                }
                 if(z==11)
                 {
                     mb.stop();
                     mb=MediaPlayer.create(getApplicationContext(),R.raw.wolf);
                     mb.start();
                 }

                t4.setText(a[z]);
                tx4.setText(f[z]);
                t6.setText(h[z]);
                t8.setText(d[z]);
                t10.setText(n[z]);
                t12.setText(p[z]);
                t14.setText(l[z]);
                t4.setTextColor(Color.parseColor("#00B0FF"));
                tx4.setTextColor(Color.parseColor("#00B0FF"));
                t6.setTextColor(Color.parseColor("#00B0FF"));
                t10.setTextColor(Color.parseColor("#00B0FF"));
                t8.setTextColor(Color.parseColor("#00B0FF"));
                t12.setTextColor(Color.parseColor("#00B0FF"));
                t14.setTextColor(Color.parseColor("#00B0FF"));
                //#00B0FF
             /*   t4.setTextColor(Color.parseColor(cc[z]));
                tx4.setTextColor(Color.parseColor(cc[z]));
                t6.setTextColor(Color.parseColor(cc[z]));t8.setTextColor(Color.parseColor(cc[z]));
                t10.setTextColor(Color.parseColor(cc[z]));t12.setTextColor(Color.parseColor(cc[z]));
                t14.setTextColor(Color.parseColor(cc[z]));*/


                //  t4.setText( a[s1.getId()]);

                //String s=parent.getItemAtPosition(position).toString();
               // tv.setText(s);
               // tv.setHint(b.getResourceId(s1.getSelectedItemPosition(),-1));
                //res.getString(b.getResourceId(s1.getSelectedItemPosition(),-1));
                //String s=res.getString()
                //tv.setText(s);

               // e1.setHint(b.getResourceId(s1.getSelectedItemPosition(),-1));
                //e1.setText((Integer) s1.getSelectedItem());
               // String s=s1.getItemAtPosition(position).toString();
              //  if(s.matches("Others"))
                //{
                  //  e1 = (EditText)findViewById(R.id.e1);
                    //e1.setVisibility(View.VISIBLE);
                    //s= e1.getText().toString();
                //}
                


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
    public void onDestroy() {
        mb.stop();
        mb.release();

        super.onDestroy();

    }
    @Override
    public void onBackPressed()
    {  mb.stop();
         Intent m= new Intent(this,Main2Activity.class);
        startActivity(m);
    }

}
