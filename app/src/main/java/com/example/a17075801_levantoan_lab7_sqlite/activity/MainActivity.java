package com.example.a17075801_levantoan_lab7_sqlite.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.a17075801_levantoan_lab7_sqlite.R;
import com.example.a17075801_levantoan_lab7_sqlite.adapter.ContactAdapter;
import com.example.a17075801_levantoan_lab7_sqlite.handler.DatabaseContactHandler;
import com.example.a17075801_levantoan_lab7_sqlite.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Contact> listContact;
    private ListView lvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = (ListView) findViewById(R.id.lvContact);

        DatabaseContactHandler contactHandler = new DatabaseContactHandler(this);
        listContact = contactHandler.getAllContacts();
/*
        contactHandler.addContact(new Contact("Nhat","0835023851"));
        contactHandler.addContact(new Contact("Em","0377295226"));
        contactHandler.addContact(new Contact("Me","0835023851"));
        contactHandler.addContact(new Contact("Bo","0835023851"));
        contactHandler.addContact(new Contact("Tet","0835023851"));
        contactHandler.addContact(new Contact("Bac Oanh","0835023851"));
        contactHandler.addContact(new Contact("Minh","0835023851"));
        contactHandler.addContact(new Contact("Trong","0835023851"));
        contactHandler.addContact(new Contact("Duy","0835023851"));
        contactHandler.addContact(new Contact("Luong","0835023851"));
        contactHandler.addContact(new Contact("Thai","0835023851"));
*/
        ContactAdapter adapter = new ContactAdapter(this,R.layout.item_contact_activity,listContact);
        lvContact.setAdapter(adapter);
    }
}