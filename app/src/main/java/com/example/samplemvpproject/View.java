package com.example.samplemvpproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class View extends AppCompatActivity implements Presenter.View {

    public EditText name, email, contact;
    public TextView nametext, emailtext, contacttext;
    public Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this);



        initviews();

        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                presenter.updatename(name.getText().toString().trim());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                presenter.updateemail(email.getText().toString().trim());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        contact.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                presenter.updatecontact(contact.getText().toString().trim());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    public void initviews()
    {
     name = findViewById(R.id.name);
     email = findViewById(R.id.email);
     contact = findViewById(R.id.contact);

     nametext = findViewById(R.id.nametext);
     emailtext = findViewById(R.id.emailtext);
     contacttext = findViewById(R.id.contacttext);

    }

    @Override
    public void updatename(String name) {
        nametext.setText(name);
    }

    @Override
    public void updateemail(String email) {
        emailtext.setText(email);
    }

    @Override
    public void updatecontact(String contact) {
        contacttext.setText(contact);
    }


}
