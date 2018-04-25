package pe.edu.upc.kevin.mymaterialsample.viewcontroller.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import pe.edu.upc.kevin.mymaterialsample.R;
import pe.edu.upc.kevin.mymaterialsample.models.Person;

public class PersonActivity extends AppCompatActivity {
    private TextView firstNameTextView;
    private TextView lastNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        firstNameTextView=(TextView)findViewById(R.id.text_first_name);
        lastNameTextView=(TextView)findViewById(R.id.text_last_name);
        Intent intent=getIntent();
        if(intent ==null)return;
        updateViews(Person.from(intent.getExtras()));


    }
    private void updateViews(Person person){
        firstNameTextView.setText(person.getFirstName());
        lastNameTextView.setText(person.getLastName());
    }

}
