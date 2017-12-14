package onex7.belajarpapb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Theta on 11/7/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.customViewHolder> {
    LayoutInflater mInflater;
    ArrayList<Sisop> sisop;

    public CustomAdapter(Context context, ArrayList<Sisop> sisop) {
        this.mInflater = LayoutInflater.from(context);
        this.sisop = sisop;
    }

    class customViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView namaItemView;
        ImageView imageItemView;
        CustomAdapter mAdapter;

        public customViewHolder(View itemView, CustomAdapter adapter) {
            super(itemView);
            // Get the layout
            namaItemView = (TextView) itemView.findViewById(R.id.namaos);
            imageItemView = (ImageView) itemView.findViewById(R.id.logo);
            // Associate with this adapter
            this.mAdapter = adapter;
            // Add click listener, if desired
            imageItemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), namaItemView.getText(), Toast.LENGTH_SHORT).show();
            sisop.remove(getAdapterPosition());
            CustomAdapter.this.notify();
        }
    }

    @Override
    public CustomAdapter.customViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Create view from layout
        View itemView = mInflater.inflate(R.layout.rowview, parent, false);
        return new customViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(CustomAdapter.customViewHolder holder, int position) {
        // Retrieve the data for that position
        Sisop current = sisop.get(position);
        // Add the data to the view
        holder.namaItemView.setText(current.nama);
        holder.imageItemView.setImageBitmap(current.foto);
        // add the Listener to the view of that position if desired
    }

    @Override
    public int getItemCount() {
        // Return the number of
        // data items to display
        return sisop.size();
    }
}