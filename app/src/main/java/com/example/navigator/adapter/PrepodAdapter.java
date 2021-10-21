package com.example.navigator.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.navigator.Prepodi;
import com.example.navigator.R;

import java.util.List;

public class PrepodAdapter  extends RecyclerView.Adapter<PrepodAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Prepodi> prepods;

    public PrepodAdapter(Context context, List<Prepodi> prepods) {
        this.prepods = prepods;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public PrepodAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.prepod_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PrepodAdapter.ViewHolder holder, int position) {
        Prepodi state = prepods.get(position);
        holder.flagView.setImageResource(state.getFlagResource());
        holder.nameView.setText(state.getName());
        holder.postViev.setText(state.getPost());
    }

    @Override
    public int getItemCount() {
        return prepods.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView flagView;
        final TextView nameView, postViev;
        ViewHolder(View view){
            super(view);
            flagView = (ImageView)view.findViewById(R.id.flag);
            nameView = (TextView) view.findViewById(R.id.name);
            postViev = (TextView) view.findViewById(R.id.post);
        }
    }
}
