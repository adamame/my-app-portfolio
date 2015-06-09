package com.adamame.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user touches the button */
    public void onButtonClick(View view) {
        if (view.getId() == R.id.button_spotify_streamer) {
            Toast.makeText(MainActivity.this, R.string.this_button_will_launch_my_spotify_streamer_app, Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.button_scores_app) {
            Toast.makeText(MainActivity.this, R.string.this_button_will_launch_my_scores_app, Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.button_library_app) {
            Toast.makeText(MainActivity.this, R.string.this_button_will_launch_my_library_app, Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.button_build_it_bigger) {
            Toast.makeText(MainActivity.this, R.string.this_button_will_launch_my_build_it_bigger_app, Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.button_xyz_reader) {
            Toast.makeText(MainActivity.this, R.string.this_button_will_launch_my_xyz_reader_app, Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.button_capstone) {
            Toast.makeText(MainActivity.this, R.string.this_button_will_launch_my_capstone_app, Toast.LENGTH_SHORT).show();
        }
    }
}
