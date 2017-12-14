package onex7.belajarpapb;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Theta on 12/6/2017.
 */

public class FragmentOne extends android.app.Fragment implements View.OnClickListener {

    TextView textViewFragment1;
    Button buttonFragment1, getNumber;

    public FragmentOne() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one, container, false);

        textViewFragment1 = (TextView) view.findViewById(R.id.textFragment1);
        buttonFragment1 = (Button) view.findViewById(R.id.btnFragment1);
        getNumber = (Button) view.findViewById(R.id.buttonGetNumber);

        buttonFragment1.setOnClickListener(this);
        getNumber.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnFragment1) {

            FragmentManager fragmentManager = getFragmentManager();
            FragmentTwo fragmentTwo = new FragmentTwo();

//            fragmentManager.beginTransaction().add(this, "Fragment One").addToBackStack("").commit();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentContainer,fragmentTwo).addToBackStack("");
            fragmentTransaction.commit();
        } else {
            textViewFragment1.setText(Fragment.getNumber());
        }
    }
}
