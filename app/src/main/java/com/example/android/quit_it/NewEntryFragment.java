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
        View rootView=inflater.inflate(R.layout.new_entry,container,false);
        medical_spinner=(Spinner) rootView.findViewById(R.id.spinner_medical);
        hobby_spinner=(Spinner)rootView.findViewById(R.id.spinner_Hobby);
        medical_history="NONE";
        setupSpinnerMedical();
        setupSpinnerHobby();
        return rootView;
    }

    private void setupSpinnerHobby() {
        ArrayAdapter hobbySpinnerAdapter=ArrayAdapter.createFromResource(getActivity(),R.array.array_hobby_options, android.R.layout.simple_spinner_item);

        hobbySpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        hobby_spinner.setAdapter(hobbySpinnerAdapter);
        hobby_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection=(String) parent.getItemAtPosition(position);
                if (!TextUtils.isEmpty(selection)) {
                    if(selection.equals(getString(R.string.hobby_news))){
                        hobby="News";
                    }else if(selection.equals(getString(R.string.hobby_cricket))){
                        hobby="Cricket";
                    }else {
                        hobby="Football";
                    }

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hobby="News";
            }
        });

    }

    private void setupSpinnerMedical() {
        ArrayAdapter medicalSpinnerAdapter=ArrayAdapter.createFromResource(getActivity(),R.array.array_medical_options, android.R.layout.simple_spinner_item);

        medicalSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        medical_spinner.setAdapter(medicalSpinnerAdapter);
        medical_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection=(String) parent.getItemAtPosition(position);
                if (!TextUtils.isEmpty(selection)) {
                    if(selection.equals(getString(R.string.medical_cancer))){
                        medical_history="Cancer";
                    }else if(selection.equals(getString(R.string.medical_Sugar))){
                        medical_history="Sugar";
                    }else {
                        medical_history="Lung_Problem";
                    }

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                medical_history="NONE";
            }
        });

    }
    }
