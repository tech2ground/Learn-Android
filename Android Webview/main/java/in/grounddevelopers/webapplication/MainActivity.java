package in.grounddevelopers.webapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button btn1;
Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn_facebook);
        btn2=(Button)findViewById(R.id.btn_google);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_facebook:
                Intent faceintent=new Intent(MainActivity.this,WebActivity.class);
                faceintent.putExtra("uri","http://www.facebook.com");
                startActivity(faceintent);
                break;

            case R.id.btn_google:
                Intent googleintent=new Intent(MainActivity.this,WebActivity.class);
                googleintent.putExtra("uri", "http://www.google.com");
                startActivity(googleintent);
                break;
        }

    }
}
