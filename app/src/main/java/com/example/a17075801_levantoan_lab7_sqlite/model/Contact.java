package com.example.a17075801_levantoan_lab7_sqlite.model;

public class Contact {
    private int id;
    private String nameContact;
    private String phoneContact;

    public Contact(int id, String nameContact, String phoneContact) {
        this.id = id;
        this.nameContact = nameContact;
        this.phoneContact = phoneContact;
    }

    public Contact(String nameContact, String phoneContact) {
        this.nameContact = nameContact;
        this.phoneContact = phoneContact;
    }

    public Contact(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public String getPhoneContact() {
        return phoneContact;
    }

    public void setPhoneContact(String phoneContact) {
        this.phoneContact = phoneContact;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", nameContact='" + nameContact + '\'' +
                ", phoneContact='" + phoneContact + '\'' +
                '}';
    }
}
