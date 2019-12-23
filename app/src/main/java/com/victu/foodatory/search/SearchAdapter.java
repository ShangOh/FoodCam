package com.victu.foodatory.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.victu.foodatory.R;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.SearchViewHolder> {

    private ArrayList<RecommendationData> recommendationList;
    private Context mContext;


    public SearchAdapter(Context mContext, ArrayList<RecommendationData> recommendList) {
        this.mContext = mContext;
        this.recommendationList = recommendList;
    }


    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recommendation, parent, false);
        SearchViewHolder viewHolder = new SearchViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
        RecommendationData currentItem = recommendationList.get(position);

        holder.mTextView1.setText(currentItem.getName());
    }


    @Override
    public int getItemCount() {
        return recommendationList.size();
    }


    public static class SearchViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView1;


        public SearchViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView1 = itemView.findViewById(R.id.txt_name);
        }
    }


}