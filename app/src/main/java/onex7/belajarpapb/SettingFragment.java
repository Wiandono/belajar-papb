package onex7.belajarpapb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by Theta on 9/20/2017.
 */

public class SettingFragment extends android.support.v4.app.Fragment implements View.OnClickListener{

    EditText editTextUsername;
    EditText editTextEmail;
    Spinner spinner1;
    Spinner spinner2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_setting, container, false);

        spinner1 = rootView.findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.jabatan_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

        spinner2 = rootView.findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this.getActivity(), R.array.gender_array, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        editTextUsername = rootView.findViewById(R.id.field_username);
        editTextEmail = rootView.findViewById(R.id.field_email);

        Button save = rootView.findViewById(R.id.button_save);
        save.setOnClickListener(this);

        return rootView;

    }

    @Override
    public void onClick(View view) {

        MainFragment.textViewUsername.setText(String.valueOf(editTextUsername.getText()));
        MainFragment.textViewEmail.setText(String.valueOf(editTextEmail.getText()));
        MainFragment.textViewGender.setText(String.valueOf(spinner2.getSelectedItem()));
        MainFragment.textViewJabatan.setText(String.valueOf(spinner1.getSelectedItem()));
    }
}
