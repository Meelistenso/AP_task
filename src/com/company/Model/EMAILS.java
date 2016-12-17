package com.company.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.validation.Valid;

public class EMAILS {

    @SerializedName("EMAIL")
    @Expose
    @Valid
    private EMAIL eMAIL;

    public EMAIL getEMAIL() {
        return eMAIL;
    }

    public void setEMAIL(EMAIL eMAIL) {
        this.eMAIL = eMAIL;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}