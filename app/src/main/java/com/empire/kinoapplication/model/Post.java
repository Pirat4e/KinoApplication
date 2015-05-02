package com.empire.kinoapplication.model;

import java.util.ArrayList;


public class Post {
    private String title;
    private String url;
    private String content;
    private ArrayList<Attachments> attachments;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArrayList<Attachments> getAttachments() {
        return attachments;
    }

    public void setAttachments(ArrayList<Attachments> attachments) {
        this.attachments = attachments;
    }
}
