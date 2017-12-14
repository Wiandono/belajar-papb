package onex7.belajarpapb;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Fragment extends AppCompatActivity implements View.OnClickListener {

    public static String getNumber() {
        return number;
    }

    public static String number;

    EditText editMain;
    Button saveMain, goToFragment1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main2);

        editMain = (EditText) this.findViewById(R.id.editMain);
        saveMain = (Button) this.findViewById(R.id.buttonMain);
        goToFragment1 = (Button) this.findViewById(R.id.buttonFragment1);

        saveMain.setOnClickListener(this);
        goToFragment1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.buttonMain) {
            number = editMain.getText().toString().trim();
        } else {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentOne fragmentOne = new FragmentOne();

//            fragmentManager.beginTransaction().add(this, "Fragment One").addToBackStack("").commit();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentContainer,fragmentOne).addToBackStack("");
            fragmentTransaction.commit();
        }
    }
}
