package onex7.belajarpapb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Theta on 9/20/2017.
 */

public class MainFragment extends android.support.v4.app.Fragment {

    static String username = "";
    static String email = "";
    static String gender = "";
    static String jabatan = "";

    static TextView textViewUsername;
    static TextView textViewEmail;
    static TextView textViewGender;
    static TextView textViewJabatan;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        textViewUsername = rootView.findViewById(R.id.pp_username);
        textViewEmail = rootView.findViewById(R.id.pp_email);
        textViewGender = rootView.findViewById(R.id.pp_gender);
        textViewJabatan = rootView.findViewById(R.id.pp_jabatan);

        textViewUsername.setText(username);
        textViewEmail.setText(email);
        textViewGender.setText(gender);
        textViewJabatan.setText(jabatan);

        return rootView;
    }
}
