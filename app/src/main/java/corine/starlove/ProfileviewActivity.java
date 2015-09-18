package corine.starlove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ProfileviewActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private ImageView profilepicture;
    private TextView profilename;
    private TextView profileabout;
    private TextView profilelocation;
    private TextView profilegender;
    private TextView profileheight;
    private TextView profilelookingfor;
    private Spinner ratingspinner;

    private String rating;
    private Integer profilenumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profileview);

        Intent profileIntent = getIntent();

        profilenumber = profileIntent.getExtras().getInt("Picture");
        profilepicture = (ImageView) findViewById(R.id.profile_image);
        switch (profilenumber){
            case 1: profilepicture.setImageResource(R.mipmap.bobafett);
                break;
            case 2: profilepicture.setImageResource(R.mipmap.c3po);
                break;
            case 3: profilepicture.setImageResource(R.mipmap.chewbacca);
                break;
            case 4: profilepicture.setImageResource(R.mipmap.leia);
                break;
            case 5: profilepicture.setImageResource(R.mipmap.padme);
                break;
            case 6: profilepicture.setImageResource(R.mipmap.vader);
                break;
        }

        String name = profileIntent.getExtras().getString("Name");
        profilename = (TextView) findViewById(R.id.name_content);
        profilename.setText(name);

        String about= profileIntent.getExtras().getString("About");
        profileabout = (TextView) findViewById(R.id.about_content);
        profileabout.setText(about);

        String location = profileIntent.getExtras().getString("Location");
        profilelocation = (TextView) findViewById(R.id.location_content);
        profilelocation.setText(location);

        String gender = profileIntent.getExtras().getString("Gender");
        profilegender = (TextView) findViewById(R.id.gender_content);
        profilegender.setText(gender);

        String height = profileIntent.getExtras().getString("Height");
        profileheight = (TextView) findViewById(R.id.height_content);
        profileheight.setText(height);

        String lookingfor = profileIntent.getExtras().getString("Lookingfor");
        profilelookingfor = (TextView) findViewById(R.id.lookingfor_content);
        profilelookingfor.setText(lookingfor);

        rating = profileIntent.getExtras().getString("Rating");

        ratingspinner = (Spinner) findViewById(R.id.rate_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.rate_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ratingspinner.setAdapter(adapter);
        ratingspinner.setOnItemSelectedListener(this);

        int index = 0;
        for(int i = 0; i<ratingspinner.getCount(); i ++){
            if (ratingspinner.getItemAtPosition(i).equals(rating)){
                index = i;
            }
        }
        ratingspinner.setSelection(index);

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
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        rating = (String) parent.getItemAtPosition(position);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // don't need to do anything
    }

    public void onSendRate(View view) {

        Intent goingBack = new Intent();
        goingBack.putExtra("rating", rating);
        goingBack.putExtra("profilenumber", profilenumber);

        setResult(RESULT_OK, goingBack);
        finish();

    }
}
