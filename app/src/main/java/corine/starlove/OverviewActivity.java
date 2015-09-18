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
    private String bobaRatingString = "Rating: none";

    private ImageButton c3poButton;
    private TextView c3poRating;
    private String c3poRatingString = "Rating: none";

    private ImageButton chewieButton;
    private TextView chewieRating;
    private String chewieRatingString = "Rating: none";

    private ImageButton leiaButton;
    private TextView leiaRating;
    private String leiaRatingString = "Rating: none";

    private ImageButton padmeButton;
    private TextView padmeRating;
    private String padmeRatingString = "Rating: none";

    private ImageButton vaderButton;
    private TextView vaderRating;
    private String vaderRatingString = "Rating: none";

    private Integer profilenumber;
    private String rating;

    private Bundle bundle = new Bundle();

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
    protected void onSaveInstanceState(Bundle bundle){
        super.onSaveInstanceState(bundle);

        bundle.putString("ratingboba", bobaRatingString);
        bundle.putString("ratingc3po", c3poRatingString);
        bundle.putString("ratingchewie", chewieRatingString);
        bundle.putString("ratingleia", leiaRatingString);
        bundle.putString("ratingpadme", padmeRatingString);
        bundle.putString("ratingvader", vaderRatingString);
    }

    @Override
    protected void onRestoreInstanceState(Bundle bundle){
        super.onRestoreInstanceState(bundle);

        bobaRatingString = bundle.getString("ratingboba");
        bobaRating.setText(bobaRatingString);

        c3poRatingString = bundle.getString("ratingc3po");
        c3poRating.setText(c3poRatingString);

        chewieRatingString = bundle.getString("ratingchewie");
        chewieRating.setText(chewieRatingString);

        leiaRatingString = bundle.getString("ratingleia");
        leiaRating.setText(leiaRatingString);

        padmeRatingString = bundle.getString("ratingpadme");
        padmeRating.setText(padmeRatingString);

        vaderRatingString = bundle.getString("ratingvader");
        vaderRating.setText(vaderRatingString);

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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        profilenumber = data.getIntExtra("profilenumber", 1);
        rating = data.getStringExtra("rating");

        //bobaRating.setText(getString(R.string.c3po_name) + ratedname + rating);

        if (profilenumber == 1){
            bobaRatingString = "Rating: " + rating;
            bobaRating.setText(bobaRatingString);
        }
        else if (profilenumber == 2){
            c3poRatingString = "Rating: " + rating;
            c3poRating.setText(c3poRatingString);
        }
        else if (profilenumber == 3){
            chewieRatingString= "Rating: " + rating;
            chewieRating.setText(chewieRatingString);
        }
        else if (profilenumber == 4){
            leiaRatingString = "Rating: " + rating;
            leiaRating.setText(leiaRatingString);
        }
        else if (profilenumber == 5){
            padmeRatingString = "Rating: " + rating;
            padmeRating.setText(padmeRatingString);
        }
        else if (profilenumber == 6){
            vaderRatingString = "Rating: " + rating;
            vaderRating.setText(vaderRatingString);
        }

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
        openProfile.putExtra("Rating", bobaRatingString);

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
        openProfile.putExtra("Rating", c3poRatingString);

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
        openProfile.putExtra("Rating", chewieRatingString);

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
        openProfile.putExtra("Rating", leiaRatingString);

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
        openProfile.putExtra("Rating", padmeRatingString);

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
        openProfile.putExtra("Rating", vaderRatingString);

        startActivityForResult(openProfile, result);
    }
}
