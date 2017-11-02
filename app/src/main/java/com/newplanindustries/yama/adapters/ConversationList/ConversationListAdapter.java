package com.newplanindustries.yama.adapters.ConversationList;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ConversationListAdapter extends RecyclerView.Adapter<ConversationListViewHolder> {
    ArrayList<ConversationListItem> conversations;

    public ConversationListAdapter(ArrayList<ConversationListItem> conversations) {
        this.conversations = conversations;
    }

    @Override
    public ConversationListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
        return new ConversationListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ConversationListViewHolder holder, int position) {
        holder.text1.setText(conversations.get(position).with);
        holder.text2.setText(conversations.get(position).last);
    }

    @Override
    public int getItemCount() {
        return conversations.size();
    }

    public void update(ArrayList<ConversationListItem> conversations) {
        this.conversations = conversations;
        notifyDataSetChanged();
    }
}
