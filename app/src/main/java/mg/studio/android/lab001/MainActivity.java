package mg.studio.android.lab001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import mg.studio.android.lab001.R;

public class MainActivity extends AppCompatActivity {
    private ImageView t1;
    private ImageView t2;
    private ImageView t3;
    private ImageView t4;
    private ImageView t5;
    private ImageView t6;
    private ImageView t7;
    private ImageView t8;
    private ImageView t9;
    private ImageView t10;


    private CheckBox CB1;
    private CheckBox CB2;
    private CheckBox CB3;
    private CheckBox CB4;
    private CheckBox CB5;
    private CheckBox CB6;
    private CheckBox CB7;
    private CheckBox CB8;
    private CheckBox CB9;
    private CheckBox CB10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(ImageView)findViewById(R.id.picarms);
        t2=(ImageView)findViewById(R.id.picears);
        t3=(ImageView)findViewById(R.id.piceyes);
        t4=(ImageView)findViewById(R.id.picglasses);
        t5=(ImageView)findViewById(R.id.piceyebrows);
        t6=(ImageView)findViewById(R.id.picmouth);
        t7=(ImageView)findViewById(R.id.pichat);
        t8=(ImageView)findViewById(R.id.picmustache);
        t9=(ImageView)findViewById(R.id.picshoes);
        t10=(ImageView)findViewById(R.id.picnose);



        CB1=(CheckBox)findViewById(R.id.arms);
        CB2=(CheckBox)findViewById(R.id.ears);
        CB3=(CheckBox)findViewById(R.id.eyes);
        CB4=(CheckBox)findViewById(R.id.glasses);
        CB5=(CheckBox)findViewById(R.id.eyebrows);
        CB6=(CheckBox)findViewById(R.id.mouth);
        CB7=(CheckBox)findViewById(R.id.hat);
        CB8=(CheckBox)findViewById(R.id.mustache);
        CB9=(CheckBox)findViewById(R.id.shoes);
        CB10=(CheckBox)findViewById(R.id.nose);


        CB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    t1.setVisibility(View.VISIBLE);
                }else{
                    t1.setVisibility(View.INVISIBLE);
                }
            }
        });

        CB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    t2.setVisibility(View.VISIBLE);
                }else{
                    t2.setVisibility(View.INVISIBLE);
                }
            }
        });

        CB3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    t3.setVisibility(View.VISIBLE);
                }else{
                    t3.setVisibility(View.INVISIBLE);
                }
            }
        });
        CB4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    t4.setVisibility(View.VISIBLE);
                }else{
                    t4.setVisibility(View.INVISIBLE);
                }
            }
        });
        CB5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    t5.setVisibility(View.VISIBLE);
                }else{
                    t5.setVisibility(View.INVISIBLE);
                }
            }
        });


        CB6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    t6.setVisibility(View.VISIBLE);
                }else{
                    t6.setVisibility(View.INVISIBLE);
                }
            }
        });
        CB7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    t7.setVisibility(View.VISIBLE);
                }else{
                    t7.setVisibility(View.INVISIBLE);
                }
            }
        });
        CB8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    t8.setVisibility(View.VISIBLE);
                }else{
                    t8.setVisibility(View.INVISIBLE);
                }
            }
        });
        CB9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    t9.setVisibility(View.VISIBLE);
                }else{
                    t9.setVisibility(View.INVISIBLE);
                }
            }
        });
        CB10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    t10.setVisibility(View.VISIBLE);
                }else{
                    t10.setVisibility(View.INVISIBLE);
                }
            }
        });



    }
}
