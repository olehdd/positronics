package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv =(TextView) findViewById(R.id.textView);
       // Button b1 = (Button)findViewById(R.id.button);

 //  b1.setOnClickListener(clicker);
        Button b2 = (Button)findViewById(R.id.alphaButton);
        b2.setOnClickListener(clicker2);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goTo2(button);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Animation anim = AnimationUtils.loadAnimation(this, R.anim.rotator);
            tv.startAnimation(anim);
        }

        return super.onOptionsItemSelected(item);
    }

    public void goTo2(View view) {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
      //  setContentView(R.layout.activity_main_activity2);
        //Log.d("olehd","goto2 call");

    }

    View.OnClickListener clicker = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
 //go to 2
        }
    };
    View.OnClickListener clicker2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ImageView al = (ImageView )findViewById(R.id.myImg);
            Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
            al.startAnimation(alpha);
            Log.d("olehdd","alphabuttonClicked. custom listener");

        }
    };
}
