package com.example.navigator.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigator.R;
import com.example.navigator.models.References;

import java.util.List;


public class ReferencesAdapter extends RecyclerView.Adapter<ReferencesAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<References> list_of_references;

    public ReferencesAdapter(Context context, List<References> list_of_references) {
        this.list_of_references = list_of_references;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.references_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        References reference = list_of_references.get(position);
       // holder.imgView.setImageResource(state.getFlagResource());
        holder.nameView.setText(reference.getName());

    }

    @Override
    public int getItemCount() {
        return list_of_references.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        //final ImageView imgView;
        final TextView nameView;
        ViewHolder(View view){
            super(view);
           // imgView = (ImageView)view.findViewById(R.id.img);
            nameView = (TextView) view.findViewById(R.id.name);

        }
    }
}
