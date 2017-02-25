package in.tech2ground.myapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onKeyDown(int keyCode,KeyEvent event){

        if (keyCode==KeyEvent.KEYCODE_BACK){
            AlertDialog.Builder alertbox=new AlertDialog.Builder(MainActivity.this);
            alertbox.setTitle("you Want to Exit");
            alertbox.setCancelable(false);
            alertbox.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            alertbox.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            alertbox.show();
        }
        return super.onKeyDown(keyCode,event);
    }


    // For Option Menu
    @Override
    public boolean onCreateOptionsMenu(Menu manu){
        getMenuInflater().inflate(R.menu.main, manu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id==R.id.id_profile){
            // Write own logic

            return true;
        }
        if (id==R.id.id_set){

            //Write own logic
            return true;
        }
        return  true;
    }
}
