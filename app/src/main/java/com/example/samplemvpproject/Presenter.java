package com.example.samplemvpproject;

import android.view.View;

public class Presenter {

    private Model model;
    private View view;

    public Presenter(View view)
    {
        this.model = new Model();
        this.view = view;
    }

    public void updatename(String name)
    {
        model.setName(name);
        view.updatename(model.getName());

    }

    public void  updateemail(String email)
    {
        model.setEmail(email);
        view.updateemail(model.getEmail());
    }

    public void updatecontact(String contact)
    {
        model.setContact(contact);
        view.updatecontact(model.getContact());

    }

    public interface View
    {
        public void updatename(String name);
        public void updateemail(String email);
        public void updatecontact(String contact);

    }

}
