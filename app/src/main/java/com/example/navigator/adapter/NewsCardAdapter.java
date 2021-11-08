package com.example.navigator.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
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

import java.io.ByteArrayOutputStream;
import java.util.List;

public class NewsCardAdapter extends RecyclerView.Adapter<NewsCardAdapter.NewsCardViewHolder> {

    Context context;
    List<NewsCard> newsCards;

    public NewsCardAdapter(Context context, List<NewsCard> newsCards) {
        this.context = context;
        this.newsCards = newsCards;
    }

    /**
     * Устанавливает дизайн всех карточек новостей.
     */
    @NonNull
    @Override
    public NewsCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cards = LayoutInflater.from(context).inflate(R.layout.news_cards, parent, false);
        return new NewsCardAdapter.NewsCardViewHolder(cards);
    }

    /**
     * Подставляет в представление нужные ресурсы.
     */
    @Override
    public void onBindViewHolder(@NonNull NewsCardViewHolder holder, int position) {
        Bitmap image = newsCards.get(position).getImg().get(0);
        holder.newsCardImage.setImageBitmap(image);
        holder.newsCardTitle.setText(newsCards.get(position).getTitle());
        holder.newsCardText.setText(newsCards.get(position).getText());

        holder.itemView.setOnClickListener(view -> {
            Intent newsPage = new Intent(context, NewsPage.class);
            newsPage.putExtra("titleNews", newsCards.get(position).getTitle());
            newsPage.putExtra("textNews", newsCards.get(position).getText());

            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            image.compress(Bitmap.CompressFormat.JPEG, 50, stream);
            newsPage.putExtra("imageNews", stream.toByteArray());
            context.startActivity(newsPage);
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
    public static final class NewsCardViewHolder extends RecyclerView.ViewHolder {

        ImageView newsCardImage;
        TextView newsCardTitle, newsCardText;

        public NewsCardViewHolder(@NonNull View itemView) {
            super(itemView);
            newsCardImage = itemView.findViewById(R.id.newsImage);
            newsCardTitle = itemView.findViewById(R.id.newsTitle);
            newsCardText = itemView.findViewById(R.id.newsText);
        }
    }
}
