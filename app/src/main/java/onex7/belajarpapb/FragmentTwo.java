package onex7.belajarpapb;

import android.content.Intent;
import android.net.Uri;
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

public class FragmentTwo extends android.app.Fragment implements View.OnClickListener {

    TextView editTextFragment2;
    Button buttonFragment2;

    public FragmentTwo() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_two, container, false);

        editTextFragment2 = (TextView) view.findViewById(R.id.editTextFragment2);
        buttonFragment2 = (Button) view.findViewById(R.id.btnFragment2);

        buttonFragment2.setOnClickListener(this);

        editTextFragment2.setText(Fragment.getNumber());

        return view;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnFragment2) {
            Intent phone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + editTextFragment2.getText().toString().trim()));
            startActivity(phone);
        }
    }
}
