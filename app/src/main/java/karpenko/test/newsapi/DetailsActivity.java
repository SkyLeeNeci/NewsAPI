package karpenko.test.newsapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import karpenko.test.newsapi.Models.NewsHeadlines;

public class DetailsActivity extends AppCompatActivity {

    NewsHeadlines headlines;
    TextView title_detail, title_detail_author, title_detail_time, title_detail_detail, title_detail_content;
    ImageView img_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        title_detail = findViewById(R.id.title_detail);
        title_detail_author = findViewById(R.id.title_detail_author);
        title_detail_time = findViewById(R.id.title_detail_time);
        title_detail_detail = findViewById(R.id.title_detail_detail);
        title_detail_content = findViewById(R.id.title_detail_content);
        img_detail = findViewById(R.id.img_detail);

        headlines = (NewsHeadlines) getIntent().getSerializableExtra("data");

        title_detail.setText(headlines.getTitle());
        title_detail_author.setText(headlines.getAuthor());
        title_detail_time.setText(headlines.getPublishedAt());
        title_detail_detail.setText(headlines.getDescription());
        title_detail_content.setText(headlines.getContent());
        Picasso.get().load(headlines.getUrlToImage()).into(img_detail);

    }
}