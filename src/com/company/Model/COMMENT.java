package com.company.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class COMMENT {

    @SerializedName("data")
    @Expose
    private String data;
    @SerializedName("who")
    @Expose
    private String who;
    @SerializedName("text")
    @Expose
    private String text;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}