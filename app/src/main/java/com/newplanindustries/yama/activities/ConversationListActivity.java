package com.newplanindustries.yama.activities;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.newplanindustries.yama.R;
import com.newplanindustries.yama.adapters.ConversationList.ConversationListAdapter;
import com.newplanindustries.yama.adapters.ConversationList.ConversationListItem;
import com.newplanindustries.yama.helpers.ConversationHelper;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ConversationListActivity extends AppCompatActivity {

    Activity activity;

    @BindView(R.id.conversation_list)
    RecyclerView conversationList;

    ConversationListAdapter conversationListAdapter;

    ArrayList<ConversationListItem> conversations = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = this;
        ButterKnife.bind(activity);

        conversationListAdapter = new ConversationListAdapter(conversations);

        conversationList.setLayoutManager(new LinearLayoutManager(activity));
        conversationList.setAdapter(conversationListAdapter);

        refreshConversationList();
    }

    private void refreshConversationList() {
        conversationListAdapter.update(ConversationHelper.getConversations(activity));
    }
}
