package com.company.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.validation.Valid;
import java.util.List;

public class COMMENTS {

    @SerializedName("COMMENT")
    @Expose
    @Valid
    private List<COMMENT> cOMMENT = null;

    public List<COMMENT> getCOMMENT() {
        return cOMMENT;
    }

    public void setCOMMENT(List<COMMENT> cOMMENT) {
        this.cOMMENT = cOMMENT;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}