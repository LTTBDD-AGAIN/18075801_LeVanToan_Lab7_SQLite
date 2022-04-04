package com.example.a17075801_levantoan_lab7_sqlite.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.a17075801_levantoan_lab7_sqlite.R;
import com.example.a17075801_levantoan_lab7_sqlite.handler.DatabaseContactHandler;
import com.example.a17075801_levantoan_lab7_sqlite.model.Contact;

import java.util.List;

public class ContactAdapter extends BaseAdapter {
    private Context mContext;
    private int mIdLayout;
    private List<Contact> mListContact;
    private int positionSelected = -1;

    public ContactAdapter(Context context, int idLayout, List<Contact> listContact){
        this.mContext = context;
        this.mIdLayout = idLayout;
        this.mListContact = listContact;
    }

    @Override
    public int getCount() {
        if (mListContact.size() != 0 && !mListContact.isEmpty()){
            return mListContact.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(mIdLayout,parent,false);
        }

        TextView mTvName = convertView.findViewById(R.id.tvName);
        Contact contact = mListContact.get(position);

        return convertView;
    }
}
