package com.company.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.validation.Valid;
import java.util.List;

public class SWITCHESINHOUSE {

    @SerializedName("SWITCH")
    @Expose
    @Valid
    private List<SWITCH> sWITCH = null;

    public List<SWITCH> getSWITCH() {
        return sWITCH;
    }

    public void setSWITCH(List<SWITCH> sWITCH) {
        this.sWITCH = sWITCH;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}