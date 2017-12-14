package onex7.belajarpapb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;

public class RecyclerView extends AppCompatActivity {

    android.support.v7.widget.RecyclerView mRecyclerView;
    CustomAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        Bitmap android = BitmapFactory.decodeResource(getResources(), R.drawable.android);
        Bitmap iPhone = BitmapFactory.decodeResource(getResources(), R.drawable.iphone);
        Bitmap windowsPhone = BitmapFactory.decodeResource(getResources(), R.drawable.windowsphone);
        Bitmap blackberry = BitmapFactory.decodeResource(getResources(), R.drawable.blackberry);
        Bitmap webOS = BitmapFactory.decodeResource(getResources(), R.drawable.webos);
        Bitmap ubuntu = BitmapFactory.decodeResource(getResources(), R.drawable.ubuntu);
        Bitmap windows7 = BitmapFactory.decodeResource(getResources(), R.drawable.windows7);
        Bitmap macOSX = BitmapFactory.decodeResource(getResources(), R.drawable.macosx);

        ArrayList<Sisop> listOs = new ArrayList<Sisop>();
        // populasikan nama Sisop di sini
        listOs.add(new Sisop("Android", android));
        listOs.add(new Sisop("iPhone", iPhone));
        listOs.add(new Sisop("Windows Phone", windowsPhone));
        listOs.add(new Sisop("Blackberry", blackberry));
        listOs.add(new Sisop("WebOS", webOS));
        listOs.add(new Sisop("Ubuntu", ubuntu));
        listOs.add(new Sisop("Windows 7", windows7));
        listOs.add(new Sisop("macOS X", macOSX));

        mRecyclerView = (android.support.v7.widget.RecyclerView) findViewById(R.id.recyclerview);
        mAdapter = new CustomAdapter(this, listOs);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
