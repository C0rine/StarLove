package corine.starlove;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class OverviewActivity extends AppCompatActivity {

    private ImageButton bobaButton;
    private TextView bobaRating;

    private ImageButton c3poButton;
    private TextView c3poRating;

    private ImageButton chewieButton;
    private TextView chewieRating;

    private ImageButton leiaButton;
    private TextView leiaRating;

    private ImageButton padmeButton;
    private TextView padmeRating;

    private ImageButton vaderButton;
    private TextView vaderRating;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);

        bobaButton = (ImageButton) findViewById(R.id.boba_button);
        bobaRating = (TextView) findViewById(R.id.boba_rating);

        c3poButton = (ImageButton) findViewById(R.id.c3po_button);
        c3poRating = (TextView) findViewById(R.id.c3po_rating);

        chewieButton = (ImageButton) findViewById(R.id.chewbacca_button);
        chewieRating = (TextView) findViewById(R.id.chewbacca_rating);

        leiaButton = (ImageButton) findViewById(R.id.leia_button);
        leiaRating = (TextView) findViewById(R.id.leia_rating);

        padmeButton = (ImageButton) findViewById(R.id.padme_button);
        padmeRating = (TextView) findViewById(R.id.padme_rating);

        vaderButton = (ImageButton) findViewById(R.id.vader_button);
        vaderRating = (TextView) findViewById(R.id.vader_rating);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_overview, menu);
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


    public void openProfileBoba(View view) {

        Intent openProfile = new Intent(this, ProfileviewActivity.class);

        final int result = 1;

        openProfile.putExtra("Picture", 1);
        openProfile.putExtra("Name", getString(R.string.boba_name));
        openProfile.putExtra("About", getString(R.string.boba_about));
        openProfile.putExtra("Location", getString(R.string.boba_location));
        openProfile.putExtra("Gender", getString(R.string.boba_gender));
        openProfile.putExtra("Height", getString(R.string.boba_height));
        openProfile.putExtra("Lookingfor", getString(R.string.boba_lookingfor));

        startActivityForResult(openProfile, result);

    }


    public void openProfileC3po(View view) {

        Intent openProfile = new Intent(this, ProfileviewActivity.class);

        final int result = 1;

        openProfile.putExtra("Picture", 2);
        openProfile.putExtra("Name", getString(R.string.c3po_name));
        openProfile.putExtra("About", getString(R.string.c3po_about));
        openProfile.putExtra("Location", getString(R.string.c3po_location));
        openProfile.putExtra("Gender", getString(R.string.c3po_gender));
        openProfile.putExtra("Height", getString(R.string.c3po_height));
        openProfile.putExtra("Lookingfor", getString(R.string.c3po_lookingfor));

        startActivityForResult(openProfile, result);

    }

    public void openProfileChewie(View view) {

        Intent openProfile = new Intent(this, ProfileviewActivity.class);

        final int result = 1;

        openProfile.putExtra("Picture", 3);
        openProfile.putExtra("Name", getString(R.string.chewie_name));
        openProfile.putExtra("About", getString(R.string.chewie_about));
        openProfile.putExtra("Location", getString(R.string.chewie_location));
        openProfile.putExtra("Gender", getString(R.string.chewie_gender));
        openProfile.putExtra("Height", getString(R.string.chewie_height));
        openProfile.putExtra("Lookingfor", getString(R.string.chewie_lookingfor));

        startActivityForResult(openProfile, result);

    }

    public void openProfileLeia(View view) {

        Intent openProfile = new Intent(this, ProfileviewActivity.class);

        final int result = 1;

        openProfile.putExtra("Picture", 4);
        openProfile.putExtra("Name", getString(R.string.leia_name));
        openProfile.putExtra("About", getString(R.string.leia_about));
        openProfile.putExtra("Location", getString(R.string.leia_location));
        openProfile.putExtra("Gender", getString(R.string.leia_gender));
        openProfile.putExtra("Height", getString(R.string.leia_height));
        openProfile.putExtra("Lookingfor", getString(R.string.leia_lookingfor));

        startActivityForResult(openProfile, result);

    }

    public void openProfilePadme(View view) {

        Intent openProfile = new Intent(this, ProfileviewActivity.class);

        final int result = 1;

        openProfile.putExtra("Picture", 5);
        openProfile.putExtra("Name", getString(R.string.padme_name));
        openProfile.putExtra("About", getString(R.string.padme_about));
        openProfile.putExtra("Location", getString(R.string.padme_location));
        openProfile.putExtra("Gender", getString(R.string.padme_gender));
        openProfile.putExtra("Height", getString(R.string.padme_height));
        openProfile.putExtra("Lookingfor", getString(R.string.padme_lookingfor));

        startActivityForResult(openProfile, result);
    }

    public void openProfileVader(View view) {

        Intent openProfile = new Intent(this, ProfileviewActivity.class);

        final int result = 1;

        openProfile.putExtra("Picture", 6);
        openProfile.putExtra("Name", getString(R.string.vader_name));
        openProfile.putExtra("About", getString(R.string.vader_about));
        openProfile.putExtra("Location", getString(R.string.vader_location));
        openProfile.putExtra("Gender", getString(R.string.vader_gender));
        openProfile.putExtra("Height", getString(R.string.vader_height));
        openProfile.putExtra("Lookingfor", getString(R.string.vader_lookingfor));

        startActivityForResult(openProfile, result);
    }
}
