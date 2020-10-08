package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int a=0,b=0,c=0,o=0,l=0,B=0,M=0,S=0;
     boolean is_orange=false;
    boolean is_berry=false;
    boolean is_carrot=false;
    boolean is_lemon=false;
    boolean is_apple=false;
    boolean is_big=false;
    boolean is_mid=false;
    boolean is_small=false;
    public void Big(View v)
    {
        TextView b=(TextView) findViewById(R.id.one_j);
        if(is_mid||is_small)
             Toast.makeText(getApplicationContext(),"لقد اخترت الصنف بالفعل",Toast.LENGTH_SHORT).show();
        else if(!is_big)
        {
            v.setBackgroundColor(Color.parseColor("#d35400"));
            is_big=true;
            b.setText(""+B);
        }
        else {
            v.setBackgroundColor(Color.WHITE);
            is_big = false;
        }
    }
    public  void Mid(View v)
    {
        TextView b=(TextView) findViewById(R.id.one_j);
        if(is_big||is_small)
            Toast.makeText(getApplicationContext(),"لقد اخترت الصنف بالفعل",Toast.LENGTH_SHORT).show();
        else if(!is_mid)
        {
            v.setBackgroundColor(Color.parseColor("#2980b9"));
            is_mid=true;
            b.setText(""+M);
        }
        else
        {
            v.setBackgroundColor(Color.WHITE);
            is_mid=false;
        }
    }
    public void Small(View v)
    {
        TextView b=(TextView) findViewById(R.id.one_j);
        if(is_mid||is_big)
            Toast.makeText(getApplicationContext(),"لقد اخترت الصنف بالفعل",Toast.LENGTH_SHORT).show();
        else if(!is_small)
        {
            v.setBackgroundColor(Color.parseColor("#9b59b6"));
            is_small=true;
            b.setText(""+S);
        }
        else
        {
            v.setBackgroundColor(Color.WHITE);
            is_small=false;
        }
    }
    public void orange(View v)
    {
        TextView or = (TextView) findViewById(R.id.Orange);
        TextView z= (TextView) findViewById(R.id.zero_j);
        if(is_berry||is_apple||is_carrot||is_lemon)
            Toast.makeText(getApplicationContext(),"لقد اخترت نكهة بالفعل",Toast.LENGTH_SHORT).show();
        else if(!is_orange)
        {
            or.setBackgroundColor(Color.RED);
            z.setText(""+ o);
            is_orange=true;
        }
        else
        {
            or.setBackgroundColor(Color.WHITE);
            is_orange=false;
        }
    }
    public  void berry (View v)
    {
        TextView be = (TextView) findViewById(R.id.Berry);
        TextView z= (TextView) findViewById(R.id.zero_j);
        if(is_orange||is_apple||is_carrot||is_lemon)
            Toast.makeText(getApplicationContext(),"لقد اخترت نكهة بالفعل",Toast.LENGTH_SHORT).show();
        else if(!is_berry)
        {
            be.setBackgroundColor(Color.GRAY);
            z.setText(""+b);
            is_berry=true;
        }
        else
        {
            be.setBackgroundColor(Color.WHITE);
            is_berry=false;
        }
    }
    public void apple (View v)
    {
        TextView ap = (TextView) findViewById(R.id.Apple);
        TextView z= (TextView) findViewById(R.id.zero_j);
        if(is_orange||is_berry||is_carrot||is_lemon)
            Toast.makeText(getApplicationContext(),"لقد اخترت نكهة بالفعل",Toast.LENGTH_SHORT).show();
        else if(!is_apple)
        {
            ap.setBackgroundColor(Color.GREEN);
            z.setText(""+a);
            is_apple=true;
        }
        else
        {
            ap.setBackgroundColor(Color.WHITE);
            is_apple=false;
        }
    }
    public void carrot (View v)
    {
        TextView ca = (TextView) findViewById(R.id.Carrot);
        TextView z= (TextView) findViewById(R.id.zero_j);
        if(is_berry||is_apple||is_orange||is_lemon)
            Toast.makeText(getApplicationContext(),"لقد اخترت نكهة بالفعل",Toast.LENGTH_SHORT).show();
        else if(!is_carrot)
        {
            ca.setBackgroundColor(Color.BLUE);
            z.setText(""+c);
            is_carrot=true;
        }
        else
        {
            ca.setBackgroundColor(Color.WHITE);
            is_carrot=false;
        }
    }
    public void lemon (View v)
    {
        TextView le = (TextView) findViewById(R.id.Lemon);
        TextView z= (TextView) findViewById(R.id.zero_j);
        if(is_berry||is_apple||is_carrot||is_orange)
            Toast.makeText(getApplicationContext(),"لقد اخترت نكهة بالفعل",Toast.LENGTH_SHORT).show();
        else if(!is_lemon)
        {
            le.setBackgroundColor(Color.YELLOW);
            z.setText(""+l);
            is_lemon=true;
        }
        else
        {
            le.setBackgroundColor(Color.WHITE);
            is_lemon=false;
        }
    }
         int balance=0;
         int[] pizza =new int[8] ;
         int[] sandwich=new int[15];
         int[] chicken=new int[6];
         int[] shawrma=new int[5];
         int[] juice=new int [10];
         public  void this_order(View v)
         {
             TextView s=(TextView) findViewById(R.id.order);
             String d="";
             d+="الرصيد الكلي :"+ balance +"$\n";
             if(pizza[0]!=0)
                 d+="الفصول الاربعة:"+ pizza[0] + "\n";
             if(pizza[1]!=0)
                 d+="مرغريتا:"+ pizza[1]+ "\n";
             if(pizza[2]!=0)
                 d+="مرتديلا:"+ pizza[2]+ "\n";
             if(pizza[3]!=0)
                 d+="هوت دوغ:"+ pizza[3]+ "\n";
             if(pizza[4]!=0)
                 d+="كلامار:"+ pizza[4]+ "\n";
             if(pizza[5]!=0)
                 d+="دجاج:"+ pizza[5]+ "\n";
             if(pizza[6]!=0)
                 d+="سجق:"+ pizza[6]+ "\n";
             if(sandwich[0]!=0)
                 d+="سندويش شاورما"+ sandwich[0] + "\n";
             if(sandwich[1]!=0)
                 d+="سندويش بطاطا"+ sandwich[1]+ "\n";
             if(sandwich[3]!=0)
                 d+="سندويش تشيز بطاطا"+ sandwich[3]+ "\n";
             if(sandwich[4]!=0)
                 d+="سندويش كريسبي"+ sandwich[4]+ "\n";
             if(sandwich[5]!=0)
                 d+="سندويش سودة"+ sandwich[5]+ "\n";
             if(sandwich[6]!=0)
                 d+="سندويش سكالوب"+ sandwich[6]+ "\n";
             if(sandwich[7]!=0)
                 d+="سندويش همبرغر"+ sandwich[7] + "\n";
             if(sandwich[8]!=0)
                 d+="سندويش تشيز همبرغر"+ sandwich[8]+ "\n";
             if(sandwich[9]!=0)
                 d+="سندويش فاهيتا"+ sandwich[9]+ "\n";
             if(sandwich[10]!=0)
                 d+="سندويش شيش"+ sandwich[10]+ "\n";
             if(sandwich[11]!=0)
                 d+="سندويش سجق"+ sandwich[11]+ "\n";
             if(sandwich[12]!=0)
                 d+="سندويش سوبريم"+ sandwich[12]+ "\n";
             if(sandwich[13]!=0)
                 d+="سندويش نقانق"+ sandwich[13]+ "\n";
             if(shawrma[0]!=0)
                 d+="شاورما فرط"+ shawrma[0]+ "\n";
             if(shawrma[1]!=0)
                 d+="شاورما عربي"+ shawrma[1]+ "\n";
             if(shawrma[2]!=0)
                 d+="شاورما عجل"+ shawrma[2]+ "\n";
             if(shawrma[3]!=0)
                 d+="شاورما تركي"+ shawrma[3]+ "\n";
             if(chicken[0]!=0)
                 d+="فروج مشوي"+ chicken[0]+ "\n";
             if(chicken[1]!=0)
                 d+="فروج بروستد"+ chicken[1]+ "\n";
             if(chicken[2]!=0)
                 d+="فروج مسحب"+ chicken[2]+ "\n";
             if(chicken[3]!=0)
                 d+="فروج عالفحم"+ chicken[3]+ "\n";
             if(chicken[4]!=0)
                 d+="فروج كريسبي"+ chicken[4]+ "\n";
             if(a!=0)
                 d+="عصير تفاح"+ a + "\n";
             if(b!=0)
                 d+="عصير توت"+ b + "\n";
             if(c!=0)
                 d+="عصير جزر"+ c + "\n";
             if(o!=0)
                 d+="عصير برتقال"+ o + "\n";
             if(l!=0)
                 d+="عصير ليمون"+ l + "\n";
             if(B!=0)
                 d+="كولا عائلي"+ B + "\n";
             if(M!=0)
                 d+="كولا وسط"+ M + "\n";
             if(S!=0)
                 d+="كولا صغير"+ S +"\n";
             if(juice[2]!=0)
                 d+="كوكتيل موز وحليب"+ juice[2]+ "\n";
             if(juice[3]!=0)
                 d+="كوكتيل موز وفريز وشوكولا"+ juice[3]+ "\n";
             if(juice[4]!=0)
                 d+="كوكتيل كواج"+ juice[4]+ "\n";
             if(juice[5]!=0)
                 d+="امبراطور هاواي"+ juice[5]+ "\n";
             if(juice[6]!=0)
                 d+="امبراطور بلو كولادا"+ juice[6] + "\n";
             if(juice[7]!=0)
                 d+="امبراطور بولو"+ juice[7] + "\n";
             s.setText(""+ d);
         }
        public void increment_seasone(View v)
        {
            pizza[0]++;
            balance+=2500;
            TextView s= (TextView) findViewById(R.id.zero);
            s.setText(""+ pizza[0]);
        }
    public void decrement_seasone(View v)
    {
        if(pizza[0]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            pizza[0]--;
            balance -= 2500;
            TextView s = (TextView) findViewById(R.id.zero);
            s.setText("" + pizza[0]);
        }
    }
    public void inc_mrg(View v)
    {
        pizza[1]++;
        balance+=4500;
        TextView s= (TextView) findViewById(R.id.one);
        s.setText(""+ pizza[1]);
    }
    public void dec_mrg(View v)
    {
        if(pizza[1]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            pizza[1]--;
            balance -= 4500;
            TextView s = (TextView) findViewById(R.id.one);
            s.setText("" + pizza[1]);
        }
    }
    public void inc_mrtd(View v)
    {
        pizza[2]++;
        balance+=2500;
        TextView s= (TextView) findViewById(R.id.two);
        s.setText(""+ pizza[2]);
    }
    public void dec_mrtd(View v)
    {
        if(pizza[2]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            pizza[2]--;
            balance -= 2500;
            TextView s = (TextView) findViewById(R.id.two);
            s.setText("" + pizza[2]);
        }
    }
    public void inc_hot_dog(View v)
    {
        pizza[3]++;
        balance+=5500;
        TextView s= (TextView) findViewById(R.id.three);
        s.setText(""+ pizza[3]);
    }
    public void dec_hot_dog(View v)
    {
        if (pizza[3]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            pizza[3]--;
            balance -= 5500;
            TextView s = (TextView) findViewById(R.id.three);
            s.setText("" + pizza[3]);
        }
    }
    public void inc_cal(View v)
    {
        pizza[4]++;
        balance+=6000;
        TextView s= (TextView) findViewById(R.id.four);
        s.setText(""+ pizza[4]);
    }
    public void dec_cal(View v)
    {
        if(pizza[4]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            pizza[4]--;
            balance -= 6000;
            TextView s = (TextView) findViewById(R.id.four);
            s.setText("" + pizza[4]);
        }
    }
    public void inc_dg(View v)
    {
        pizza[5]++;
        balance+=4500;
        TextView s= (TextView) findViewById(R.id.five);
        s.setText(""+ pizza[5]);
    }
    public void dec_dg(View v)
    {
        if (pizza[5]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            pizza[5]--;
            balance -= 4500;
            TextView s = (TextView) findViewById(R.id.five);
            s.setText("" + pizza[5]);
        }
    }
    public void inc_sjk(View v)
    {
        pizza[6]++;
        balance+=3500;
        TextView s= (TextView) findViewById(R.id.six);
        s.setText(""+ pizza[6]);
    }
    public void dec_sjk(View v)
    {
        if (pizza[6]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            pizza[6]--;
            balance -= 3500;
            TextView s = (TextView) findViewById(R.id.six);
            s.setText("" + pizza[6]);
        }
    }
    public  void inc_sh_shawrma(View v)
    {
        sandwich[0]++;
        balance+=1500;
        TextView s=(TextView) findViewById(R.id.zerosh);
        s.setText(""+sandwich[0]);
    }
    public  void dec_sh_shawrma(View v)
    {
        if (sandwich[0]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            sandwich[0]--;
            balance -= 1500;
            TextView s = (TextView) findViewById(R.id.zerosh);
            s.setText("" + sandwich[0]);
        }
    }
    public  void inc_sh_potata(View v)
    {
        sandwich[1]++;
        balance+=800;
        TextView s=(TextView) findViewById(R.id.onesh);
        s.setText(""+sandwich[1]);
    }
    public  void dec_sh_potata(View v)
    {
        if (sandwich[1]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            sandwich[1]--;
            balance -= 800;
            TextView s = (TextView) findViewById(R.id.onesh);
            s.setText("" + sandwich[1]);
        }
    }
    public  void inc_shchese(View v)
    {
        sandwich[3]++;
        balance+=1200;
        TextView s=(TextView) findViewById(R.id.threesh);
        s.setText(""+sandwich[3]);
    }
    public  void dec_shchese(View v)
    {
        if (sandwich[3]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else{sandwich[3]--;
        balance-=1200;
        TextView s=(TextView) findViewById(R.id.threesh);
        s.setText(""+sandwich[3]);
        }
    }
    public  void inc_sh_krespi(View v)
    {
        sandwich[4]++;
        balance+=2000;
        TextView s=(TextView) findViewById(R.id.foursh);
        s.setText(""+sandwich[4]);
    }
    public  void dec_sh_krespi(View v)
    {
        if (sandwich[4]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            sandwich[4]--;
            balance -= 2000;
            TextView s = (TextView) findViewById(R.id.foursh);
            s.setText("" + sandwich[4]);
        }
    }
    public  void inc_sh_soda(View v)
    {
        sandwich[5]++;
        balance+=1500;
        TextView s=(TextView) findViewById(R.id.fivesh);
        s.setText(""+sandwich[5]);
    }
    public  void dec_sh_soda(View v)
    {
        if (sandwich[5]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            sandwich[5]--;
            balance -= 1500;
            TextView s = (TextView) findViewById(R.id.fivesh);
            s.setText("" + sandwich[5]);
        }
    }
    public  void inc_sh_skalop(View v)
    {
        sandwich[6]++;
        balance+=2000;
        TextView s=(TextView) findViewById(R.id.sixsh);
        s.setText(""+sandwich[6]);
    }
    public  void dec_sh_skalop(View v)
    {
        if (sandwich[6]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            sandwich[6]--;
            balance -= 2000;
            TextView s = (TextView) findViewById(R.id.sixsh);
            s.setText("" + sandwich[6]);
        }
    }
    public  void inc_sh_humbrger(View v)
    {
            sandwich[7]++;
            balance += 2000;
            TextView s = (TextView) findViewById(R.id.sevensh);
            s.setText("" + sandwich[7]);
    }
    public  void dec_sh_humbrger(View v)
    {
        if (sandwich[7]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            sandwich[7]--;
            balance -= 2000;
            TextView s = (TextView) findViewById(R.id.sevensh);
            s.setText("" + sandwich[7]);
        }
    }
    public  void inc_sh_chesehumbrger(View v)
    {
        sandwich[8]++;
        balance+=2500;
        TextView s=(TextView) findViewById(R.id.eightsh);
        s.setText(""+sandwich[8]);
    }
    public  void dec_sh_chesehumbrger(View v)
    {
        if (sandwich[8]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            sandwich[8]--;
            balance -= 2500;
            TextView s = (TextView) findViewById(R.id.eightsh);
            s.setText("" + sandwich[8]);
        }
    }
    public  void inc_sh_faheta(View v)
    {
        sandwich[9]++;
        balance+=2500;
        TextView s=(TextView) findViewById(R.id.ninesh);
        s.setText(""+sandwich[9]);
    }
    public  void dec_sh_faheta(View v)
    {
        if (sandwich[9]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            sandwich[9]--;
            balance -= 2500;
            TextView s = (TextView) findViewById(R.id.ninesh);
            s.setText("" + sandwich[9]);
        }
    }
    public  void inc_sh_shesh(View v)
    {
        sandwich[10]++;
        balance+=3500;
        TextView s=(TextView) findViewById(R.id.tensh);
        s.setText(""+sandwich[10]);
    }
    public  void dec_sh_shesh(View v)
    {
        if (sandwich[10]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            sandwich[10]--;
            balance -= 3500;
            TextView s = (TextView) findViewById(R.id.tensh);
            s.setText("" + sandwich[10]);
        }
    }
    public  void inc_sh_sjk(View v)
    {
        sandwich[11]++;
        balance+=3000;
        TextView s=(TextView) findViewById(R.id.elevensh);
        s.setText(""+sandwich[11]);
    }
    public  void dec_sh_sjk(View v)
    {
        if (sandwich[11]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else{sandwich[11]--;
        balance-=3000;
        TextView s=(TextView) findViewById(R.id.elevensh);
        s.setText(""+sandwich[11]);
        }
    }
    public  void inc_sh_soprem(View v)
    {
        sandwich[12]++;
        balance+=3000;
        TextView s=(TextView) findViewById(R.id.twelevesh);
        s.setText(""+sandwich[12]);
    }
    public  void dec_sh_soprem(View v)
    {
        if (sandwich[12]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else{sandwich[12]--;
        balance-=3000;
        TextView s=(TextView) findViewById(R.id.twelevesh);
        s.setText(""+sandwich[12]);
        }
    }
    public  void inc_sh_nkank(View v)
    {
        sandwich[13]++;
        balance+=3500;
        TextView s=(TextView) findViewById(R.id.threetensh);
        s.setText(""+sandwich[13]);
    }
    public  void dec_sh_nkank(View v)
    {
        if (sandwich[13]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            sandwich[13]--;
            balance -= 3500;
            TextView s = (TextView) findViewById(R.id.threetensh);
            s.setText("" + sandwich[13]);
        }
    }
    public void inc_chickengrill(View v)
    {
        chicken[0]++;
        balance+=7000;
        TextView s= (TextView) findViewById(R.id.zeroch);
        s.setText(""+ chicken[0]);
    }
    public void dec_chickengrill(View v)
    {
        if (chicken[0]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            chicken[0]--;
            balance -= 7000;
            TextView s = (TextView) findViewById(R.id.zeroch);
            s.setText("" + chicken[0]);
        }
    }
    public void inc_prosted(View v)
    {
        chicken[1]++;
        balance+=8000;
        TextView s= (TextView) findViewById(R.id.onech);
        s.setText(""+ chicken[1]);
    }
    public void dec_prosted(View v)
    {
        if (chicken[1]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            chicken[1]--;
            balance -= 8000;
            TextView s = (TextView) findViewById(R.id.onech);
            s.setText("" + chicken[1]);
        }
    }
    public void inc_mshb(View v)
    {
        chicken[2]++;
        balance+=7500;
        TextView s= (TextView) findViewById(R.id.twoch);
        s.setText(""+ chicken[2]);
    }
    public void dec_mshb(View v)
    {
        if (chicken[2]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            chicken[2]--;
            balance -= 7500;
            TextView s = (TextView) findViewById(R.id.twoch);
            s.setText("" + chicken[2]);
        }
    }
    public void inc_fahm(View v)
    {
        chicken[3]++;
        balance+=7500;
        TextView s = (TextView) findViewById(R.id.threech);
        s.setText("" + chicken[3]);
    }
    public void dec_fahm(View v)
    {
        if (chicken[3]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            chicken[3]--;
            balance -= 7500;
            TextView s = (TextView) findViewById(R.id.threech);
            s.setText("" + chicken[3]);
        }
    }
    public void inc_krespi(View v)
    {
        chicken[4]++;
        balance+=9000;
        TextView s = (TextView) findViewById(R.id.fourch);
        s.setText("" + chicken[4]);
    }
    public void dec_krespi(View v)
    {
        if (chicken[4]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            chicken[4]--;
            balance -= 9000;
            TextView s = (TextView) findViewById(R.id.fourch);
            s.setText("" + chicken[4]);
        }
    }
    public void inc_shawrma(View v)
    {
        shawrma[0]++;
        balance+=15000;
        TextView s= (TextView) findViewById(R.id.zero_shawrma);
        s.setText(""+shawrma[0]);
    }
    public void dec_shawrma(View v)
    {
        if (shawrma[0]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            shawrma[0]--;
            balance -= 15000;
            TextView s = (TextView) findViewById(R.id.zero_shawrma);
            s.setText("" + shawrma[0]);
        }
    }
    public void inc_arabic(View v)
    {
        shawrma[1]++;
        balance+=2500;
        TextView s= (TextView) findViewById(R.id.one_shawrma);
        s.setText(""+shawrma[1]);
    }
    public void dec_arabic(View v)
    {
        if (shawrma[1]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
       else {
            shawrma[1]--;
            balance -= 2500;
            TextView s = (TextView) findViewById(R.id.one_shawrma);
            s.setText("" + shawrma[1]);
        }
    }
    public void inc_cow(View v)
    {
        shawrma[2]++;
        balance+=20000;
        TextView s= (TextView) findViewById(R.id.two_shawrma);
        s.setText(""+shawrma[2]);
    }
    public void dec_cow(View v)
    {
        if (shawrma[2]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            shawrma[2]--;
            balance -= 20000;
            TextView s = (TextView) findViewById(R.id.two_shawrma);
            s.setText("" + shawrma[2]);
        }
    }
    public void inc_turkey(View v)
    {
        shawrma[3]++;
        balance+=16500;
        TextView s= (TextView) findViewById(R.id.three_shawrma);
        s.setText(""+shawrma[3]);
    }
    public void dec_turkey(View v)
    {
        if (shawrma[3]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            shawrma[3]--;
            balance -= 16500;
            TextView s = (TextView) findViewById(R.id.three_shawrma);
            s.setText("" + shawrma[3]);
        }
    }
    public  void inc_juice(View v)
    {
        if(!is_lemon&&!is_carrot&&!is_apple&&!is_berry&&!is_orange)
            Toast.makeText(getApplicationContext(),"عذراً لم يتم اختيار النكهة",Toast.LENGTH_SHORT).show();
        else {
            if(is_orange)
            {o++;balance += 1500;TextView s = (TextView) findViewById(R.id.zero_j);
                s.setText("" + o);}
            else if(is_berry)
            {b++;balance += 1500;TextView s = (TextView) findViewById(R.id.zero_j);
                s.setText("" + b);}
            else if(is_carrot)
            {c++;balance += 1500; TextView s = (TextView) findViewById(R.id.zero_j);
                s.setText("" + c);}
            else if(is_lemon)
            {l++;balance += 1500;TextView s = (TextView) findViewById(R.id.zero_j);
                s.setText("" + l);}
            else if(is_apple)
            {a++;balance += 1500;TextView s = (TextView) findViewById(R.id.zero_j);
                s.setText("" + a);}
        }
    }
    public  void dec_juice(View v)
    {
        if(is_orange&&o!=0)
        {o--;balance -= 1500;TextView s = (TextView) findViewById(R.id.zero_j);
            s.setText("" + o);}
        else if(is_berry&&b!=0)
        {b--;balance -= 1500;TextView s = (TextView) findViewById(R.id.zero_j);
            s.setText("" + b);}
        else if(is_carrot&&c!=0)
        {c--;balance -= 1500; TextView s = (TextView) findViewById(R.id.zero_j);
            s.setText("" + c);}
        else if(is_lemon&&l!=0)
        {l--;balance -= 1500;TextView s = (TextView) findViewById(R.id.zero_j);
            s.setText("" + l);}
        else if(is_apple&&a!=0)
        {a--;balance -= 1500;TextView s = (TextView) findViewById(R.id.zero_j);
            s.setText("" + a);}
        else
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
    }
    public  void inc_cola(View v) {
        if (!is_small && !is_mid &&!is_big)
            Toast.makeText(getApplicationContext(), "عذراً لم يتم اختيار الصنف", Toast.LENGTH_SHORT).show();
        else {
            if (is_big) {
                B++;
                balance += 1500;
                TextView s = (TextView) findViewById(R.id.one_j);
                s.setText("" + B);
            } else if (is_mid) {
                M++;
                balance += 1000;
                TextView s = (TextView) findViewById(R.id.one_j);
                s.setText("" + M);
            } else if (is_small) {
                S++;
                balance += 500;
                TextView s = (TextView) findViewById(R.id.one_j);
                s.setText("" + S);
            }
        }
    }
    public  void dec_cola(View v)
    {
        if(is_big&&B!=0)
        {B--;balance -= 1500;TextView s = (TextView) findViewById(R.id.one_j);
            s.setText("" + B);}
        else if(is_mid&&M!=0)
        {M--;balance -= 1000;TextView s = (TextView) findViewById(R.id.one_j);
            s.setText("" + M);}
        else if(is_small&&S!=0)
        {S--;balance -= 500; TextView s = (TextView) findViewById(R.id.one_j);
            s.setText("" + S);}
        else
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
    }
    public  void inc_coktel_banana(View v)
    {
        juice[2]++;
        balance+=2000;
        TextView s= (TextView) findViewById(R.id.two_j);
        s.setText(""+juice[2]);
    }
    public  void dec_coktel_banana(View v)
    {
        if(juice[2]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            juice[2]--;
            balance -= 2000;
            TextView s = (TextView) findViewById(R.id.two_j);
            s.setText("" + juice[2]);
        }
    }
    public  void inc_coktel_choc(View v)
    {
        juice[3]++;
        balance+=2300;
        TextView s= (TextView) findViewById(R.id.three_j);
        s.setText(""+juice[3]);
    }
    public  void dec_coktel_choc(View v)
    {
        if(juice[3]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            juice[3]--;
            balance -= 2300;
            TextView s = (TextView) findViewById(R.id.three_j);
            s.setText("" + juice[3]);
        }
    }
    public  void inc_koaj(View v)
    {
        juice[4]++;
        balance+=500;
        TextView s= (TextView) findViewById(R.id.four_j);
        s.setText(""+juice[4]);
    }
    public  void dec_koaj(View v)
    {
        if(juice[4]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            juice[4]--;
            balance -= 500;
            TextView s = (TextView) findViewById(R.id.four_j);
            s.setText("" + juice[4]);
        }
    }
    public  void inc_imp_hawai(View v)
    {
        juice[5]++;
        balance+=3000;
        TextView s= (TextView) findViewById(R.id.five_j);
        s.setText(""+juice[5]);
    }
    public  void dec_imp_hawai(View v)
    {
        if(juice[5]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            juice[5]--;
            balance -= 3000;
            TextView s = (TextView) findViewById(R.id.five_j);
            s.setText("" + juice[5]);
        }
    }
    public  void inc_blue_kolada(View v)
    {
        juice[6]++;
        balance+=3500;
        TextView s= (TextView) findViewById(R.id.six_j);
        s.setText(""+juice[6]);
    }
    public  void dec_blue_kolada(View v)
    {
        if(juice[6]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            juice[6]--;
            balance -= 3500;
            TextView s = (TextView) findViewById(R.id.six_j);
            s.setText("" + juice[6]);
        }
    }
    public  void inc_polo(View v)
    {
        juice[7]++;
        balance+=3300;
        TextView s= (TextView) findViewById(R.id.seven_j);
        s.setText(""+juice[7]);
    }
    public  void dec_polo(View v)
    {
        if(juice[7]==0)
            Toast.makeText(getApplicationContext(),"ليس لديك اي كمية",Toast.LENGTH_LONG).show();
        else {
            juice[7]--;
            balance -= 3300;
            TextView s = (TextView) findViewById(R.id.seven_j);
            s.setText("" + juice[7]);
        }
    }
        int num;
        public void click_pizza(View v)
        {
            num=1;
            setContentView(R.layout.content);
        }
        public void click_shawrma(View v)
        {
            num=2;
            setContentView(R.layout.content);
        }
    public void click_chicken(View v)
    {
        num=3;
        setContentView(R.layout.content);
    }
    public void click_sandwich(View v)
    {
        num=4;
        setContentView(R.layout.content);
    }
    public void click_juice(View v)
    {
        num=5;
        setContentView(R.layout.content);
    }
    public void click_order(View v)
    {
        setContentView(R.layout.order_main);
    }
        public void click_content(View v)
        {
          if(num==1)
          {
              setContentView(R.layout.pizza_menu);
              TextView ze= (TextView) findViewById(R.id.zero);
              TextView on= (TextView) findViewById(R.id.one);
              TextView tw= (TextView) findViewById(R.id.two);
              TextView th= (TextView) findViewById(R.id.three);
              TextView fo= (TextView) findViewById(R.id.four);
              TextView fi= (TextView) findViewById(R.id.five);
              TextView si= (TextView) findViewById(R.id.six);
              ze.setText(""+pizza[0]);
              on.setText(""+pizza[1]);
              tw.setText(""+pizza[2]);
              th.setText(""+pizza[3]);
              fo.setText(""+pizza[4]);
              fi.setText(""+pizza[5]);
              si.setText(""+pizza[6]);
          }
          else if(num==2)
          {
              setContentView(R.layout.shawrma_menu);
              TextView ze= (TextView) findViewById(R.id.zero_shawrma);
              TextView on= (TextView) findViewById(R.id.one_shawrma);
              TextView tw= (TextView) findViewById(R.id.two_shawrma);
              TextView th= (TextView) findViewById(R.id.three_shawrma);
              ze.setText(""+shawrma[0]);
              on.setText(""+shawrma[1]);
              tw.setText(""+shawrma[2]);
              th.setText(""+shawrma[3]);
          }
          else if(num==3)
          {
              setContentView(R.layout.chicken);
              TextView ze= (TextView) findViewById(R.id.zeroch);
              TextView on= (TextView) findViewById(R.id.onech);
              TextView tw= (TextView) findViewById(R.id.twoch);
              TextView th= (TextView) findViewById(R.id.threech);
              TextView fo=(TextView) findViewById(R.id.fourch) ;
              ze.setText(""+chicken[0]);
              on.setText(""+chicken[1]);
              tw.setText(""+chicken[2]);
              th.setText(""+chicken[3]);
              fo.setText(""+chicken[4]);
          }
          else if(num==4)
          {
              setContentView(R.layout.sandwich);
              TextView ze= (TextView) findViewById(R.id.zerosh);
              TextView on= (TextView) findViewById(R.id.onesh);
              TextView th= (TextView) findViewById(R.id.threesh);
              TextView fo= (TextView) findViewById(R.id.foursh);
              TextView fi= (TextView) findViewById(R.id.fivesh);
              TextView si= (TextView) findViewById(R.id.sixsh);
              TextView se= (TextView) findViewById(R.id.sevensh);
              TextView ei= (TextView) findViewById(R.id.eightsh);
              TextView ni= (TextView) findViewById(R.id.ninesh);
              TextView te= (TextView) findViewById(R.id.tensh);
              TextView el= (TextView) findViewById(R.id.elevensh);
              TextView twe= (TextView) findViewById(R.id.twelevesh);
              TextView the= (TextView) findViewById(R.id.threetensh);
              ze.setText(""+sandwich[0]);
              on.setText(""+sandwich[1]);
              th.setText(""+sandwich[3]);
              fo.setText(""+sandwich[4]);
              fi.setText(""+sandwich[5]);
              si.setText(""+sandwich[6]);
              se.setText(""+sandwich[7]);
              ei.setText(""+sandwich[8]);
              ni.setText(""+sandwich[9]);
              te.setText(""+sandwich[10]);
              el.setText(""+sandwich[11]);
              twe.setText(""+sandwich[12]);
              the.setText(""+sandwich[13]);
          }
          else if(num==5)
          {
              setContentView(R.layout.juice);
              TextView tw= (TextView) findViewById(R.id.two_j);
              TextView th= (TextView) findViewById(R.id.three_j);
              TextView fo= (TextView) findViewById(R.id.four_j);
              TextView fi= (TextView) findViewById(R.id.five_j);
              TextView si= (TextView) findViewById(R.id.six_j);
              TextView se= (TextView) findViewById(R.id.seven_j);
              tw.setText(""+juice[2]);
              th.setText(""+juice[3]);
              fo.setText(""+juice[4]);
              fi.setText(""+juice[5]);
              si.setText(""+juice[6]);
              se.setText(""+juice[7]);
          }
        }
    public void back_space(View v)
    {
        setContentView(R.layout.content);
    }
    public void back_space_act(View v)
    {
        setContentView(R.layout.activity_main);
    }
}