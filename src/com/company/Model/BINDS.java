package com.company.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.validation.Valid;
import java.util.List;

public class BINDS {

    @SerializedName("BIND")
    @Expose
    @Valid
    private List<BIND> bIND = null;

    public List<BIND> getBIND() {
        return bIND;
    }

    public void setBIND(List<BIND> bIND) {
        this.bIND = bIND;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}