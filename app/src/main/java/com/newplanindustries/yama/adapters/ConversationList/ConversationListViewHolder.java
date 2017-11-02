package com.newplanindustries.yama.adapters.ConversationList;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ConversationListViewHolder extends RecyclerView.ViewHolder {

    @BindView(android.R.id.text1)
    TextView text1;

    @BindView(android.R.id.text2)
    TextView text2;

    public ConversationListViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
