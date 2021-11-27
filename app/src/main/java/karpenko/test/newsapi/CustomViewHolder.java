package karpenko.test.newsapi;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    TextView title_text, text_source;
    ImageView img_headline;
    CardView cardView;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        title_text = itemView.findViewById(R.id.title_text);
        text_source = itemView.findViewById(R.id.text_source);
        img_headline = itemView.findViewById(R.id.img_headline);
        cardView = itemView.findViewById(R.id.main_container);

    }
}
