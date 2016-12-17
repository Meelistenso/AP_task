package com.company.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.validation.Valid;

public class REASONS {

    @SerializedName("REASON")
    @Expose
    @Valid
    private REASON rEASON;

    public REASON getREASON() {
        return rEASON;
    }

    public void setREASON(REASON rEASON) {
        this.rEASON = rEASON;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}