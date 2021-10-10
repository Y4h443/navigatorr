package com.example.navigator.adapter;

/*import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigator.Institutes;
import com.example.navigator.R;
import com.example.navigator.logotip;

import java.util.List;

public class InstituteAdapter extends RecyclerView.Adapter<InstituteAdapter.InstitutesViewHolder> {
    Context context;
    List<Institutes> institutesList;


    public InstituteAdapter(Context context,List<Institutes> institutesList) {
        this.context = context;
        this.institutesList=institutesList;
    }

    @NonNull
    @Override
    public InstitutesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View institutesitems= LayoutInflater.from(context).inflate(R.layout.institute_item,parent,false);
         return new InstituteAdapter.InstitutesViewHolder(institutesitems);
    }

    @Override
    public void onBindViewHolder(@NonNull InstitutesViewHolder holder, int position) {
        int imageId=context.getResources().getIdentifier("ic_"+institutesList.get(position).getImg(),"drawable",context.getPackageName());
        holder.instituteImage.setImageResource(imageId);
        holder.instituteTitle.setText(institutesList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return institutesList.size();
    }

    public static final class InstitutesViewHolder extends RecyclerView.ViewHolder{

        ImageView instituteImage;
        TextView instituteTitle;
        public InstitutesViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    }*/

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.navigator.Institutes;
import com.example.navigator.R;

import java.util.List;

public class InstituteAdapter  extends RecyclerView.Adapter<InstituteAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Institutes> states;

    public InstituteAdapter(Context context, List<Institutes> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.institute_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(InstituteAdapter.ViewHolder holder, int position) {
        Institutes state = states.get(position);
        holder.flagView.setImageResource(state.getFlagResource());
        holder.nameView.setText(state.getName());
        holder.capitalView.setText(state.getCapital());
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView flagView;
        final TextView nameView, capitalView;
        ViewHolder(View view){
            super(view);
            flagView = (ImageView)view.findViewById(R.id.flag);
            nameView = (TextView) view.findViewById(R.id.name);
            capitalView = (TextView) view.findViewById(R.id.capital);
        }
    }
}