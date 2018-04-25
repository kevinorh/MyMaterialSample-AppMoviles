package pe.edu.upc.kevin.mymaterialsample.models;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by KEVIN on 24/04/2018.
 */

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {
    }
    public Person(TextView firstNameTextView, TextView lastNameTextView) {
        this.firstName=firstNameTextView.getText().toString();
        this.lastName=lastNameTextView.getText().toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public Bundle toBundle(){
        Bundle bundle=new Bundle();
        bundle.putString("first_name",getFirstName());
        bundle.putString("last_name",getLastName());
        return  bundle;
    }
    public static Person from(Bundle bundel){
        return new Person(
                bundel.getString("first_name"),
                bundel.getString("last_name")
        );
    }
}
