package com.example.xyzreader.ui.detail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xyzreader.R;

import java.util.List;

public class ArticleDetailAdapter extends RecyclerView.Adapter<ArticleDetailAdapter.ArticleDetailViewHolder> {
    private List<String> list;

    public ArticleDetailAdapter(List<String> bodyList) {
        list = bodyList;
    }

    @NonNull
    @Override
    public ArticleDetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.article_body_item, parent, false);
        return new ArticleDetailViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleDetailViewHolder holder, int position) {
        holder.textView.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ArticleDetailViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        ArticleDetailViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tvArticleBodyItem);
        }
    }
}
