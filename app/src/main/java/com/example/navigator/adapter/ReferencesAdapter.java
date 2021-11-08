package com.example.navigator.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigator.NewsPage;
import com.example.navigator.R;
import com.example.navigator.models.NewsCard;
import com.example.navigator.models.References;

import java.util.List;

public class ReferencesAdapter extends RecyclerView.Adapter<ReferencesAdapter.ReferencesViewHolder> {

    Context context;
    List<References> newsCards;

    public ReferencesAdapter(Context context, List<References> newsCards) {
        this.context = context;
        this.newsCards = newsCards;
    }

    /**
     * Устанавливает дизайн всех карточек новостей.
     */
    @NonNull
    @Override
    public ReferencesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cards = LayoutInflater.from(context).inflate(R.layout.references_item, parent, false);
        return new ReferencesAdapter.ReferencesViewHolder(cards);
    }

    /**
     * Подставляет в представление нужные ресурсы.
     */
    @SuppressLint("RecyclerView") // todo убрать
    @Override
    public void onBindViewHolder(@NonNull ReferencesViewHolder holder, int position) {
        holder.newsCardTitle.setText(newsCards.get(position).getName());
        holder.newsCardText.setText(newsCards.get(position).getText());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newsPage = new Intent(context, NewsPage.class);
                newsPage.putExtra("titleNews", newsCards.get(position).getName());
                newsPage.putExtra("textNews", newsCards.get(position).getText());
                context.startActivity(newsPage);
            }
        });
    }

    /**
     * Возвращает размер списка новостей.
     */
    @Override
    public int getItemCount() {
        return newsCards.size();
    }

    /**
     * Представляет элемент дизайна, карточки новостей.
     */
    public static final class ReferencesViewHolder extends RecyclerView.ViewHolder {

        ImageView newsCardImage;
        TextView newsCardTitle, newsCardText;

        public ReferencesViewHolder(@NonNull View itemView) {
            super(itemView);
           // newsCardImage = itemView.findViewById(R.id.newsImage);
            newsCardTitle = itemView.findViewById(R.id.newsTitle);
            newsCardText = itemView.findViewById(R.id.newsText);
        }
    }
}
