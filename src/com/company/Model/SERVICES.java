package com.company.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.validation.Valid;

public class SERVICES {

    @SerializedName("EMAILS")
    @Expose
    @Valid
    private EMAILS eMAILS;
    @SerializedName("LEASED_LINES")
    @Expose
    @Valid
    private LEASEDLINES lEASEDLINES;

    public EMAILS getEMAILS() {
        return eMAILS;
    }

    public void setEMAILS(EMAILS eMAILS) {
        this.eMAILS = eMAILS;
    }

    public LEASEDLINES getLEASEDLINES() {
        return lEASEDLINES;
    }

    public void setLEASEDLINES(LEASEDLINES lEASEDLINES) {
        this.lEASEDLINES = lEASEDLINES;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}