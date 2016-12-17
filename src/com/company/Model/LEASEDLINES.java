package com.company.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.validation.Valid;

public class LEASEDLINES {

    @SerializedName("LEASED_LINE")
    @Expose
    @Valid
    private LEASEDLINE lEASEDLINE;

    public LEASEDLINE getLEASEDLINE() {
        return lEASEDLINE;
    }

    public void setLEASEDLINE(LEASEDLINE lEASEDLINE) {
        this.lEASEDLINE = lEASEDLINE;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}