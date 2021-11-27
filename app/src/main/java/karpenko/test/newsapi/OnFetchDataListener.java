package karpenko.test.newsapi;

import java.util.List;

import karpenko.test.newsapi.Models.NewsHeadlines;

public interface OnFetchDataListener<NewsApiResponse> {

     void onFetchData(List<NewsHeadlines> list, String message);
     void onError(String message);

}
