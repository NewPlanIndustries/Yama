package com.newplanindustries.yama.helpers;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

import com.newplanindustries.yama.adapters.ConversationList.ConversationListItem;

import java.util.ArrayList;

public class ConversationHelper {

    public static ArrayList<ConversationListItem> getConversations(Context context) {
        ArrayList<ConversationListItem> conversations = new ArrayList<>();
        Cursor smsCursor = context.getContentResolver().query(Uri.parse("content://sms/inbox"), null, null, null, null);

        int columnBody = smsCursor.getColumnIndex("body");
        int columnAddress = smsCursor.getColumnIndex("address");

        if (!(columnBody < 0 || !smsCursor.moveToFirst())) {
            do {
                conversations.add(new ConversationListItem(
                        smsCursor.getString(columnAddress),
                        smsCursor.getString(columnBody)
                ));
            } while (smsCursor.moveToNext());
        }

        return conversations;
    }
}
