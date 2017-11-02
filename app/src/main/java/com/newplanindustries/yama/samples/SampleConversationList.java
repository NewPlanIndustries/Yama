package com.newplanindustries.yama.samples;

import java.util.ArrayList;
import java.util.Locale;

public class SampleConversationList {
    public static ArrayList<String> Conversations = new ArrayList<>();
    static {
        for(int message = 1; message <= 1000; message++) {
            Conversations.add(String.format(Locale.US, "Message %d", message));
        }
    }
}
