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

import com.example.navigator.models.Institutes;
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

import androidx.recyclerview.widget.RecyclerView;

import com.example.navigator.models.Institutes;
import com.example.navigator.R;

import java.util.List;

public class InstituteAdapter  extends RecyclerView.Adapter<InstituteAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Institutes> list_of_institutes;

    public InstituteAdapter(Context context, List<Institutes> list_of_institutes) {
        this.list_of_institutes = list_of_institutes;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.institute_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(InstituteAdapter.ViewHolder holder, int position) {
        Institutes state = list_of_institutes.get(position);
        holder.imgView.setImageResource(state.getFlagResource());
        //holder.nameView.setText(state.getName());

    }

    @Override
    public int getItemCount() {
        return list_of_institutes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imgView;
        //final TextView nameView;
        ViewHolder(View view){
            super(view);
            imgView = (ImageView)view.findViewById(R.id.img);
            //nameView = (TextView) view.findViewById(R.id.name);

        }
    }
}