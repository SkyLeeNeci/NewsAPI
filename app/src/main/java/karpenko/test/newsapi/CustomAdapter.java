package karpenko.test.newsapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import karpenko.test.newsapi.Models.NewsHeadlines;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    private Context context;
    private List<NewsHeadlines> headlines;
    private SelectListener listener;

    public CustomAdapter(Context context, List<NewsHeadlines> headlines, SelectListener listener) {
        this.context = context;
        this.headlines = headlines;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(context).inflate(R.layout.headline_single_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        holder.title_text.setText(headlines.get(position).getTitle());
        holder.text_source.setText(headlines.get(position).getSource().getName());

        if(headlines.get(position).getUrlToImage()!=null){
            Picasso.get().load(headlines.get(position).getUrlToImage()).into(holder.img_headline);
        }

        holder.cardView.setOnClickListener(v -> listener.OnNewsClicked(headlines.get(position)));

    }

    @Override
    public int getItemCount() {
        return headlines.size();
    }
}
