package onex7.belajarpapb;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Theta on 12/12/2017.
 */

public class bab6 extends android.app.Fragment implements View.OnClickListener {

    Button example;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bab6, container, false);

        example = (Button) view.findViewById(R.id.button6);

        example.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.button6) {
            Intent intent = new Intent(getActivity(), RecyclerView.class);
            startActivity(intent);
        }
    }
}
