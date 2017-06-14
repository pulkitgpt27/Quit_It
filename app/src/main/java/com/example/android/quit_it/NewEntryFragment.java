package com.example.android.quit_it;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

//import com.example.android.miwok.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewEntryFragment extends Fragment {

    private Spinner medical_spinner;
    private Spinner hobby_spinner;

    private String medical_history;
    private String hobby;


    public NewEntryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.new_entry, container, false);

        return rootView;
    }
}


