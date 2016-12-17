package com.company.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class VIEW {

    @SerializedName("data")
    @Expose
    private String data;
    @SerializedName("who")
    @Expose
    private String who;
    @SerializedName("reason")
    @Expose
    private String reason;

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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}